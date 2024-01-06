link->https://www.geeksforgeeks.org/problems/kth-distance3757/1?page=4&category=Arrays&company=Amazon&difficulty=Easy&sortBy=submissionsboolean 




checkDuplicatesWithinK(int[] arr, int n, int k) {
        HashSet<Integer> m = new HashSet<>();
        for(int i=0;i<n;i++){
            if(m.contains(arr[i])){
                return true;
            }else{
              m.add(arr[i]);
            }
            
            if(i>=k)m.remove(arr[i-k]);
        }
        return false;
    }