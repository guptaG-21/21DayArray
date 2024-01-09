link->https://www.geeksforgeeks.org/problems/minimum-platforms-1587115620/1?page=1&category=Arrays&company=Amazon&difficulty=Medium&sortBy=submissions


static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        int cnt = 0;
        int s = 0;
        int d = 0;
        int maxi = Integer.MIN_VALUE;
        while(s<n && d<n){
            if(arr[s]<=dep[d]){
                cnt++;
                s++;
                maxi = Math.max(maxi,cnt);
            }else{
                cnt--;
                d++;
            }
        }
        return maxi;
    }