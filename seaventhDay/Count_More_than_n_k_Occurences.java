link->https://www.geeksforgeeks.org/problems/count-element-occurences/1?page=2&category=Arrays&company=Amazon&difficulty=Easy&sortBy=submissions




 public int countOccurence(int[] arr, int n, int k) 
    {
        // your code here,return the answer
        Map<Integer,Integer> map = new HashMap<>();
        int occCount = n/k;
    
        for(int val:arr){
            map.put(val,map.getOrDefault(map.get(val),0)+1);
            
        }
        int count = 0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>occCount){
                count++;
            }
        }
        return count;
    }