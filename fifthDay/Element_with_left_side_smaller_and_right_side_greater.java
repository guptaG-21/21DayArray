link->https://www.geeksforgeeks.org/problems/unsorted-array4925/1?page=1&category=Arrays&company=Amazon&difficulty=Easy&sortBy=submissions


public int findElement(int arr[], int n){
        int gr[] = new int[n];
        int sm[] = new int[n];
        gr[0] = arr[0];
        sm[n-1] = arr[n-1];
        for(int i=1;i<n;i++){
            gr[i] = Math.max(arr[i],gr[i-1]);
        }
        
        for(int i=n-2;i>=0;i--){
            sm[i] = Math.min(arr[i],sm[i+1]);
        }
        
        for(int i=1;i<n-1;i++){
            if(gr[i]<=arr[i] && sm[i]>=arr[i]){
                return arr[i];
            }
        }
        
        return -1;
    }