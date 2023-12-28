link->https://www.geeksforgeeks.org/problems/four-elements2452/1?page=2&category=Arrays&company=Amazon&difficulty=Easy&sortBy=submissions


boolean find4Numbers(int A[], int n, int X) 
    {
        Arrays.sort(A);
        for(int i=0;i<n-3;i++){
            for(int j=i+1;j<n-2;j++){
                int start = j+1;
                int end = n-1;
                int target = X - A[i]-A[j];
                while(start<end){
                    int sum = A[start]+A[end];
                    if(sum == target){
                        return true;
                    }else if(sum>target){
                        end--;
                    }else{
                        start++;
                    }
                }
            }
        }
        return false;
    }