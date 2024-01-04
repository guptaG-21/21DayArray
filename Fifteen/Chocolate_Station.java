link->https://www.geeksforgeeks.org/problems/chocolate-station2951/1?page=3&category=Arrays&company=Amazon&difficulty=Easy&sortBy=submissions


long getChocolateCost(long arr[], int chocolateMRP)
    {
        int n = arr.length;
        long price = arr[0],step=0;
        for(int i=1;i<n;i++){
            step += arr[i-1] - arr[i];
            if(step<0){
                price+=Math.abs(0-step);
                step = 0;
            }
        }
        return price*chocolateMRP;
    }