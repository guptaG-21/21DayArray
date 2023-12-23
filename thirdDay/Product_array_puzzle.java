link->https://www.geeksforgeeks.org/problems/product-array-puzzle4525/1?page=1&category=Arrays&company=Amazon&difficulty=Easy&sortBy=submissions




public static long[] productExceptSelf(int nums[], int n) 
	{ 
        int zeroIndex = -1;
        int zeroCount = 0;
        long prod = 1;
        long[] ans = new long[n];
        
        for(int i=0;i<n;i++){
            if(nums[i] == 0){
                zeroIndex = i;
                zeroCount++;
            }else{
                prod*=nums[i];
            }
        }
        if(zeroCount>1){
            return ans;
        }
        if(zeroCount == 0){
             for(int i=0;i<n;i++){
                 ans[i] = prod/nums[i];
             }
        }else{
            ans[zeroIndex] = prod;
        }
        return ans;
	} 