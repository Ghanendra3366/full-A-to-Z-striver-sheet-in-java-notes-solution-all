sorts = {
 'Selection Sort': ('''for(int i=0;i<a.length;i++) { int best=i; for(int j=i+1;j<a.length;j++) if(a[j]<a[best]) best=j; int t=a[i]; a[i]=a[best]; a[best]=t; }''', '', 'Pick the smallest value from the unsorted suffix and place it at its first position. After pass i, the prefix contains the i+1 smallest values in sorted order.', 'O(n²) comparisons in every case; O(1) auxiliary space. Not stable.', '[3,1,2] -> [1,3,2] -> [1,2,3].'),
 'Bubble Sort': ('''for(int end=a.length-1;end>0;end--) { boolean changed=false; for(int j=0;j<end;j++) if(a[j]>a[j+1]) { int t=a[j]; a[j]=a[j+1]; a[j+1]=t; changed=true; } if(!changed) break; }''', '', 'Swap adjacent inversions. Each pass settles the largest remaining value at end. A pass with no swaps proves the array is sorted.', 'O(n²) worst/average time, O(n) best time; O(1) space. Stable because equal values are never swapped.', '[3,1,2] -> [1,3,2] -> [1,2,3]; next pass has no swaps.'),
 'Insertion Sorting': ('''for(int i=1;i<a.length;i++) { int key=a[i],j=i-1; while(j>=0 && a[j]>key) { a[j+1]=a[j]; j--; } a[j+1]=key; }''', '', 'Maintain a sorted prefix. Shift strictly larger values right, then insert the next key into the gap.', 'O(n²) worst/average time, O(n) best time; O(1) space. Stable.', '[3,1,2]: insert 1 before 3, then insert 2 between 1 and 3.'),
 'Merge Sorting': ('merge(a,new int[a.length],0,a.length);', '''    private static void merge(int[] a,int[] tmp,int l,int r) {
        if(r-l<=1) return; int m=l+(r-l)/2;
        merge(a,tmp,l,m); merge(a,tmp,m,r);
        int i=l,j=m,k=l;
        while(i<m && j<r) tmp[k++]=a[i]<=a[j]?a[i++]:a[j++];
        while(i<m) tmp[k++]=a[i++]; while(j<r) tmp[k++]=a[j++];
        System.arraycopy(tmp,l,a,l,r-l);
    }''', 'Divide the half-open interval [l,r) in two, sort both halves, then merge by repeatedly selecting the smaller front value. Sorted fronts ensure the next selected value is globally smallest among remaining entries.', 'O(n log n) time, O(n) buffer plus O(log n) stack. Stable due to left-first equality.', '[3,1,2]: sort [3] and [1,2], then merge fronts 3/1, 3/2, leftover 3.'),
 'Quick Sorting': ('quick(a,0,a.length-1,new Random(0));', '''    private static void quick(int[] a,int l,int r,Random random) {
        if(l>=r) return;
        int pick=l+random.nextInt(r-l+1), t=a[pick]; a[pick]=a[r]; a[r]=t;
        int pivot=a[r],i=l;
        for(int j=l;j<r;j++) if(a[j]<pivot){ t=a[i]; a[i]=a[j]; a[j]=t; i++; }
        t=a[i]; a[i]=a[r]; a[r]=t;
        quick(a,l,i-1,random); quick(a,i+1,r,random);
    }''', 'Randomly select a pivot and move it to the end. Partition into values smaller than pivot and values at least pivot; place pivot between them, then recurse on both sides.', 'Expected O(n log n), worst O(n²) time. Expected O(log n), worst O(n) stack. Not stable.', 'With pivot 2 in [3,1,2], move 1 left, place 2 at index 1, then sort the one-element sides.'),
 'Recursive Bubble Sort': ('bubble(a,a.length);', '''    private static void bubble(int[] a,int n) {
        if(n<=1) return; boolean changed=false;
        for(int i=0;i<n-1;i++) if(a[i]>a[i+1]){ int t=a[i]; a[i]=a[i+1]; a[i+1]=t; changed=true; }
        if(changed) bubble(a,n-1);
    }''', 'One pass settles the maximum at n-1. Recursively sort the remaining prefix; no-swap early termination is valid.', 'O(n²) worst time, O(n) best time; O(n) worst stack. Stable.', '[3,1,2] bubbles 3 to the end; recurse on [1,2] and stop.'),
 'Recursive Insertion Sort': ('insertion(a,a.length);', '''    private static void insertion(int[] a,int n) {
        if(n<=1) return; insertion(a,n-1);
        int key=a[n-1],j=n-2;
        while(j>=0 && a[j]>key){ a[j+1]=a[j]; j--; } a[j+1]=key;
    }''', 'First recursively sort n-1 entries, then insert the last entry into that sorted prefix.', 'O(n²) worst time, O(n) best time; O(n) stack even for sorted input. Stable.', 'Sort [3,1] into [1,3], then insert 2 to obtain [1,2,3].')}
for title,(body,helpers,reason,cost,trace) in sorts.items():
    add(title, '    public static int[] solve(int[] a) { %s return a; }\n%s' % (body,helpers),
        'System.out.println(Arrays.toString(solve(new int[]{5,-1,2,2,0})));', '[-1, 0, 2, 2, 5]',
        'Sort an int array in nondecreasing order in place and return the same array.', reason, cost, trace,
        'Empty, singleton, duplicate, sorted and reverse-sorted arrays are valid. Quick sort with Lomuto partition still degenerates on all-equal input; random pivot does not remove that case. Deep recursion can exhaust the stack.',
        'For large general arrays use Arrays.sort in application code. Compare these algorithms by stability, memory, and worst-case behavior rather than only average runtime.')
