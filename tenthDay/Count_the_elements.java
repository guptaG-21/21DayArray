link->https://www.geeksforgeeks.org/problems/count-the-elements1529/1?page=2&category=Arrays&company=Amazon&difficulty=Easy&sortBy=submissions





public static int[] find(int a[],int b[],int q[])
    {
        int[] ans = new int[q.length];

         HashMap<Integer,Integer> map = new HashMap<>();
         for(int i=0; i<b.length; i++){
             map.put(b[i],map.getOrDefault(b[i],0)+1);  
         }
         int maxA = Integer.MIN_VALUE;
         for(int x: a){
             maxA = Math.max(maxA,x); 
         }
        for(int i=0; i<= maxA; i++){
              map.put(i,map.getOrDefault(i,0)+map.getOrDefault(i-1,0));
        }
         for(int i=0; i<q.length; i++){
              ans[i] = map.get(a[q[i]]); 
          }
         return ans;
    }