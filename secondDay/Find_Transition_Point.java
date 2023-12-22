link->https://www.geeksforgeeks.org/problems/find-transition-point-1587115620/1?page=1&category=Arrays&company=Amazon&difficulty=Easy&sortBy=submissions




int transitionPoint(int arr[], int n) {
        // code here
        // for(int i=0;i<n;i++){
        //     if(arr[i] == 1){
        //         return i;
        //     }
        // }
        int start = 0;
        int end = n-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid] == 1 && (mid == 0 || arr[mid-1] == 0)){
                return mid;
            }
            if(arr[mid] == 1){
                end = mid-1;
            }else{
                start = mid+1; 
            }
        }
        return -1;
    }