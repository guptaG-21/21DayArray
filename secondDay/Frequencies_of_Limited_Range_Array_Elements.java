link->https://www.geeksforgeeks.org/problems/frequency-of-array-elements-1587115620/1?page=1&category=Arrays&company=Amazon&difficulty=Easy&sortBy=submissions




public static void frequencyCount(int arr[], int N, int P)
    {
       
       Map<Integer,Integer>map = new HashMap<>();
       for(int i = 0;i<N;i++){
           if(map.containsKey(arr[i])){
               map.put(arr[i],map.getOrDefault(arr[i],0)+1);
           }else{
               map.put(arr[i],1);
           }
       }
       
       for(int i = 0;i<N;i++){
           if(map.containsKey(i+1)){
               arr[i] = map.get(i+1);
           }else{
               arr[i] = 0;
           }
       }
    }