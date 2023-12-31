link->https://www.geeksforgeeks.org/problems/single-number1014/1?page=3&category=Arrays&company=Amazon&difficulty=Easy&sortBy=submissions



int getSingle(int arr[], int n) {
        int ans = 0;
        for(int i =0;i<n;i++){
            ans = ans^arr[i];
        }
        return ans;
    }