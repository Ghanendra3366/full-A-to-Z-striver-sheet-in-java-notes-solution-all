add('Linear Search', '''    public static int solve(int[] a,int target){ for(int i=0;i<a.length;i++) if(a[i]==target) return i; return -1; }''', 'System.out.println(solve(new int[]{4,2,4},4));','0',
    'Return the first zero-based index matching target, or -1.', 'Check entries from left to right. A match is first because all earlier entries were already checked.', 'O(n) worst time; O(1) space.', '[4,2,4], target 4: index 0 matches immediately.', 'Empty input returns -1. An unsorted array cannot use binary search safely.')
add('Largest Element', '''    public static int solve(int[] a){ if(a.length==0) throw new IllegalArgumentException("nonempty input required"); int best=a[0]; for(int x:a) best=Math.max(best,x); return best; }''', 'System.out.println(solve(new int[]{-5,-2,-9}));','-2',
    'Return the maximum of a nonempty array.', 'Initialize from a real entry, then maintain the largest processed value.', 'O(n) time; O(1) space.', '-5 -> max(-5,-2)=-2 -> max(-2,-9)=-2.', 'Starting best at zero is wrong for all-negative inputs.', 'Sorting takes O(n log n) and may mutate input unnecessarily.')
add('Second Largest Element', '''    public static OptionalInt solve(int[] a){
        Integer first=null,second=null;
        for(int x:a){ if(first==null || x>first){ second=first; first=x; } else if(x<first && (second==null || x>second)) second=x; }
        return second==null?OptionalInt.empty():OptionalInt.of(second);
    }''', 'System.out.println(solve(new int[]{4,4,2,-1}).getAsInt());','2',
    'Return the second largest DISTINCT value, or OptionalInt.empty if it does not exist.',
    'Maintain largest and second-largest distinct processed values. A new maximum demotes the old maximum; an intermediate distinct value only updates second.',
    'O(n) time; O(1) space.', '4 sets first; duplicate 4 changes nothing; 2 sets second; -1 changes nothing.', 'A sentinel like -1 is ambiguous. MIN_VALUE can be a valid second largest.')
add('Maximum Consecutive Ones', '''    public static int solve(int[] a){ int run=0,best=0; for(int x:a){ run=x==1?run+1:0; best=Math.max(best,run); } return best; }''', 'System.out.println(solve(new int[]{1,1,0,1,1,1}));','3',
    'For a binary array return the longest consecutive run of ones.', 'Keep the length of the suffix consisting only of ones, reset on zero, and record the largest suffix length.', 'O(n) time; O(1) space.', 'Run lengths 1,2,0,1,2,3 give maximum 3.', 'Empty array returns zero; a non-one value is treated as a separator.')
rotate = '''    private static void reverse(int[] a,int l,int r){ while(l<r){ int t=a[l]; a[l++]=a[r]; a[r--]=t; } }
    public static int[] solve(int[] a,int k){
        if(a.length==0) return a; k=Math.floorMod(k,a.length);
        reverse(a,0,k-1); reverse(a,k,a.length-1); reverse(a,0,a.length-1); return a;
    }'''
add('Left Rotate Array by K Places', rotate, 'System.out.println(Arrays.toString(solve(new int[]{1,2,3,4,5},2)));','[3, 4, 5, 1, 2]',
    'Rotate left by k in place. Negative k rotates right; normalize by length.',
    'Split into A (first k) and B (rest). reverse(A), reverse(B), then reverse(all) gives BA, with internal order restored.',
    'O(n) time; O(1) space.', '[1,2]|[3,4,5] -> [2,1]|[5,4,3] -> [3,4,5,1,2].',
    'Handle empty input before modulo. Math.floorMod supports negative k.', 'A temporary output array takes O(n) space. Repeating one-step rotation k times takes O(nk) time.')
add('Left Rotate Array by One', '''    public static int[] solve(int[] a){ if(a.length==0) return a; int first=a[0]; for(int i=1;i<a.length;i++) a[i-1]=a[i]; a[a.length-1]=first; return a; }''', 'System.out.println(Arrays.toString(solve(new int[]{1,2,3})));','[2, 3, 1]',
    'Rotate left by one in place.', 'Save the first value before shifting; place it at the last index.', 'O(n) time and O(1) space.', 'Save 1, shift 2 and 3 left, append saved 1.', 'Empty and singleton arrays need no change.')
add('Move Zeros to End', '''    public static int[] solve(int[] a){ int write=0; for(int x:a) if(x!=0) a[write++]=x; while(write<a.length) a[write++]=0; return a; }''', 'System.out.println(Arrays.toString(solve(new int[]{0,1,0,3,2})));','[1, 3, 2, 0, 0]',
    'Move zeros to the end in place while preserving the order of nonzero entries.', 'Compact nonzero values into a prefix, then fill the remaining suffix with zeros. write never overtakes the read position.', 'O(n) time; O(1) space.', 'write receives 1,3,2 at positions 0,1,2; fill positions 3,4 with zero.', 'The enhanced loop is safe here because writes only affect earlier/current positions.', 'A second array is a simpler O(n)-space approach.')
add('Remove duplicates from sorted array', '''    public static int solve(int[] a){ int write=0; for(int x:a) if(write==0 || a[write-1]!=x) a[write++]=x; return write; }''', 'int[] a={1,1,2,2,3}; int length=solve(a); System.out.println(Arrays.toString(Arrays.copyOf(a,length)));','[1, 2, 3]',
    'For a nondecreasing array, return unique-prefix length and place distinct values in that prefix. Entries beyond the length are unspecified.', 'Adjacent equal values form one block; copy only the first of each block.', 'O(n) time; O(1) space.', '1 copied, next 1 skipped; 2 copied, next 2 skipped; 3 copied.', 'Input MUST be sorted; length zero is valid. Do not print the unused suffix.')
add('Find missing number', '''    public static int solve(int[] a){ int x=a.length; for(int i=0;i<a.length;i++) x^=i^a[i]; return x; }''', 'System.out.println(solve(new int[]{3,0,1}));','2',
    'n distinct values from [0,n] contain exactly one missing value; return it.', 'XOR all indices 0..n and all entries. Each present value appears twice and cancels, leaving the missing one.', 'O(n) time; O(1) space.', '(0^1^2^3)^(3^0^1)=2.', 'Duplicates or values outside [0,n] violate the contract.', 'Summation uses n*(n+1)/2 minus array sum, but widen before multiplication; XOR avoids that arithmetic overflow.')
for title, intersection in [('Union of two sorted arrays',False),('Intersection of two sorted arrays',True)]:
    body = '''List<Integer> result=new ArrayList<>(); int i=0,j=0;
        while(i<a.length && j<b.length){
            if(a[i]==b[j]){ result.add(a[i]); i++; j++; }
            else if(a[i]<b[j]) i++; else j++;
        } return result;''' if intersection else '''List<Integer> result=new ArrayList<>(); int i=0,j=0;
        while(i<a.length || j<b.length){
            int x=j==b.length || (i<a.length && a[i]<=b[j])?a[i++]:b[j++];
            if(result.isEmpty() || result.get(result.size()-1)!=x) result.add(x);
        } return result;'''
    add(title,'    public static List<Integer> solve(int[] a,int[] b){ '+body+' }',
        'System.out.println(solve(new int[]{1,2,2,4},new int[]{2,2,3}));', '[2, 2]' if intersection else '[1, 2, 3, 4]',
        'Return sorted multiset intersection (duplicates appear min(countA,countB) times).' if intersection else 'Return sorted distinct union of two nondecreasing arrays.',
        'Two sorted fronts let us discard the smaller unmatched value for intersection, or emit the smaller available value for union. Each pointer only moves forward.',
        'O(n+m) time; O(output length) space.', 'A=[1,2,2,4], B=[2,2,3]: equal fronts at the two occurrences of 2 contribute intersection; union emits every distinct value once.',
        'Intersection here uses multiplicity; adapt by suppressing equal outputs if the judge asks for set intersection. Both inputs must be sorted.')
add('Majority Element-I', '''    public static OptionalInt solve(int[] a){
        int candidate=0,votes=0; for(int x:a){ if(votes==0) candidate=x; votes+=x==candidate?1:-1; }
        int count=0; for(int x:a) if(x==candidate) count++;
        return count>a.length/2?OptionalInt.of(candidate):OptionalInt.empty();
    }''', 'System.out.println(solve(new int[]{2,2,1,2}).getAsInt());','2',
    'Return the value occurring more than floor(n/2) times, or empty if absent.', 'Boyer-Moore cancels pairs of unequal values. A strict majority cannot be entirely cancelled. A second pass verifies the candidate.', 'O(n) time; O(1) space.', '2 gives vote 1, another 2 gives 2, 1 reduces to 1, final 2 gives 2; count is 3>2.', 'Verification is required unless existence is guaranteed. Empty input returns empty.', 'HashMap counting uses expected O(n) time and O(n) space; sorting uses O(n log n) time.')
add('Leaders in an Array', '''    public static List<Integer> solve(int[] a){ List<Integer> out=new ArrayList<>(); long best=Long.MIN_VALUE; for(int i=a.length-1;i>=0;i--) if(a[i]>best){ out.add(a[i]); best=a[i]; } Collections.reverse(out); return out; }''', 'System.out.println(solve(new int[]{16,17,4,3,5,2}));','[17, 5, 2]',
    'A leader is STRICTLY greater than every value to its right. Return leaders in original order.', 'Scan from the right while maintaining the largest right-side value. A value is a leader exactly when it beats that maximum.', 'O(n) time; O(number of leaders) output space.', 'From right: keep 2, keep 5, skip 3 and 4, keep 17, skip 16; reverse kept list.', 'Some platforms use >= rather than >; this contract is strict. Long.MIN_VALUE allows Integer.MIN_VALUE to be a leader.', 'Brute force checks every right suffix in O(n²) time.')
add('Rearrange array elements by sign', '''    public static int[] solve(int[] a){
        List<Integer> pos=new ArrayList<>(),neg=new ArrayList<>(); for(int x:a) if(x>=0) pos.add(x); else neg.add(x);
        int[] out=new int[a.length]; int p=0,q=0,i=0;
        while(p<pos.size() && q<neg.size()){ out[i++]=pos.get(p++); out[i++]=neg.get(q++); }
        while(p<pos.size()) out[i++]=pos.get(p++); while(q<neg.size()) out[i++]=neg.get(q++); return out;
    }''', 'System.out.println(Arrays.toString(solve(new int[]{3,1,-2,-5,2,-4})));','[3, -2, 1, -5, 2, -4]',
    'Stable alternate nonnegative and negative values, starting nonnegative. If counts differ, append the remaining values. Return a new array.', 'Split into stable sign lists, then weave them. Each sign list preserves its original relative order.', 'O(n) time and O(n) space.', 'pos=[3,1,2], neg=[-2,-5,-4]; weave the corresponding fronts.', 'Zero is classified as nonnegative. Equal sign counts are not required.', 'With exactly equal counts and no zero, write positives to even positions and negatives to odd positions in one pass.')
add('Print the matrix in spiral manner', '''    public static List<Integer> solve(int[][] a){
        List<Integer> out=new ArrayList<>(); if(a.length==0 || a[0].length==0) return out;
        int top=0,bottom=a.length-1,left=0,right=a[0].length-1;
        while(top<=bottom && left<=right){
            for(int c=left;c<=right;c++) out.add(a[top][c]); top++;
            for(int r=top;r<=bottom;r++) out.add(a[r][right]); right--;
            if(top<=bottom){ for(int c=right;c>=left;c--) out.add(a[bottom][c]); bottom--; }
            if(left<=right){ for(int r=bottom;r>=top;r--) out.add(a[r][left]); left++; }
        } return out;
    }''', 'System.out.println(solve(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));','[1, 2, 3, 6, 9, 8, 7, 4, 5]',
    'Return clockwise spiral order of a rectangular matrix.', 'Visit top, right, bottom, left boundaries, then shrink them. Guard bottom and left traversals after shrinking to avoid duplicate visits in a single row or column.', 'O(rows*cols) time and output space; O(1) auxiliary state.', 'Outer ring 1,2,3,6,9,8,7,4; remaining center is 5.', 'Ragged arrays are outside the contract. Empty rows/columns return empty.')
pascal = '''    public static BigInteger choose(int n,int r){
        if(n<0 || r<0 || r>n) throw new IllegalArgumentException(); r=Math.min(r,n-r); BigInteger v=BigInteger.ONE;
        for(int i=1;i<=r;i++) v=v.multiply(BigInteger.valueOf(n-r+i)).divide(BigInteger.valueOf(i)); return v;
    }'''
add("Pascal's Triangle I",pascal+'\n    public static BigInteger solve(int row,int col){ return choose(row-1,col-1); }', 'System.out.println(solve(5,3));','6',
    'Return an entry using ONE-based row and column coordinates.', 'Row r column c equals C(r-1,c-1). The multiplicative formula keeps exact intermediate binomial values.', 'O(min(c-1,r-c)) BigInteger multiply/divide operations; storage grows with result bits.', 'Row 5 is [1,4,6,4,1]; column 3 is C(4,2)=6.', 'Do not mix one-based coordinates with zero-based combinatorial parameters.')
add("Pascal's Triangle II",pascal+'''\n    public static List<BigInteger> solve(int row){ if(row<1) throw new IllegalArgumentException(); List<BigInteger> out=new ArrayList<>(); BigInteger v=BigInteger.ONE; for(int c=0;c<row;c++){ out.add(v); v=v.multiply(BigInteger.valueOf(row-1-c)).divide(BigInteger.valueOf(c+1)); } return out; }''', 'System.out.println(solve(5));','[1, 4, 6, 4, 1]',
    'Return the whole ONE-based row as exact BigIntegers.', 'Start from C(n,0)=1 and use C(n,k+1)=C(n,k)*(n-k)/(k+1). The division is exact.', 'O(row) BigInteger arithmetic operations and O(row) output values; bit cost depends on row.', '1 -> 1*4/1=4 -> 4*3/2=6 -> 6*2/3=4 -> 4*1/4=1.', 'row=1 returns [1]. Large rows overflow int/long, hence BigInteger.')
add("Pascal's Triangle III",'''    public static List<List<BigInteger>> solve(int n){
        if(n<0) throw new IllegalArgumentException(); List<List<BigInteger>> out=new ArrayList<>();
        for(int r=0;r<n;r++){ List<BigInteger> row=new ArrayList<>(); for(int c=0;c<=r;c++) row.add(c==0||c==r?BigInteger.ONE:out.get(r-1).get(c-1).add(out.get(r-1).get(c))); out.add(row); } return out;
    }''', 'System.out.println(solve(4));','[[1], [1, 1], [1, 2, 1], [1, 3, 3, 1]]',
    'Generate the first n rows, n>=0.', 'Boundary cells are one; each interior cell sums the two parents directly above it. Induction on row proves Pascal recurrence.', 'O(n²) BigInteger additions; O(n²) output values, whose bit size grows with row.', 'Rows: [1], [1,1], [1,2,1], then [1,3,3,1].', 'n=0 returns an empty list. Returned rows are separate objects.')
add('Rotate matrix by 90 degrees', '''    public static int[][] solve(int[][] a){ int n=a.length; for(int[] row:a) if(row.length!=n) throw new IllegalArgumentException("square matrix required"); for(int r=0;r<n;r++) for(int c=r+1;c<n;c++){ int t=a[r][c]; a[r][c]=a[c][r]; a[c][r]=t; } for(int[] row:a) for(int l=0,h=n-1;l<h;l++,h--){ int t=row[l]; row[l]=row[h]; row[h]=t; } return a; }''', 'System.out.println(Arrays.deepToString(solve(new int[][]{{1,2},{3,4}})));','[[3, 1], [4, 2]]',
    'Rotate a square matrix clockwise by 90 degrees in place.', 'Transpose maps (r,c) to (c,r); reversing each row then maps to (c,n-1-r), the clockwise position.', 'O(n²) time, O(1) auxiliary space.', '[[1,2],[3,4]] -> transpose [[1,3],[2,4]] -> reverse rows [[3,1],[4,2]].', 'Only transpose above the diagonal; transposing both halves would undo swaps. Rectangular matrices need a new differently shaped array.')
add('Set Matrix Zeroes', '''    public static int[][] solve(int[][] a){
        if(a.length==0 || a[0].length==0) return a;
        int m=a.length,n=a[0].length; boolean firstRow=false,firstCol=false;
        for(int c=0;c<n;c++) if(a[0][c]==0) firstRow=true;
        for(int r=0;r<m;r++) if(a[r][0]==0) firstCol=true;
        for(int r=1;r<m;r++) for(int c=1;c<n;c++) if(a[r][c]==0){ a[r][0]=0; a[0][c]=0; }
        for(int r=1;r<m;r++) for(int c=1;c<n;c++) if(a[r][0]==0 || a[0][c]==0) a[r][c]=0;
        if(firstRow) Arrays.fill(a[0],0); if(firstCol) for(int r=0;r<m;r++) a[r][0]=0; return a;
    }''', 'System.out.println(Arrays.deepToString(solve(new int[][]{{1,1,1},{1,0,1},{1,1,1}})));','[[1, 0, 1], [0, 0, 0], [1, 0, 1]]',
    'For every ORIGINAL zero, set its whole row and column to zero in place. Matrix is rectangular.', 'Use first row/column as markers, while saving whether those original borders themselves need zeroing. Read all interior markers before overwriting the borders.', 'O(mn) time; O(1) auxiliary space.', 'Center zero marks a[1][0] and a[0][1]; interior pass zeros row 1 and column 1.', 'Zeroing immediately while discovering zeros propagates false zeros. Empty matrix is valid.', 'A copy costs O(mn) space; separate row/column flags cost O(m+n) space.')
add('Two Sum', '''    public static int[] solve(int[] a,int target){ Map<Long,Integer> seen=new HashMap<>(); for(int i=0;i<a.length;i++){ Integer j=seen.get((long)target-a[i]); if(j!=null) return new int[]{j,i}; seen.put((long)a[i],i); } return new int[]{-1,-1}; }''', 'System.out.println(Arrays.toString(solve(new int[]{2,7,11,15},9)));','[0, 1]',
    'Return two distinct zero-based indices summing to target, or [-1,-1]. Any pair is acceptable.', 'Before inserting current value, look for its complement among earlier entries. This guarantees different indices.', 'Expected O(n) time and O(n) space.', 'At 2 look for 7 and store index 0; at 7 look for 2 and return [0,1].', 'Widen complement subtraction to long; repeated equal values need two positions.', 'Nested pair enumeration takes O(n²) time and O(1) space. Sorting plus two pointers takes O(n log n) but needs index tracking.')
add('3 Sum', '''    public static List<List<Integer>> solve(int[] input){
        int[] a=input.clone(); Arrays.sort(a); List<List<Integer>> out=new ArrayList<>();
        for(int i=0;i<a.length-2;i++){ if(i>0 && a[i]==a[i-1]) continue; int l=i+1,r=a.length-1;
            while(l<r){ long sum=(long)a[i]+a[l]+a[r]; if(sum<0) l++; else if(sum>0) r--; else { out.add(Arrays.asList(a[i],a[l],a[r])); int x=a[l],y=a[r]; while(l<r && a[l]==x) l++; while(l<r && a[r]==y) r--; } }
        } return out;
    }''', 'System.out.println(solve(new int[]{-1,0,1,2,-1,-4}));','[[-1, -1, 2], [-1, 0, 1]]',
    'Return unique value triples with zero sum, using distinct indices. Input is not mutated.', 'Sort a copy. Fix the first value, then move left/right based on sum. Sorted order proves that when sum is low, increasing left is the only useful direction. Skip equal fixed and endpoint values.', 'O(n²) time after sorting; O(n) copy plus result space.', 'Sorted [-4,-1,-1,0,1,2]; with fixed -1 find (-1,2), then (0,1).', 'Use long sum to avoid int overflow. Unique value triples differ from unique index triples.', 'Enumerating all index triples takes O(n³), plus deduplication storage.')
add('4 Sum', '''    public static List<List<Integer>> solve(int[] input,long target){
        int[] a=input.clone(); Arrays.sort(a); List<List<Integer>> out=new ArrayList<>();
        for(int i=0;i<a.length-3;i++){ if(i>0 && a[i]==a[i-1]) continue;
            for(int j=i+1;j<a.length-2;j++){ if(j>i+1 && a[j]==a[j-1]) continue; int l=j+1,r=a.length-1;
                while(l<r){ long sum=(long)a[i]+a[j]+a[l]+a[r]; if(sum<target) l++; else if(sum>target) r--; else { out.add(Arrays.asList(a[i],a[j],a[l],a[r])); int x=a[l],y=a[r]; while(l<r && a[l]==x) l++; while(l<r && a[r]==y) r--; } }
            }
        } return out;
    }''', 'System.out.println(solve(new int[]{1,0,-1,0,-2,2},0));','[[-2, -1, 1, 2], [-2, 0, 0, 2], [-1, 0, 0, 1]]',
    'Return unique sorted value quadruples summing to target, using four different indices.', 'Fix two sorted positions, then solve two-sum on the suffix. Skip duplicates at both fixed positions and both moving endpoints.', 'O(n³) time, O(n) copy plus output storage.', 'Fix -2,-1 -> need 3, giving 1,2; fix -2,0 -> need 2, giving 0,2.', 'Widen the FIRST addition. Casting a sum after int arithmetic is too late.', 'Four nested loops take O(n⁴); pair-sum hashing can improve time with substantial duplicate/index bookkeeping and O(n²) storage.')
add("Sort an array of 0's 1's and 2's", '''    public static int[] solve(int[] a){ for(int x:a) if(x<0||x>2) throw new IllegalArgumentException(); int low=0,mid=0,high=a.length-1; while(mid<=high){ if(a[mid]==0){ int t=a[low]; a[low++]=a[mid]; a[mid++]=t; } else if(a[mid]==1) mid++; else { int t=a[high]; a[high--]=a[mid]; a[mid]=t; } } return a; }''', 'System.out.println(Arrays.toString(solve(new int[]{2,0,2,1,1,0})));','[0, 0, 1, 1, 2, 2]',
    'Sort an array containing only 0,1,2 in place.', 'Dutch National Flag invariant: [0,low) zeros, [low,mid) ones, [mid,high] unknown, (high,n) twos. Every step shrinks the unknown region.', 'O(n) time; O(1) space.', 'A 2 swaps to the high boundary; recheck the incoming unknown value. A 0 swaps to low, a 1 simply advances mid.', 'Do not advance mid after swapping with high: the incoming element has not been classified.', 'Counting 0/1/2 then overwriting also takes O(n) time and O(1) space, but uses two passes.')
add("Kadane's Algorithm", '''    public static long solve(int[] a){ if(a.length==0) throw new IllegalArgumentException(); long end=a[0],best=a[0]; for(int i=1;i<a.length;i++){ end=Math.max(a[i],end+a[i]); best=Math.max(best,end); } return best; }''', 'System.out.println(solve(new int[]{-2,1,-3,4,-1,2,1,-5,4}));','6',
    'Return the maximum sum of a NONEMPTY contiguous subarray of a nonempty array.', 'Best subarray ending at i either starts at i or extends the best ending at i-1. Global best is the maximum of these ending states.', 'O(n) time; O(1) space.', 'At 4 start a fresh subarray; extend with -1,2,1 to reach 6. The -5 lowers the ending sum but does not erase global best.', 'Initializing best to zero would allow an empty subarray and fail all-negative inputs. Use long sum.', 'Enumerate each start/end with a running sum in O(n²); recomputing each sum would be O(n³).', '''    public static long brute(int[] a){ if(a.length==0) throw new IllegalArgumentException(); long best=Long.MIN_VALUE; for(int l=0;l<a.length;l++){ long sum=0; for(int r=l;r<a.length;r++){ sum+=a[r]; best=Math.max(best,sum); } } return best; }''')
add('Next Permutation', '''    public static int[] solve(int[] a){ int i=a.length-2; while(i>=0 && a[i]>=a[i+1]) i--; if(i>=0){ int j=a.length-1; while(a[j]<=a[i]) j--; int t=a[i]; a[i]=a[j]; a[j]=t; } for(int l=i+1,r=a.length-1;l<r;l++,r--){ int t=a[l]; a[l]=a[r]; a[r]=t; } return a; }''', 'System.out.println(Arrays.toString(solve(new int[]{1,2,3})));','[1, 3, 2]',
    'Mutate to the next lexicographic permutation. If none exists, wrap to the smallest.', 'Find the rightmost ascending pivot. Swap with the smallest greater suffix value, found from the right because the suffix is descending. Reverse the suffix to make the increase minimal.', 'O(n) time; O(1) space.', '[1,2,3]: pivot 2, swap with 3, suffix [2] already minimal.', 'A descending array has no pivot; reverse the entire array. Equal values require >= when finding the pivot.')
add('Majority Element-II', '''    public static List<Integer> solve(int[] a){
        int x=0,y=1,cx=0,cy=0;
        for(int v:a){ if(v==x) cx++; else if(v==y) cy++; else if(cx==0){ x=v; cx=1; } else if(cy==0){ y=v; cy=1; } else { cx--; cy--; } }
        cx=cy=0; for(int v:a){ if(v==x) cx++; else if(v==y) cy++; }
        List<Integer> out=new ArrayList<>(); if(cx>a.length/3) out.add(x); if(cy>a.length/3) out.add(y); Collections.sort(out); return out;
    }''', 'System.out.println(solve(new int[]{1,1,1,2,2,2,3}));','[1, 2]',
    'Return all values occurring more than floor(n/3) times, sorted. At most two values qualify.', 'Cancel triples of distinct values using two candidate counters. A value exceeding n/3 survives cancellation; recount both survivors to verify.', 'O(n) time; O(1) auxiliary space and at most two outputs.', '[1,1,1,2,2,2,3]: candidates 1,2 lose one vote to 3; actual counts both 3>2.', 'Candidate equality checks must precede empty-slot checks. Recount rather than trusting residual votes.', 'HashMap frequency counting is simpler but uses O(n) space.')
add('Find the repeating and missing number', '''    public static int[] solve(int[] a){ boolean[] seen=new boolean[a.length+1]; int repeat=-1; for(int x:a){ if(x<1||x>a.length) throw new IllegalArgumentException(); if(seen[x]) repeat=x; seen[x]=true; } int missing=-1; for(int x=1;x<=a.length;x++) if(!seen[x]) missing=x; return new int[]{repeat,missing}; }''', 'System.out.println(Arrays.toString(solve(new int[]{3,1,2,5,3})));','[3, 4]',
    'Input has n entries from [1,n], exactly one duplicate appearing twice and one missing. Return [repeating,missing].', 'Mark values in a presence array. A repeated mark detects the duplicate; an unmarked number is missing.', 'O(n) time and O(n) space.', '3 is marked twice; index 4 stays unmarked.', 'This simple reference does not validate every structural constraint. Sum-of-squares formulas can overflow long for large n.', 'XOR partitioning by a set bit separates the two anomalies in O(1) space; a final scan identifies which anomaly is repeated.')
merge_pairs = '''    private static long count(int[] a,int[] tmp,int l,int r,boolean reverse){
        if(r-l<2) return 0; int m=l+(r-l)/2; long ans=count(a,tmp,l,m,reverse)+count(a,tmp,m,r,reverse);
        int j=m; for(int i=l;i<m;i++){ while(j<r && (reverse?(long)a[i]>2L*a[j]:a[i]>a[j])) j++; ans+=j-m; }
        int i=l,k=l; j=m; while(i<m && j<r) tmp[k++]=a[i]<=a[j]?a[i++]:a[j++];
        while(i<m) tmp[k++]=a[i++]; while(j<r) tmp[k++]=a[j++]; System.arraycopy(tmp,l,a,l,r-l); return ans;
    }'''
for title, rev in [('Count Inversions',False),('Reverse Pairs',True)]:
    add(title, merge_pairs+'\n    public static long solve(int[] input){ int[] a=input.clone(); return count(a,new int[a.length],0,a.length,%s); }' % str(rev).lower(),
        'System.out.println(solve(new int[]{2,4,3,5,1}));', '3' if rev else '5',
        'Count index pairs i<j with a[i]>2*a[j].' if rev else 'Count index pairs i<j with a[i]>a[j].',
        'Merge sort counts pairs inside both halves recursively. For cross pairs, both halves are sorted; a monotone right pointer counts valid partners for each left value before the merge destroys half boundaries.',
        'O(n log n) time and O(n) space including the copy; return long for pair counts.',
        'For [2,4,3,5,1], reverse pairs are (4,1),(3,1),(5,1); inversions additionally include (2,1),(4,3).',
        'Widen to 2L*a[j] before multiplying. Negative inputs are supported. Count cross pairs before merging.',
        'A double loop over i<j is an O(n²) reference with O(1) auxiliary space.',
        '    public static long brute(int[] a){ long ans=0; for(int i=0;i<a.length;i++) for(int j=i+1;j<a.length;j++) if(%s) ans++; return ans; }' % ('(long)a[i]>2L*a[j]' if rev else 'a[i]>a[j]'))
add('Maximum Product Subarray in an Array', '''    public static BigInteger solve(int[] a){
        if(a.length==0) throw new IllegalArgumentException(); BigInteger hi=BigInteger.valueOf(a[0]),lo=hi,best=hi;
        for(int i=1;i<a.length;i++){ BigInteger x=BigInteger.valueOf(a[i]),p=hi.multiply(x),q=lo.multiply(x); hi=x.max(p).max(q); lo=x.min(p).min(q); best=best.max(hi); } return best;
    }''', 'System.out.println(solve(new int[]{2,3,-2,4}));','6',
    'Return the exact maximum product of a nonempty contiguous subarray.', 'Track both maximum and minimum products ending at each position. Multiplying by a negative swaps the roles of extremes; include the singleton value to allow starting over.', 'O(n) BigInteger multiply operations; bit cost and retained storage depend on product length.', '2 -> hi=6 at 3 -> at -2 hi=-2,lo=-12 -> at 4 hi=4,lo=-48; best remains 6.', 'Zero resets ending products. BigInteger avoids silent overflow for long products.', 'Enumerate all subarrays in O(n²) multiplications for a reference approach.')
add('Merge two sorted arrays without extra space', '''    public static void solve(int[] a,int[] b){
        int total=a.length+b.length;
        for(int gap=(total+1)/2;gap>0;gap=gap==1?0:(gap+1)/2){
            for(int i=0,j=gap;j<total;i++,j++){ int x=i<a.length?a[i]:b[i-a.length],y=j<a.length?a[j]:b[j-a.length];
                if(x>y){ if(i<a.length) a[i]=y; else b[i-a.length]=y; if(j<a.length) a[j]=x; else b[j-a.length]=x; }
            }
        }
    }''', 'int[] a={1,4,8},b={2,3,9}; solve(a,b); System.out.println(Arrays.toString(a)); System.out.println(Arrays.toString(b));','[1, 2, 3]\n[4, 8, 9]',
    'Both arrays are sorted. Rearrange in place so conceptual a followed by b is globally sorted, keeping array lengths fixed.', 'Compare positions separated by a shrinking ceiling-half gap in the conceptual concatenation. The gap method exploits that the two initial runs are sorted; halve until the adjacent pass completes the merge.', 'O((n+m) log(n+m)) time, O(1) auxiliary space.', 'Conceptual [1,4,8,2,3,9]; gap 3 then 2 then 1 moves smaller second-run values into the first run.', 'This gap sequence is a merge technique for two sorted runs, not a general sorting guarantee for arbitrary input. Empty arrays are supported.', 'Merge into a temporary array in O(n+m) time/O(n+m) space. Repeated insertion shifting uses O(nm) time and O(1) space.')
