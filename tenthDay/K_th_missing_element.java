link->https://www.geeksforgeeks.org/problems/k-th-missing-element3635/1?page=2&category=Arrays&company=Amazon&difficulty=Easy&sortBy=submissions


int KthMissingElement(int arr[], int n, int k)
    {
       for(int i=0;i<n-1;i++){
           int  difference=arr[i+1]-arr[i]-1;
           if(difference-k>=0 )
           {
               return arr[i]+k;
           }
           else
           {   
               k=k-difference;
           }
        }
        return -1;
    }