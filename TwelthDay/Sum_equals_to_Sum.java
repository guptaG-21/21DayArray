link->https://www.geeksforgeeks.org/problems/sum-equals-to-sum4006/1?page=3&category=Arrays&company=Amazon&difficulty=Easy&sortBy=submissions


public int findPairs(int arr[],int n) 
    { 
        HashSet<Integer> set = new HashSet<>();
        for(int i =0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int sum = arr[i]+arr[j];
                if(set.contains(sum)){
                    return 1;
                }
                set.add(sum);
            }
        }
        return 0;
    }