link->https://www.geeksforgeeks.org/problems/count-the-zeros2550/1?page=2&category=Arrays&company=Amazon&difficulty=Easy&sortBy=submissions



int countZeroes(int[] arr, int n) {
        int s=0;
        int e=n-1;
        while(s<=e){
            int m = s+(e-s)/2;
            if(arr[m] == 0 && (m == 0 || arr[m-1] == 1)){
                return n-m;
            }else if(arr[m]==1){
                s=m+1;
            }else{
                e=m-1;
            }
        }
        return 0;
    }