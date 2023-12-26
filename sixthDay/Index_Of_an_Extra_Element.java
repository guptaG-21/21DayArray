link->https://www.geeksforgeeks.org/problems/index-of-an-extra-element/1?page=2&category=Arrays&company=Amazon&difficulty=Easy&sortBy=submissions


public int findExtra(int a[], int b[], int n) {
        // add code here.
        int s = 0;
        int e = n;
        while(s<e){
            int m = s+(e-s)/2;
            if(m==n-1 || a[m]!=b[m]){
                e = m;
            }else{
                s = m+1;
            }
        }
        return s;
    }