link->https://www.geeksforgeeks.org/problems/peak-element/1?page=1&category=Arrays&company=Amazon&difficulty=Medium&sortBy=submissions



public int peakElement(int[] arr,int n)
    {
       //add code here.
       int s = 0;
       int e = n-1;
       while(s<e){
           int m = s+(e-s)/2;
           if( arr[m]<arr[m+1]){
               s = m+1;
           }else{
               e = m;
           }
       }
       return s;
    }


