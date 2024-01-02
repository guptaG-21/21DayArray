link->https://www.geeksforgeeks.org/problems/max-value1205/1?page=3&category=Arrays&company=Amazon&difficulty=Easy&sortBy=submissions


public static int maxVal(int a[], int n) {
        int maxi=Integer.MIN_VALUE;
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            maxi=Math.max(maxi,a[i]-i);
            mini=Math.min(mini,a[i]-i);
        }
        return maxi-mini;
    }