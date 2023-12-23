link->https://www.geeksforgeeks.org/problems/key-pair5616/1?page=1&category=Arrays&company=Amazon&difficulty=Easy&sortBy=submissions



boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        HashSet<Integer> map = new HashSet<>();
        
        for(int val:arr){
            if(map.contains(x-val)){
                return true;
            }
            map.add(val);
        }
        return false;
    }