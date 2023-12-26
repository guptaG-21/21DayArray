link->https://www.geeksforgeeks.org/problems/max-sum-without-adjacents2430/1?page=2&category=Arrays&company=Amazon&difficulty=Easy&sortBy=submissions


int findMaxSum(int arr[], int n) {
        for(int i=1;i<n;i++){
            arr[i] = Math.max(arr[i]+((i>1)?arr[i-2]:0),arr[i-1]);
        }
        return arr[n-1];
    }