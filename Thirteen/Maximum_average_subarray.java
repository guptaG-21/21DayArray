link->https://www.geeksforgeeks.org/problems/maximum-average-subarray5859/1?page=3&category=Arrays&company=Amazon&difficulty=Easy&sortBy=submissions


int findMaxAverage(int[] arr, int n, int k) {
        int maxAvg = Integer.MIN_VALUE;
        int sumMax = 0;
        for(int i=0;i<k;i++){
            sumMax+=arr[i];
        }
        int sumWindow = sumMax;
        int index = 0;
        for(int i=0;i<(n-k);i++){
            sumWindow = sumWindow - arr[i]+arr[i+k];
            if(sumWindow>sumMax){
                sumMax = sumWindow;
                index = i+1;
            }
        }
        return index;
    }