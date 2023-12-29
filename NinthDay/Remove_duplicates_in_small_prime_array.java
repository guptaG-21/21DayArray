link->https://www.geeksforgeeks.org/problems/remove-duplicates-in-small-prime-array/1?page=2&category=Arrays&company=Amazon&difficulty=Easy&sortBy=submissions


ArrayList<Integer> removeDuplicate(int arr[], int n)
    {
        // code here 
        ArrayList<Integer>list = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(list.contains(arr[i])){
                continue;
            }else{
                list.add(arr[i]);
            }
        }
        return list;
    }