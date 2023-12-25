link->https://www.geeksforgeeks.org/problems/rotation4723/1?page=1&category=Arrays&company=Amazon&difficulty=Easy&sortBy=submissions


int findKRotation(int arr[], int n) {
        int s = 0;
        int e = n-1;
        while(s<e){
            int mid = s+(e-s)/2;
            if(arr[mid]>arr[e]){
                s = mid+1;
            }else{
                e = mid;
            }
        }
        return s;
    }