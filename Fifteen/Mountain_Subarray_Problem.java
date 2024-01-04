link->https://www.geeksforgeeks.org/problems/mountain-subarray-problem/1?page=3&category=Arrays&company=Amazon&difficulty=Easy&sortBy=submissions



public ArrayList<Boolean> processQueries(int[] a, int n, ArrayList<Pair> queries,int q) {
        // code here
        ArrayList<Boolean> ans = new ArrayList<>(q);
        for(Pair p : queries){
            int left = p.l;
            int right = p.r;
            if(left==right){
                ans.add(true);
                continue;
            }
            boolean stepping=true;
            for(int j=left+1;j<=right;j++){
                if(stepping==false&&a[j]>a[j-1]){
                    ans.add(false);
                    break;
                }
                if(a[j]<a[j-1]){
                    stepping=false;
                }
                if(j==right){
                    ans.add(true);
                }
            }
         
        }
        return ans;
    }