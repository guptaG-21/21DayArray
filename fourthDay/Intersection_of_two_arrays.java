link->https://www.geeksforgeeks.org/problems/intersection-of-two-arrays2404/1?page=1&category=Arrays&company=Amazon&difficulty=Easy&sortBy=submissions


public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        // Your code here
        Set<Integer>set = new HashSet<>();
        
        for(int i=0;i<n;i++){
            set.add(a[i]);
        }
        int count = 0;
        for(int i=0;i<m;i++){
            if(set.contains(b[i])){
                count++;
                set.remove(b[i]);
            }
        }
        return count;
    }