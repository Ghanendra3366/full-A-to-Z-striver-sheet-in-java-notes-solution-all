add('Count all Digits of a Number', '''    public static int solve(int n) {
        int count = 0;
        do { count++; n /= 10; } while (n != 0);
        return count;
    }''', 'System.out.println(solve(Integer.MIN_VALUE));', '10',
    'Count decimal digits, excluding the sign; zero has one digit.',
    'Har division by 10 last digit hataata hai. A do-while loop handles zero without a special branch. Signed division also works for negative numbers.',
    'O(d) time and O(1) extra space, where d is the digit count.',
    '123: 123 -> 12 -> 1 -> 0, so three divisions count three digits.',
    'Math.abs(Integer.MIN_VALUE) overflows; this implementation never takes abs(int).',
    'String.valueOf(n) also works after excluding the minus sign, but allocates O(d) space. Logarithms need a zero case and can round at powers of ten.')

add('Count number of odd digits in a number', '''    public static int solve(int n) {
        int count = 0;
        while (n != 0) { if ((n % 10) % 2 != 0) count++; n /= 10; }
        return count;
    }''', 'System.out.println(solve(-13520));', '3',
    'Count odd decimal digits of a signed int; zero contributes no odd digit.',
    'Extract n % 10 and test its parity. Negative odd remainders are still nonzero modulo two.',
    'O(d) time; O(1) space.', 'Digits 0,2,5,3,1 contain three odd digits.',
    'Do not check remainder == 1: Java gives -1 for negative odd values.')

add('Reverse a number', '''    public static long solve(int n) {
        long reversed = 0;
        while (n != 0) { reversed = reversed * 10 + n % 10; n /= 10; }
        return reversed;
    }''', 'System.out.println(solve(-120));', '-21',
    'Reverse decimal digits while preserving sign. Return long so every reversed int fits.',
    'Append each last digit to the result: rev * 10 + digit. Remaining n contains exactly the unprocessed digits.',
    'O(d) time and O(1) space.', '-120 gives 0, then -2, then -21.',
    'Trailing zeros disappear. If a judge requires int and zero on overflow, check the long result against Integer.MIN_VALUE/MAX_VALUE before casting.')

add('Palindrome Number', '''    public static boolean solve(int n) {
        if (n < 0) return false;
        long rev = 0; int copy = n;
        do { rev = rev * 10 + copy % 10; copy /= 10; } while (copy != 0);
        return rev == n;
    }''', 'System.out.println(solve(1221));', 'true',
    'Check whether a nonnegative integer reads the same forwards and backwards. Negative inputs are false.',
    'Reverse into long, then compare with the original. Equality means every positional digit matches.',
    'O(d) time, O(1) space.', '1221 reverses through 1 -> 12 -> 122 -> 1221.',
    '0 is a palindrome; 10 is not. A long accumulator avoids overflow.',
    'A half-reversal stops when the unprocessed prefix is no larger than the reversed suffix; compare n == half or n == half / 10 to handle odd lengths.')

add('Return the Largest Digit in a Number', '''    public static int solve(int n) {
        int largest = 0;
        do { largest = Math.max(largest, Math.abs(n % 10)); n /= 10; } while (n != 0);
        return largest;
    }''', 'System.out.println(solve(-293));', '9',
    'Return the largest decimal digit, ignoring sign.',
    'Har extracted digit ke baad largest is the maximum of all processed digits.',
    'O(d) time and O(1) space.', 'Process 3,9,2: maximum becomes 3,9,9.',
    'abs is applied only to a remainder in [-9,9], so Integer.MIN_VALUE is safe.')

factorial_code = '''    public static BigInteger solve(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be nonnegative");
        BigInteger ans = BigInteger.ONE;
        for (int i = 2; i <= n; i++) ans = ans.multiply(BigInteger.valueOf(i));
        return ans;
    }'''
add('Factorial of a given number', factorial_code, 'System.out.println(solve(20));', '2432902008176640000',
    'Compute n! exactly for n >= 0, including 0! = 1.',
    'Multiply 2 through n; after i, the accumulator is i!. BigInteger keeps the result exact.',
    'n-1 multiplications; bit complexity and space grow with the output size, so this is not O(1) space for arbitrary n.',
    '4!: 1 -> 2 -> 6 -> 24.', 'int overflows after 12!; long after 20!. Reject negative inputs.')

add('Check if the Number is Armstrong', '''    public static boolean solve(int n) {
        if (n < 0) return false;
        int d = String.valueOf(n).length(), copy = n; long sum = 0;
        do {
            int digit = copy % 10; long power = 1;
            for (int i = 0; i < d; i++) power *= digit;
            sum += power; copy /= 10;
        } while (copy != 0);
        return sum == n;
    }''', 'System.out.println(solve(9474));', 'true',
    'A d-digit nonnegative number is Armstrong when it equals the sum of its digits raised to d.',
    'Count digits, compute each power using integer multiplication, and compare the sum.',
    'O(d²) arithmetic operations; O(d) temporary space for digit-count conversion.',
    '9474: 9^4 + 4^4 + 7^4 + 4^4 = 6561 + 256 + 2401 + 256 = 9474.',
    '153 uses cubes, but 9474 uses fourth powers. Avoid floating-point Math.pow equality.')

add('Check for Perfect Number', '''    public static boolean solve(int n) {
        if (n <= 1) return false;
        long sum = 1;
        for (int d = 2; d <= n / d; d++) if (n % d == 0) {
            sum += d; if (d != n / d) sum += n / d;
        }
        return sum == n;
    }''', 'System.out.println(solve(28));', 'true',
    'A positive integer is perfect when its positive proper divisors sum to itself.',
    'Divisors arrive in pairs d and n/d; visit the smaller partner only. Start with divisor 1 and omit n.',
    'O(sqrt(n)) time; O(1) space.', '28 has proper divisors 1,2,4,7,14 whose sum is 28.',
    '1 is not perfect. Add the square-root divisor only once; use n/d rather than d*d to avoid overflow.',
    'Checking every possible divisor takes O(n) time with the same constant extra space.')

prime_code = '''    public static boolean solve(int n) {
        if (n < 2) return false;
        for (int d = 2; d <= n / d; d++) if (n % d == 0) return false;
        return true;
    }'''
add('Check for Prime Number', prime_code, 'System.out.println(solve(97));', 'true',
    'Return true if n has exactly two positive divisors.',
    'A composite n has a factor at most sqrt(n), because two factors both larger than sqrt(n) would multiply to more than n.',
    'O(sqrt(n)) time; O(1) space.', 'For 97, test 2 through 9; no divisor exists.',
    '0,1 and negatives are not prime. n/d bounds the loop without int multiplication overflow.',
    'The direct O(n) approach checks 2 through n-1. For many queries use a sieve instead.')

sieve = '''    public static boolean[] sieve(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be nonnegative");
        boolean[] prime = new boolean[n + 1]; Arrays.fill(prime, true);
        prime[0] = false; if (n >= 1) prime[1] = false;
        for (int p = 2; p <= n / p; p++) if (prime[p])
            for (long j = (long) p * p; j <= n; j += p) prime[(int) j] = false;
        return prime;
    }
    public static int solve(int n) {
        boolean[] p = sieve(n); int count = 0;
        for (boolean x : p) if (x) count++;
        return count;
    }'''
add('Count of Prime Numbers till N', sieve, 'System.out.println(solve(10));', '4',
    'Count primes in the inclusive range [2,n], with n >= 0.',
    'Sieve: when p is prime, mark p²,p²+p,... composite. Smaller multiples were marked by smaller prime factors already.',
    'O(n log log n) time and O(n) space.', 'At n=10, mark 4,6,8,10 for 2 and 9 for 3; keep 2,3,5,7.',
    'The endpoint is inclusive. n=0 and n=1 return zero. Very large n needs a segmented sieve.',
    'Trial division for every number takes O(n sqrt(n)) time.')

gcd = '''    public static long solve(int a, int b) {
        long x = Math.abs((long) a), y = Math.abs((long) b);
        while (y != 0) { long r = x % y; x = y; y = r; }
        return x;
    }'''
add('GCD of Two Numbers', gcd, 'System.out.println(solve(48,18));', '6',
    'Return nonnegative gcd(a,b); define gcd(0,0)=0.',
    'Euclid uses gcd(a,b)=gcd(b,a%b). Any common divisor divides the remainder and vice versa.',
    'O(log(min(|a|,|b|)+1)) time, O(1) space.', '(48,18) -> (18,12) -> (12,6) -> (6,0).',
    'Cast to long before abs so MIN_VALUE is safe. gcd can be 2147483648, so the return type is long.')
add('LCM of two numbers', gcd.replace('solve(int a, int b)', 'gcd(int a, int b)') + '''
    public static long solve(int a, int b) {
        if (a == 0 || b == 0) return 0;
        return Math.abs(((long) a / gcd(a,b)) * b);
    }''', 'System.out.println(solve(12,18));', '36',
    'Return nonnegative lcm; if either input is zero, return zero.',
    'gcd*lcm = |a*b|. Divide before multiplying to reduce the intermediate magnitude.',
    'O(log(min(|a|,|b|)+1)) time, O(1) space.', 'gcd(12,18)=6; (12/6)*18=36.',
    'Use long and do the zero check before division. This handles all pairs of int inputs.')
add('Divisors of a Number', '''    public static List<Integer> solve(int n) {
        if (n <= 0) throw new IllegalArgumentException("positive n required");
        List<Integer> low = new ArrayList<>(), high = new ArrayList<>();
        for (int d = 1; d <= n / d; d++) if (n % d == 0) {
            low.add(d); if (d != n / d) high.add(n / d);
        }
        Collections.reverse(high); low.addAll(high); return low;
    }''', 'System.out.println(solve(36));', '[1, 2, 3, 4, 6, 9, 12, 18, 36]',
    'Return every positive divisor of n in increasing order.',
    'Collect smaller partners in increasing order, larger partners in decreasing order, then reverse the latter. This avoids a full sort.',
    'O(sqrt(n)) time plus O(number of divisors) output space.', 'For 36 collect low=[1,2,3,4,6], high=[36,18,12,9], then reverse high.',
    'At d*d=n, do not duplicate d. Zero has infinitely many divisors and is rejected.')

array_basics = [
 ('Sum of Array Elements', 'long sum = 0; for (int x : a) sum += x; return sum;', 'long', '[1, 2, 3]', 'new int[]{1,2,3}', '6', 'Sum all entries; an empty array sums to zero.', 'Running sum equals the sum of the processed prefix. Use long for accumulation.'),
 ('Count of odd numbers in Array', 'int count = 0; for (int x : a) if (x % 2 != 0) count++; return count;', 'int', '[-3,2,5]', 'new int[]{-3,2,5}', '2', 'Count odd array entries, including negative odd values.', 'Test remainder != 0; negative odd numbers have remainder -1.'),
 ('Check if the Array is Sorted I', 'for (int i = 1; i < a.length; i++) if (a[i] < a[i-1]) return false; return true;', 'boolean', '[1,1,3]', 'new int[]{1,1,3}', 'true', 'Check nondecreasing order; equal neighbors are allowed.', 'A sequence is nondecreasing exactly when each adjacent pair is ordered.'),
 ('Reverse an array', 'for (int l = 0, r = a.length-1; l < r; l++,r--) { int t=a[l]; a[l]=a[r]; a[r]=t; } return a;', 'int[]', '[1,2,3]', 'new int[]{1,2,3}', '[3, 2, 1]', 'Reverse the input array in place.', 'Swap matching ends and shrink the unprocessed interval. The already processed ends are in final positions.')]
for title, body, typ, sample, call, expected, contract, reason in array_basics:
    display = 'Arrays.toString(solve(%s))' % call if typ == 'int[]' else 'solve(%s)' % call
    add(title, '    public static %s solve(int[] a) { %s }' % (typ, body),
        'System.out.println(%s);' % display, expected, contract, reason,
        'O(n) time and O(1) auxiliary space.', 'Example input: %s. Visit each entry or symmetric pair exactly once.' % sample,
        'Empty and single-element arrays are valid. The reverse operation mutates its argument; the other operations do not.')

freq = '''    public static Map<Integer,Integer> frequencies(int[] a) {
        Map<Integer,Integer> map = new TreeMap<>();
        for (int x : a) map.put(x, map.getOrDefault(x,0)+1);
        return map;
    }'''
add('Highest Occurring Element in an Array', freq + '''
    public static int solve(int[] a) {
        if (a.length == 0) throw new IllegalArgumentException("nonempty array required");
        int best = 0, count = -1;
        for (Map.Entry<Integer,Integer> e : frequencies(a).entrySet())
            if (e.getValue() > count) { best=e.getKey(); count=e.getValue(); }
        return best;
    }''', 'System.out.println(solve(new int[]{3,2,3,2,1}));', '2',
    'Return the most frequent value; ties choose the smaller value.',
    'TreeMap visits keys in increasing order. Update only for a strictly higher frequency, so the first value among ties wins.',
    'O(n log u) time and O(u) space, u distinct values.', 'Counts: 1->1, 2->2, 3->2. Value 2 beats 1; 3 ties and is skipped.',
    'Tie-breaking must be explicit. Empty arrays have no most frequent element.',
    'HashMap gives expected O(n) counting, but then compare both frequency and value explicitly.')
add('Second Highest Occurring Element', freq + '''
    public static OptionalInt solve(int[] a) {
        List<Map.Entry<Integer,Integer>> entries = new ArrayList<>(frequencies(a).entrySet());
        entries.sort((x,y) -> { int c=Integer.compare(y.getValue(),x.getValue()); return c!=0?c:Integer.compare(x.getKey(),y.getKey()); });
        return entries.size()<2 ? OptionalInt.empty() : OptionalInt.of(entries.get(1).getKey());
    }''', 'System.out.println(solve(new int[]{1,1,2,2,2,3}).getAsInt());', '1',
    'Rank distinct values by descending frequency, breaking ties by smaller value. Return the second ranked value, or empty if fewer than two distinct values exist.',
    'Count, sort distinct entries, select rank two. This contract allows the first two values to have equal frequency.',
    'O(n log u + u log u) time, O(u) space.', '2 occurs three times, 1 twice, 3 once; ranking is 2,1,3.',
    'Second ranked element and second distinct frequency are different variants. OptionalInt avoids a sentinel that could be a valid input.')
add('Sum of Highest and Lowest Frequency', freq + '''
    public static int solve(int[] a) {
        if (a.length==0) return 0;
        int low=Integer.MAX_VALUE, high=0;
        for (int f : frequencies(a).values()) { low=Math.min(low,f); high=Math.max(high,f); }
        return low+high;
    }''', 'System.out.println(solve(new int[]{1,1,2,2,2,3}));', '4',
    'Add the largest and smallest positive frequency of values present. Empty input returns zero.',
    'Only present values participate. Traverse frequency counts and maintain the two extrema.',
    'O(n log u) time, O(u) space.', 'Frequencies 2,3,1 give 3+1=4.',
    'Return the sum of frequencies, not the sum of the associated values. With one distinct value, its frequency is counted twice.')

patterns = {
 1:'for(int r=1;r<=n;r++){ for(int c=1;c<=n;c++) out.append("* "); out.append("\\n"); }',
 2:'for(int r=1;r<=n;r++){ for(int c=1;c<=r;c++) out.append("* "); out.append("\\n"); }',
 3:'for(int r=1;r<=n;r++){ for(int c=1;c<=r;c++) out.append(c).append(" "); out.append("\\n"); }',
 4:'for(int r=1;r<=n;r++){ for(int c=1;c<=r;c++) out.append(r).append(" "); out.append("\\n"); }',
 5:'for(int r=n;r>=1;r--){ for(int c=1;c<=r;c++) out.append("* "); out.append("\\n"); }',
 6:'for(int r=n;r>=1;r--){ for(int c=1;c<=r;c++) out.append(c).append(" "); out.append("\\n"); }',
 7:'for(int r=1;r<=n;r++){ for(int c=0;c<n-r;c++) out.append(" "); for(int c=0;c<2*r-1;c++) out.append("*"); out.append("\\n"); }',
 8:'for(int r=n;r>=1;r--){ for(int c=0;c<n-r;c++) out.append(" "); for(int c=0;c<2*r-1;c++) out.append("*"); out.append("\\n"); }',
 9:'for(int row=1;row<=2*n;row++){ int r=row<=n?row:2*n-row+1; for(int c=0;c<n-r;c++) out.append(" "); for(int c=0;c<2*r-1;c++) out.append("*"); out.append("\\n"); }',
 10:'for(int row=1;row<2*n;row++){ int r=row<=n?row:2*n-row; for(int c=0;c<r;c++) out.append("* "); out.append("\\n"); }',
 11:'for(int r=1;r<=n;r++){ for(int c=1;c<=r;c++) out.append((r+c)%2==0?1:0).append(" "); out.append("\\n"); }',
 12:'for(int r=1;r<=n;r++){ for(int c=1;c<=r;c++) out.append(c); for(int c=0;c<2*(n-r);c++) out.append(" "); for(int c=r;c>=1;c--) out.append(c); out.append("\\n"); }',
 13:'int value=1; for(int r=1;r<=n;r++){ for(int c=1;c<=r;c++) out.append(value++).append(" "); out.append("\\n"); }',
 14:'for(int r=1;r<=n;r++){ for(int c=0;c<r;c++) out.append((char)(\'A\'+c)).append(" "); out.append("\\n"); }',
 15:'for(int r=n;r>=1;r--){ for(int c=0;c<r;c++) out.append((char)(\'A\'+c)).append(" "); out.append("\\n"); }',
 16:'for(int r=0;r<n;r++){ for(int c=0;c<=r;c++) out.append((char)(\'A\'+r)).append(" "); out.append("\\n"); }',
 17:'for(int r=1;r<=n;r++){ for(int c=0;c<n-r;c++) out.append(" "); for(int c=0;c<2*r-1;c++) out.append((char)(\'A\'+Math.min(c,2*r-2-c))); out.append("\\n"); }',
 18:'for(int r=1;r<=n;r++){ for(int c=n-r;c<n;c++) out.append((char)(\'A\'+c)).append(" "); out.append("\\n"); }',
 19:'for(int row=0;row<2*n;row++){ int r=row<n?n-row:row-n+1; for(int c=0;c<r;c++) out.append("*"); for(int c=0;c<2*(n-r);c++) out.append(" "); for(int c=0;c<r;c++) out.append("*"); out.append("\\n"); }',
 20:'for(int row=1;row<2*n;row++){ int r=row<=n?row:2*n-row; for(int c=0;c<r;c++) out.append("*"); for(int c=0;c<2*(n-r);c++) out.append(" "); for(int c=0;c<r;c++) out.append("*"); out.append("\\n"); }',
 21:'for(int r=0;r<n;r++){ for(int c=0;c<n;c++) out.append(r==0||c==0||r==n-1||c==n-1?"*":" "); out.append("\\n"); }',
 22:'for(int r=0;r<2*n-1;r++){ for(int c=0;c<2*n-1;c++) out.append(n-Math.min(Math.min(r,c),Math.min(2*n-2-r,2*n-2-c))).append(" "); out.append("\\n"); }'
}
pattern_samples = {
 1:'* * * \n* * * \n* * *', 2:'* \n* * \n* * *', 3:'1 \n1 2 \n1 2 3', 4:'1 \n2 2 \n3 3 3',
 5:'* * * \n* * \n*', 6:'1 2 3 \n1 2 \n1', 7:'  *\n ***\n*****', 8:'*****\n ***\n  *',
 9:'  *\n ***\n*****\n*****\n ***\n  *', 10:'* \n* * \n* * * \n* * \n*', 11:'1 \n0 1 \n1 0 1',
 12:'1    1\n12  21\n123321', 13:'1 \n2 3 \n4 5 6', 14:'A \nA B \nA B C', 15:'A B C \nA B \nA',
 16:'A \nB B \nC C C', 17:'  A\n ABA\nABCBA', 18:'C \nB C \nA B C',
 19:'******\n**  **\n*    *\n*    *\n**  **\n******', 20:'*    *\n**  **\n******\n**  **\n*    *',
 21:'***\n* *\n***', 22:'3 3 3 3 3 \n3 2 2 2 3 \n3 2 1 2 3 \n3 2 2 2 3 \n3 3 3 3 3'}
for number, loops in patterns.items():
    add('Pattern %d' % number, '''    public static String solve(int n) {
        if(n<0) throw new IllegalArgumentException("nonnegative n required");
        StringBuilder out=new StringBuilder();
        %s
        return out.toString();
    }''' % loops, 'System.out.print(solve(3));', pattern_samples[number],
        'Print pattern %d for n rows/rings. The example defines the exact shape; n=0 prints nothing. Alphabet patterns assume n<=26.' % number,
        'Outer loop selects a row. Inner loops calculate its symbols and padding directly from the row index. Trace the formulas before writing the loops; row-dependent bounds create the shape.',
        'O(n²) time and O(n²) output storage; streaming directly to a writer would use O(1) auxiliary space.',
        'Use n=3 and label row/column indices. For each row, apply the bounds in Solution.java; compare the emitted row with the example below. Pattern 22 uses distance to the closest border to determine the ring value.',
        'One-based symbol counts and zero-based coordinates must not be mixed. Some rows include a trailing space; verification ignores trailing spaces only. Diamond 9 repeats the widest row; butterfly 20 does not.')

rec = {
 'Sum of First N Numbers': ('long','int n','if(n<0) throw new IllegalArgumentException(); return n==0?0:n+solve(n-1);','5','15', 'Sum 1 through n for n>=0.','solve(n)=n+solve(n-1), base solve(0)=0.','5+4+3+2+1+0=15.','O(n) time and O(n) call stack.'),
 'Factorial of a Given Number': ('BigInteger','int n','if(n<0) throw new IllegalArgumentException(); return n<=1?BigInteger.ONE:BigInteger.valueOf(n).multiply(solve(n-1));','5','120','Compute factorial recursively and exactly.','n!=n*(n-1)! with 0!=1 and 1!=1.','5*4*3*2*1=120.','O(n) recursive calls; O(n) stack frames plus BigInteger storage and multiplication cost.'),
 'Sum of Array Elements II': ('long','int[] a, int i','return i==a.length?0:a[i]+solve(a,i+1);','new int[]{1,2,3},0','6','Sum from index i to the end; require 0<=i<=length.','Consume one element and recurse on the remaining suffix.','1+(2+(3+0))=6.','O(n-i) time and call stack.'),
 'Reverse a String I': ('String','String s','return s.length()<2?s:solve(s.substring(1))+s.charAt(0);','"java"','avaj','Reverse a UTF-16 string recursively for educational purposes.','First character becomes the last; recursively reverse the suffix.','java -> reverse(ava)+j -> avaj.','O(n²) time and allocated substring/concatenation storage; O(n) recursion depth.'),
 'Check if String is Palindrome or Not': ('boolean','String s, int l, int r','return l>=r || (s.charAt(l)==s.charAt(r) && solve(s,l+1,r-1));','"level",0,4','true','Exact case-sensitive palindrome check with an inclusive interval.','The outer characters must match and the inner interval must be a palindrome.','l,e match their opposite ends; middle v is a base case.','O(n) time and O(n) stack.'),
 'Check if a Number is Prime or Not': ('boolean','int n, int d','if(n<2) return false; if(d>n/d) return true; return n%d!=0 && solve(n,d+1);','97,2','true','Recursive trial division; call with d=2.','Stop after sqrt(n); otherwise reject a divisor and recurse with the next candidate.','Candidates 2 through 9 fail to divide 97.','O(sqrt(n)) time and stack.'),
 'Reverse an array 2': ('int[]','int[] a, int l, int r','if(l>=r) return a; int t=a[l]; a[l]=a[r]; a[r]=t; return solve(a,l+1,r-1);','new int[]{1,2,3},0,2','[3, 2, 1]','Reverse in place; start with endpoints 0,length-1.','Swap endpoints and recurse on the interval between them.','[1,2,3] -> [3,2,1]; central index terminates.','O(n) time and stack.'),
 'Check if the Array is Sorted II': ('boolean','int[] a, int i','return i+1>=a.length || (a[i]<=a[i+1] && solve(a,i+1));','new int[]{1,2,2},0','true','Check nondecreasing order recursively, starting at index zero.','Each adjacent pair must be ordered; recurse to validate the remaining pairs.','1<=2 and 2<=2, then no pair remains.','O(n) time and stack.'),
 'Sum of Digits in a Given Number': ('int','int n','return n==0?0:Math.abs(n%10)+solve(n/10);','-123','6','Sum decimal digits ignoring sign.','Add the magnitude of the last digit to the digit sum of the truncated number.','|-3|+|-2|+|-1|+0=6.','O(d) time and stack.'),
 'Fibonacci Number': ('long','int n','if(n<0||n>92) throw new IllegalArgumentException("0<=n<=92"); long a=0,b=1; for(int i=0;i<n;i++){ long next=a+b; a=b; b=next; } return a;','10','55','Return F(n), F(0)=0 and F(1)=1, for 0<=n<=92.','Keep two consecutive terms. This removes repeated subproblems from the recursion tree. The unused successor after F(92) may wrap, but the returned F(92) is exact.','Pairs (0,1),(1,1),(1,2),...,(55,89).','O(n) time and O(1) space.')}
for title, (typ,params,body,call,expected,contract,reason,trace,cost) in rec.items():
    display = 'Arrays.toString(solve(%s))' % call if typ=='int[]' else 'solve(%s)' % call
    add(title, '    public static %s solve(%s) { %s }' % (typ,params,body),
        'System.out.println(%s);' % display, expected, contract, reason, cost, trace,
        'Java 8 does not optimize tail calls. Deep recursion can cause StackOverflowError; use an iterative equivalent for large inputs. Validate helper indices before calling.',
        'The iterative equivalent avoids recursive stack space. Fibonacci naive recursion is exponential; memoization uses O(n) time and O(n) space.')

fundamentals = {
 'Breaking The Myth':'DSA koi memorization contest nahi hai. Pehle small examples solve karo, phir repeated work identify karo. Correct brute force is a starting point. Speed comes from constraints, invariants and repeated practice.',
 'Programming and What Are Computers?':'A program is a precise sequence of instructions. CPU executes instructions; memory stores values. Java source is compiled to bytecode, then executed by the JVM. Input, processing, and output are separate steps. Example: read two integers, calculate their sum as long, print it.',
 'How to Think Like a Programmer':'1. Restate input/output. 2. Define constraints. 3. Solve a tiny example by hand. 4. Write a direct algorithm. 5. State the invariant. 6. Check complexity. 7. Test an empty, single, duplicate and extreme-value case. 8. Optimize only where constraints demand it.',
 'Flowcharts and Pseudocode':'Use a start/end oval, input/output parallelogram, process rectangle and decision diamond. Pseudocode example: READ n; IF n<2 RETURN false; FOR d=2 WHILE d<=n/d: IF n%d==0 RETURN false; RETURN true. Pseudocode describes the algorithm independently of Java syntax.',
 'Flowchart Problem-Solving':'For max(a,b): start -> read a,b -> decision a>=b -> print a on yes, print b on no -> end. Trace both branches and equality. A loop requires initialization, condition, body and update; a missing update makes an infinite loop.',
 'Dry Runs, Edge Cases and Debugging':'Create a table of iteration, index, current value and accumulator. For [2,-1,3] running sums are 2,1,4. Test zero-length input, boundary indices, duplicates, negative values and integer overflow. Fix the first point where the invariant fails rather than patching the final output.',
 'Programming Languages and Choosing a Path':'This repository targets Java 8. Learn one language well: variables, loops, methods, arrays and collections, then DSA. The algorithm usually transfers to other languages; library APIs, overflow and reference semantics do not.',
 'Learn Java':'Java 8: `int` is signed 32-bit, `long` signed 64-bit; `boolean` is true/false. `(long)a*b` widens before multiplication. `a/b` truncates toward zero for integers. Arrays have fixed length and zero-based indices. Objects are passed by value of their reference; methods can mutate the referenced array. Strings are immutable: use `.equals`, not `==`. `StringBuilder` supports repeated appends. Use `public class Solution` in Solution.java. Compile with `javac Solution.java`, run with `java Solution`. Scanner is convenient; BufferedReader plus StringTokenizer is faster for large token streams. Never mix nextInt() and nextLine() without consuming the leftover newline.',
 'Learn C++':'Java comparison lesson: C++ vector corresponds roughly to ArrayList, unordered_map to HashMap, set to TreeSet, queue to ArrayDeque and priority_queue to PriorityQueue with a comparator. Java arrays do not resize; Java generics use boxed Integer rather than int. C++ pointers become object references, with null as the absent node. This Java-only repo does not provide C++ implementations.',
 'Learn Python':'Java comparison lesson: Python list corresponds to ArrayList or an array, dict to HashMap, set to HashSet and deque to ArrayDeque. Python integers grow automatically; Java int/long overflow, so use BigInteger when exact unbounded arithmetic is required. Slicing needs an explicit copy in Java. This Java-only repo does not provide Python solutions.',
 'Easy and Medium':'Pattern workflow: choose rows, derive symbols per row, derive left/right padding, then write nested loops. For a triangle row r prints r symbols; a centered pyramid prints n-r spaces and 2*r-1 stars. See the 22 runnable Patterns lessons for concrete shapes.',
 'Hard':'Compound patterns can be split into halves. A diamond joins a pyramid with its inverted form; a butterfly mirrors two triangles around a gap. For concentric squares the cell value follows distance to the nearest boundary. Check whether the widest row is repeated before choosing 2*n or 2*n-1 total rows.',
 'Theory with examples':'Count input-dependent operations, not source lines. A single scan is O(n); nested scans usually O(n²); repeatedly halving an interval is O(log n). Sequential costs add and the largest term dominates. Recurrence merge sort: T(n)=2T(n/2)+O(n)=O(n log n). Space includes recursion frames; distinguish auxiliary space from returned output. HashMap operations are expected constant time, not an unconditional worst-case guarantee.',
 'Java Collections':'ArrayList: indexed get O(1), append amortized O(1), middle insertion O(n). ArrayDeque: O(1) amortized push/pop/offer/poll, no null. HashMap/HashSet: expected O(1) lookup/update. TreeMap/TreeSet: O(log n), sorted keys. PriorityQueue: offer/poll O(log n), peek O(1). Use `Integer.compare(a,b)` rather than subtraction comparators that can overflow. Java 8 supports `getOrDefault`, `computeIfAbsent`, lambdas and diamond syntax. It does not support List.of, Map.of, records or var. Primitive arrays use Arrays.sort; object arrays can take comparators. Iterator.remove removes safely during iteration.',
 'STL':'STL-to-Java mapping is covered in Learn C++ and Java Collections. Prefer ArrayDeque for a stack/queue, PriorityQueue for a heap and TreeMap for ordered dictionaries. Comparator ordering and boxing differ from C++; translate the contract and complexity, not just the spelling.',
 'Python Libraries Part 1':'Java equivalents for Python collections: Counter -> HashMap<Integer,Integer> counting with getOrDefault; deque -> ArrayDeque; bisect_left -> lower bound; heapq -> PriorityQueue. See Java Collections and Binary Search for runnable Java implementations.',
 'Python Libraries Part 2':'Java equivalents: itertools combinations -> explicit backtracking; math.gcd -> Euclid; functools memoization -> an array or map keyed by the full state. A Java array used as a map key compares by identity; use a stable key class or encode the tuple safely. Avoid overflow-prone arithmetic key encodings.',
 'Basic Maths':'Understand divisibility, remainders, digit extraction, Euclid and the sqrt factor-pair bound. `%` in Java can be negative; normalize modular values with `(x % m + m) % m` for positive m. Cast before arithmetic that may overflow. The Basic Maths section gives runnable examples.',
 'Basic Arrays':'An array has a fixed length; valid indices are 0 through length-1. Use a half-open interval [l,r) when convenient. Copy via Arrays.copyOf rather than assigning a second reference. Define whether each method mutates its input. Empty-array contracts matter for maximum/minimum problems.',
 'Basic Hashing':'Hashing stores a count or an index per key. Use HashMap for unrestricted integer values; frequency arrays work only when the value range is small and explicitly bounded. Prefix sums plus a map count subarrays, including negatives. Expected O(1) operations rely on normal hashing assumptions.',
 'Basic String':'Strings are immutable UTF-16 sequences in Java 8. charAt handles code units, not full Unicode code points. These interview solutions state ASCII/lowercase assumptions where applicable. Repeated `s += c` can become quadratic; use StringBuilder. Compare content using equals.',
 'Recursion Theory':'Every recursive algorithm needs a base case and a strictly decreasing measure. Call frames hold local variables. For reversal, interval length decreases by two. For subsets, the index increases until n. Prove termination and include stack usage in the space complexity.',
 'Recursion Concepts with Parameters':'Parameters carry the subproblem state. For array sum, solve(a,i) means the sum of suffix [i,n); its base is i==n. Backtracking additionally restores mutated state after each choice. A global accumulator must be reset between calls; prefer returning values or passing explicit state.'
}
for title, body in fundamentals.items():
    theory(title, body)
