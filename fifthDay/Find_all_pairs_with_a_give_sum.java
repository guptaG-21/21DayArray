link->https://www.geeksforgeeks.org/problems/find-all-pairs-whose-sum-is-x5808/1?page=1&category=Arrays&company=Amazon&difficulty=Easy&sortBy=submissions


public pair[] allPairs( long A[], long B[], long N, long M, long X) {
        Arrays.sort(A);
        HashSet<Long>set = new HashSet<>();
        ArrayList<pair> p = new ArrayList<>();
        
        for(Long val:B){
            set.add(val);
        }
        
        for(int i=0;i<N;i++){
            if(set.contains(X-A[i])){
                p.add(new pair(A[i],X-A[i]));
            }
        }
        pair[] ans = new pair[p.size()];
        
        p.toArray(ans);
        return ans;
    }