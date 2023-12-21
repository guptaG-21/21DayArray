link->https://www.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/1?page=1&category=Arrays&company=Amazon&difficulty=Easy&sortBy=submissions





int getPairsCount(int[] arr, int n, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int i =0;i<n;i++){
            int num = k - arr[i];
            if(map.containsKey(num)){
                count+=map.get(num);
            }
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        return count;
    }