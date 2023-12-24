link->https://www.geeksforgeeks.org/problems/move-all-zeroes-to-end-of-array0751/1?page=1&category=Arrays&company=Amazon&difficulty=Easy&sortBy=submissions


void pushZerosToEnd(int[] arr, int n) {
       int j = -1;
       for(int i =0;i<n;i++){
           if(arr[i] == 0){
               j=i;
               break;
           }
       }
       if(j!=-1 && j<n-1){
           for(int i=j+1;i<n;i++){
               if(arr[i]!=0){
                   swap(arr,i,j);
                   j++;
               }
            }
       }
       
    }
       
    void swap(int[] arr,int first,int second){
        int tmp = arr[first];
        arr[first] = arr[second];
        arr[second] = tmp;
    }