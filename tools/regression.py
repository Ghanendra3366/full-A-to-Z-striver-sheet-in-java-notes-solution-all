"""Deterministic differential/edge tests against independent small-input references.

Every generated Test.java is compiled together with its standalone Solution.java.
These tests verify algorithms and invariants, rather than reproducing method bodies.
"""
import concurrent.futures
import json
import subprocess
from pathlib import Path

ROOT = Path(__file__).resolve().parents[1]
SUITES = {}
def test(title, body):
    SUITES[title] = body

test("Kadane's Algorithm", '''
    for(int trial=0;trial<2000;trial++){
      int[] a=ints(1+rnd.nextInt(10),-10,10); long ref=Long.MIN_VALUE;
      for(int l=0;l<a.length;l++)for(int r=l;r<a.length;r++){long sum=0;for(int i=l;i<=r;i++)sum+=a[i];ref=Math.max(ref,sum);}
      eq(Solution.solve(a),ref);
    }
    eq(Solution.solve(new int[]{Integer.MAX_VALUE,Integer.MAX_VALUE}),4294967294L);
''')
for title, reverse in [('Count Inversions', False), ('Reverse Pairs', True)]:
    test(title, '''for(int trial=0;trial<2000;trial++){int[] a=ints(rnd.nextInt(12),-5,5);long ref=0;for(int i=0;i<a.length;i++)for(int j=i+1;j<a.length;j++)if(CONDITION)ref++;eq(Solution.solve(a),ref);}'''.replace('CONDITION', '(long)a[i]>2L*a[j]' if reverse else 'a[i]>a[j]'))
for title in ['Selection Sort','Bubble Sort','Insertion Sorting','Merge Sorting','Quick Sorting','Recursive Bubble Sort','Recursive Insertion Sort','Heap Sort']:
    test(title, '''for(int trial=0;trial<250;trial++){int[] a=ints(rnd.nextInt(30),-20,20),ref=a.clone();Arrays.sort(ref);if(!Arrays.equals(Solution.solve(a),ref))throw new AssertionError("sort");}''')
test('Merge two sorted arrays without extra space', '''for(int trial=0;trial<2000;trial++){int[] a=ints(rnd.nextInt(12),-4,4),b=ints(rnd.nextInt(12),-4,4);Arrays.sort(a);Arrays.sort(b);int[] ref=new int[a.length+b.length];System.arraycopy(a,0,ref,0,a.length);System.arraycopy(b,0,ref,a.length,b.length);Arrays.sort(ref);Solution.solve(a,b);int[] actual=new int[ref.length];System.arraycopy(a,0,actual,0,a.length);System.arraycopy(b,0,actual,a.length,b.length);if(!Arrays.equals(actual,ref))throw new AssertionError("gap merge");}''')
for title,xor in [('Count subarrays with given sum',False),('Count subarrays with given xor K',True)]:
    test(title,'''for(int trial=0;trial<2000;trial++){int[] a=ints(rnd.nextInt(12),-4,4);int target=rnd.nextInt(9)-4;long ref=0;for(int l=0;l<a.length;l++){TYPE value=0;for(int r=l;r<a.length;r++){value OP a[r];if(value==target)ref++;}}eq(Solution.solve(a,target),ref);}'''.replace('TYPE','int' if xor else 'long').replace('OP','^=' if xor else '+='))
test('Longest subarray with sum K', '''for(int trial=0;trial<2000;trial++){int[] a=ints(rnd.nextInt(12),-4,4);int k=rnd.nextInt(9)-4,ref=0;for(int l=0;l<a.length;l++){long sum=0;for(int r=l;r<a.length;r++){sum+=a[r];if(sum==k)ref=Math.max(ref,r-l+1);}}eq(Solution.solve(a,k),ref);}''')
test('Next Permutation', '''eq(Arrays.toString(Solution.solve(new int[]{3,2,1})),"[1, 2, 3]");eq(Arrays.toString(Solution.solve(new int[]{1,1,5})),"[1, 5, 1]");eq(Arrays.toString(Solution.solve(new int[0])),"[]");''')
test('Find Pairs with Given Sum in Doubly Linked List', '''for(int trial=0;trial<1000;trial++){int[] a=ints(rnd.nextInt(15),-3,3);Arrays.sort(a);int k=rnd.nextInt(9)-4;TreeSet<String> ref=new TreeSet<>();for(int i=0;i<a.length;i++)for(int j=i+1;j<a.length;j++)if(a[i]+a[j]==k)ref.add(a[i]+":"+a[j]);Set<String> actual=new TreeSet<>();for(List<Integer> pair:Solution.solve(Solution.list(a),k))actual.add(pair.get(0)+":"+pair.get(1));if(!actual.equals(ref))throw new AssertionError("DLL pairs "+Arrays.toString(a));}''')
test('Check if LL is palindrome or not', '''for(int trial=0;trial<1000;trial++){int[] a=ints(rnd.nextInt(15),0,2);Solution.Node h=Solution.list(a);String before=Solution.view(h);boolean ref=true;for(int i=0;i<a.length/2;i++)ref &= a[i]==a[a.length-1-i];eq(Solution.solve(h),ref);eq(Solution.view(h),before);}''')
test('Reverse a Doubly Linked List', '''Solution.Node h=Solution.solve(Solution.list(1,2,3,4));Solution.Node previous=null,tail=null;for(Solution.Node p=h;p!=null;p=p.next){if(p.prev!=previous)throw new AssertionError("prev broken");previous=p;tail=p;}List<Integer> backwards=new ArrayList<>();for(Solution.Node p=tail;p!=null;p=p.prev)backwards.add(p.value);eq(backwards.toString(),"[1, 2, 3, 4]");eq(Solution.solve(null),null);''')
test('Clone a LL with random and next pointer', '''Solution.Node h=Solution.list(1,2,3);h.random=h.next.next;h.next.random=h;h.next.next.random=h.next.next;Solution.Node c=Solution.solve(h);eq(Solution.view(h),"[1, 2, 3]");if(c==h||c.next==h.next||c.random!=c.next.next||c.next.random!=c||c.next.next.random!=c.next.next)throw new AssertionError("clone identity");''')
for title in ['KMP Algorithm or LPS array','Rabin Karp Algorithm']:
    test(title,'''for(int trial=0;trial<2000;trial++){String text=word(rnd.nextInt(18)),pattern=word(rnd.nextInt(6));List<Integer> ref=new ArrayList<>();for(int i=0;i+pattern.length()<=text.length();i++)if(text.substring(i,i+pattern.length()).equals(pattern))ref.add(i);eq(Solution.solve(text,pattern).toString(),ref.toString());}''')
test('Z function', '''for(int trial=0;trial<2000;trial++){String s=word(rnd.nextInt(20));int[] actual=Solution.solve(s);for(int i=1;i<s.length();i++){int ref=0;while(i+ref<s.length()&&s.charAt(ref)==s.charAt(i+ref))ref++;eq(actual[i],ref);}}''')
test('Minimum Window Subsequence', '''for(int trial=0;trial<1000;trial++){String s=word(rnd.nextInt(10)),t=word(1+rnd.nextInt(4));String ref="";int best=Integer.MAX_VALUE;for(int l=0;l<s.length();l++)for(int r=l+1;r<=s.length();r++){int at=0;for(int i=l;i<r&&at<t.length();i++)if(s.charAt(i)==t.charAt(at))at++;if(at==t.length()&&r-l<best){best=r-l;ref=s.substring(l,r);}}eq(Solution.solve(s,t),ref);}''')
test('Minimum Window Substring', '''for(int trial=0;trial<1000;trial++){String s=word(rnd.nextInt(10)),t=word(1+rnd.nextInt(4));String ref="";int best=Integer.MAX_VALUE;for(int l=0;l<s.length();l++)for(int r=l+1;r<=s.length();r++){int[] count=new int[3];for(int i=l;i<r;i++)count[s.charAt(i)-'a']++;for(char c:t.toCharArray())count[c-'a']--;boolean valid=true;for(int c:count)if(c<0)valid=false;if(valid&&r-l<best){best=r-l;ref=s.substring(l,r);}}eq(Solution.solve(s,t),ref);}''')
for title, maximum in [('Sum of Subarray Minimums', False), ('Sum of Subarray Ranges', True)]:
    test(title,'''for(int trial=0;trial<2000;trial++){int[] a=ints(rnd.nextInt(12),0,5);long ref=0;for(int l=0;l<a.length;l++){int lo=Integer.MAX_VALUE,hi=Integer.MIN_VALUE;for(int r=l;r<a.length;r++){lo=Math.min(lo,a[r]);hi=Math.max(hi,a[r]);ref+=VALUE;}}eq(Solution.solve(a),ref);}'''.replace('ref+=VALUE','ref+=' + ('hi-lo' if maximum else 'lo')))
test('Count subsets with sum K', '''for(int trial=0;trial<1000;trial++){int[] a=ints(rnd.nextInt(12),0,3);int target=rnd.nextInt(15),ref=0;for(int mask=0;mask<(1<<a.length);mask++){int sum=0;for(int i=0;i<a.length;i++)if((mask&(1<<i))!=0)sum+=a[i];if(sum==target)ref++;}eq(Solution.solve(a,target),BigInteger.valueOf(ref));}''')
test('Count Palindromic Subsequences', '''for(int trial=0;trial<1000;trial++){String s=word(rnd.nextInt(10));long ref=0;for(int mask=1;mask<(1<<s.length());mask++){StringBuilder p=new StringBuilder();for(int i=0;i<s.length();i++)if((mask&(1<<i))!=0)p.append(s.charAt(i));String text=p.toString();if(text.equals(p.reverse().toString()))ref++;}eq(Solution.solve(s),BigInteger.valueOf(ref));}''')
test('Longest Increasing Subsequence', '''for(int trial=0;trial<1000;trial++){int[] a=ints(rnd.nextInt(12),-3,3);int ref=0;for(int mask=0;mask<(1<<a.length);mask++){int last=0,count=0;boolean ok=true,first=true;for(int i=0;i<a.length;i++)if((mask&(1<<i))!=0){if(!first&&a[i]<=last)ok=false;last=a[i];first=false;count++;}if(ok)ref=Math.max(ref,count);}eq(Solution.solve(a),ref);}''')
test('Bridges in graph', '''eq(Solution.solve(2,new int[][]{{0,1},{0,1}}).toString(),"[]");eq(Solution.solve(5,new int[][]{{0,1},{1,2},{2,0},{3,4}}).toString(),"[[3, 4]]");''')
test('Articulation point in graph', '''eq(Solution.solve(4,new int[][]{{0,1},{0,2},{0,3}}).toString(),"[0]");eq(Solution.solve(3,new int[][]{{0,1},{1,2},{2,0}}).toString(),"[]");''')
test("Dijkstra's algorithm", '''for(int trial=0;trial<300;trial++){int n=1+rnd.nextInt(9);List<int[]> edges=new ArrayList<>();long[][] d=new long[n][n];for(int i=0;i<n;i++){Arrays.fill(d[i],Solution.INF);d[i][i]=0;}for(int i=0;i<n;i++)for(int j=i+1;j<n;j++)if(rnd.nextBoolean()){int w=rnd.nextInt(10);edges.add(new int[]{i,j,w});d[i][j]=d[j][i]=w;}for(int k=0;k<n;k++)for(int i=0;i<n;i++)for(int j=0;j<n;j++)if(d[i][k]!=Solution.INF&&d[k][j]!=Solution.INF)d[i][j]=Math.min(d[i][j],d[i][k]+d[k][j]);for(int source=0;source<n;source++)if(!Arrays.equals(Solution.solve(n,edges.toArray(new int[0][]),source),d[source]))throw new AssertionError("distance");}''')
test('LRU Cache', '''Solution.LRUCache c=new Solution.LRUCache(0);c.put(1,2);eq(c.get(1).isPresent(),false);c=new Solution.LRUCache(2);c.put(1,-1);c.put(2,2);eq(c.get(1).getAsInt(),-1);c.put(3,3);eq(c.get(2).isPresent(),false);c.put(1,8);eq(c.get(1).getAsInt(),8);''')
test('LFU Cache', '''Solution.LFUCache c=new Solution.LFUCache(2);c.put(1,1);c.put(2,2);c.get(1);c.get(2);c.put(3,3);eq(c.get(1).isPresent(),false);eq(c.get(2).getAsInt(),2);c.put(3,8);eq(c.get(3).getAsInt(),8);Solution.LFUCache zero=new Solution.LFUCache(0);zero.put(1,1);eq(zero.get(1).isPresent(),false);''')

PRELUDE = '''import java.util.*;import java.math.BigInteger;
public class Test {static final Random rnd=new Random(20261010);
static int[] ints(int n,int min,int max){int[] a=new int[n];for(int i=0;i<n;i++)a[i]=min+rnd.nextInt(max-min+1);return a;}
static String word(int n){StringBuilder s=new StringBuilder();for(int i=0;i<n;i++)s.append((char)('a'+rnd.nextInt(3)));return s.toString();}
static void eq(Object actual,Object expected){if(!Objects.equals(actual,expected))throw new AssertionError("expected "+expected+", got "+actual);}
static void eq(long actual,long expected){if(actual!=expected)throw new AssertionError("expected "+expected+", got "+actual);}
public static void main(String[] args){BODY System.out.println("PASS");}}
'''

def run(row):
    folder = ROOT / 'build/regression' / row['id']
    folder.mkdir(parents=True, exist_ok=True)
    harness = folder / 'Test.java'
    harness.write_text(PRELUDE.replace('BODY', SUITES[row['title']]), encoding='utf-8')
    source = ROOT / row['path'] / 'Solution.java'
    version = subprocess.run(['javac', '-version'], capture_output=True, text=True, check=True)
    flag = ['-source', '8', '-target', '8'] if 'javac 1.8.' in version.stdout + version.stderr else ['--release', '8']
    compile_result = subprocess.run(['javac'] + flag + ['-encoding','UTF-8','-d',str(folder),str(source),str(harness)], capture_output=True, text=True, timeout=60)
    if compile_result.returncode:
        return row['title'] + '\n' + compile_result.stderr
    result = subprocess.run(['java','-cp',str(folder),'Test'], capture_output=True, text=True, timeout=60)
    return None if result.returncode == 0 else row['title'] + '\n' + result.stderr

if __name__ == '__main__':
    rows = json.loads((ROOT / 'curriculum/manifest.json').read_text(encoding='utf-8'))
    selected = [r for r in rows if r['title'] in SUITES]
    if len(selected) != len(SUITES):
        raise SystemExit('Regression title mismatch in curriculum.')
    with concurrent.futures.ThreadPoolExecutor(max_workers=4) as pool:
        failures = [result for result in pool.map(run, selected) if result]
    for failure in failures:
        print(failure)
    print('%d differential/edge suites; %d failures.' % (len(selected), len(failures)))
    raise SystemExit(bool(failures))

