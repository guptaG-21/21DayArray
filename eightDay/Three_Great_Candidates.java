link->https://www.geeksforgeeks.org/problems/three-great-candidates0515/1?page=2&category=Arrays&company=Amazon&difficulty=Easy&sortBy=submissions





long maxProduct(int[] arr, int n) {
        // code here
        if(n<3){
            return -1;
        }
        long max1 = Integer.MIN_VALUE;
        long max2 = Integer.MIN_VALUE;
        long max3 = Integer.MIN_VALUE;
        long min1 = Integer.MAX_VALUE;
        long min2 = Integer.MAX_VALUE;
        
        
        for(int val:arr){
            if(val>max1){
                max3 = max2;
                max2 = max1;
                max1 = val;
            }else if(val>max2){
                max3 = max2;
                max2 = val;
            }else if(val>max3){
                max3 = val;
            }
            if(val<min1){
                min2 = min1;
                min1 = val;
            }else if(val<min2){
                min2 = val;
            }
        }
        long prod1 = max1*max2*max3;
        long prod2 = max1*min1*min2;
        return Math.max(prod1,prod2);
    }