link->https://www.geeksforgeeks.org/problems/maximum-value-in-a-bitonic-array3001/1?page=2&category=Arrays&company=Amazon&difficulty=Easy&sortBy=submissions



int findMaximum(int[] arr, int n) {
        // code here
        // int max = Integer.MIN_VALUE;
        if(n==1){
            return arr[0];
        }
        if(arr[0]>arr[1]){
            return arr[0];
        }
        if(arr[n-1]>arr[n-2]){
            return arr[n-1];
        }
        int start = 1;
        int end = n-2;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return arr[mid];
            }else if(arr[mid]>arr[mid-1]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }