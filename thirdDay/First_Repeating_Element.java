link->https://www.geeksforgeeks.org/problems/first-repeating-element4018/1?page=1&category=Arrays&company=Amazon&difficulty=Easy&sortBy=submissions




public static int firstRepeated(int[] arr, int n) {
        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<n;i++){
            if( map.get(arr[i])>1){
                return i+1;
            }
        }
        return -1;
    }