link->https://www.geeksforgeeks.org/problems/wave-array-1587115621/1?page=1&category=Arrays&company=Amazon&difficulty=Easy&sortBy=submissions




public static void convertToWave(int n, int[] arr) {
        // code here
        for(int i=1;i<n;i+=2){
            swap(arr,i);
        }
    }
    static void swap(int[] arr,int i){
        if(i>i-1){
            int num = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = num;
        }
    } 