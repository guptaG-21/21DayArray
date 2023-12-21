link->https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1?page=1&category=Arrays&company=Amazon&difficulty=Easy&sortBy=submissions


int missingNumber(int array[], int n) {
        int val = (n*(n+1)/2);
        int sum = 0;
        for(int num:array){
            sum+=num;
        }
        int miss = val - sum;
        return miss;
    }