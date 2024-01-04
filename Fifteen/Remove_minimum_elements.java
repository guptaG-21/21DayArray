link->https://www.geeksforgeeks.org/problems/remove-minimum-elements4612/1?page=3&category=Arrays&company=Amazon&difficulty=Easy&sortBy=submissions



int minRemoval(int arr[], int n) {
        int res = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i= 0;i<n;i++){
            res = Math.min(res,i+n-getFirstGreatest(arr,i+1,n-1,2*arr[i]));
        }
        return res; 
    }
    int getFirstGreatest(int[] arr,int first,int end,int x){
        while(first<=end){
            int mid = first+(end-first)/2;
            if(arr[mid]<=x){
                first = mid+1;
            }else if(arr[mid]>x){
                end = mid-1;
            }
        }
        return end+1;
    }