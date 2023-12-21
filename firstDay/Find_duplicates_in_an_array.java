link->https://www.geeksforgeeks.org/problems/find-duplicates-in-an-array/1?page=1&category=Arrays&company=Amazon&difficulty=Easy&sortBy=submissions



 public static ArrayList<Integer> duplicates(int arr[], int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] ans = new int[n];
        
        for(int i=0;i<arr.length;i++){
            ans[arr[i]]++;
        }
        for(int i=0;i<arr.length;i++){
            if(ans[i]>1){
                list.add(i);;
            }
        }
        if(list.size() == 0){
            list.add(-1);
        }
        return list;
    }