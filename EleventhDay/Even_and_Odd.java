link->https://www.geeksforgeeks.org/problems/even-and-odd/1?page=3&category=Arrays&company=Amazon&difficulty=Easy&sortBy=submissions



static void reArrange(int[] arr, int N) {
        // code here
        int i = 0;
        int j = 1;
        while(i<N && j<N){
            if(arr[i]%2 == 0){
                i+=2;
            }else if(arr[j]%2!=0){
                j+=2;
            }else{
                swap(arr,i,j);
            }
        }
    }
    static void swap(int[]arr,int first,int second){
        int tmp = arr[first];
        arr[first] = arr[second];
        arr[second] = tmp;
    }