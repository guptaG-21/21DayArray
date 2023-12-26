link->https://www.geeksforgeeks.org/problems/smallest-subarray-with-sum-greater-than-x5651/1?page=2&category=Arrays&company=Amazon&difficulty=Easy&sortBy=submissions



public static int smallestSubWithSum(int arr[], int n, int x) {
        // Your code goes here 
        int min = Integer.MAX_VALUE;
        int l = 0;
        int r=0;
        int sum = 0;
        int count = 0;
        while(r<n){
            sum+=arr[r];
            count++;
            if(sum>x){
                min = Math.min(min,count);
                count = 0;
                sum = 0;
                l++;
                r = l;
            }else{
                r++;
            }
        }
        return (min == Integer.MAX_VALUE )?0:min;
    }