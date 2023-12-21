link->https://www.geeksforgeeks.org/problems/equilibrium-point-1587115620/1?page=1&category=Arrays&company=Amazon&difficulty=Easy&sortBy=submissions


public static int equilibriumPoint(long arr[], int n) {
        int sum2 = 0;
        int sum1 = 0;
        int ans = -1;
        if(n==1)return 1;
        for(int i =1;i<n;i++){
            sum2+=arr[i];
        }
        for(int i=1;i<n;i++){
            sum1+=arr[i-1];
            sum2-=arr[i];
            if(sum1 == sum2){
                ans = i+1;
                break;
            }
        }
        return ans;
    }