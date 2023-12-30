link->https://www.geeksforgeeks.org/problems/buildings-receiving-sunlight3032/1?page=2&category=Arrays&company=Amazon&difficulty=Easy&sortBy=submissions


public static int longest(int arr[],int n)
    {
        int max = Integer.MIN_VALUE;
        int count = 0;
        for(int val:arr){
            if(max<=val){
                max = val;
                count++;
            }
        }
        return count;
    }