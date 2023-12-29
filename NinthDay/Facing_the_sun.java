
link->https://www.geeksforgeeks.org/problems/facing-the-sun2126/1?page=2&category=Arrays&company=Amazon&difficulty=Easy&sortBy=submissions


 int countBuildings(int h[], int n) {
        // code here
        int count = 0;
        int max = Integer.MIN_VALUE;
        for(int val:h){
            if(val>max){
                max = val;
                count++;
            }
        }
        return count;
    }