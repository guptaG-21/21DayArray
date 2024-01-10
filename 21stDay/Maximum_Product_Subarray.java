link->https://www.geeksforgeeks.org/problems/maximum-product-subarray3604/1?page=1&category=Arrays&company=Amazon&difficulty=Medium&sortBy=submissions



long maxProduct(int[] arr, int n) {
        // code here
        long maxProductLeft = Integer.MIN_VALUE;
        long maxProductRight = Integer.MIN_VALUE;
        long curProductLeft = 1;
        long curProductRight = 1;
        
        
        for(int i = 0, j = n-1 ; i < n; i++,j--){
            curProductLeft *= arr[i];
            curProductRight *= arr[j];
            
            maxProductLeft = Math.max(curProductLeft, maxProductLeft);
            maxProductRight = Math.max(curProductRight, maxProductRight);
            
            if(curProductLeft == 0) curProductLeft = 1;
            if(curProductRight == 0) curProductRight = 1;
        }
        
        return Math.max(maxProductLeft, maxProductRight);
    }