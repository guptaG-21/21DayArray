link->https://www.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1?page=1&category=Arrays&company=Amazon&difficulty=Medium&sortBy=submissions



long maxSubarraySum(int arr[], int n){
        long max = Integer.MIN_VALUE;
        long sum = 0;
      
        for(int i=0;i<n;i++){
            sum+=arr[i];
            max = Math.max(sum,max);
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }