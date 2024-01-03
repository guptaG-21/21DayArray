link->https://www.geeksforgeeks.org/problems/fill-array-by-1s0920/1?page=3&category=Arrays&company=Amazon&difficulty=Easy&sortBy=submissions


 public long minMoves(long arr[], long n)
    {
       long c = 0;
       long tmp = 0;
       int prevI = -1;

       for(int i=0;i<arr.length;i++){
           if(arr[i] == 1){
               if(prevI == -1){
                   prevI = i;
                   c = Math.max(c,tmp);
                   tmp = 0;
               }else{
                   prevI = i;
                   c = Math.max(c,(tmp+1)/2);
                   tmp = 0;
               }
           }else{
               tmp++;
           }
       }
       c = Math.max(c,tmp);
       if(prevI == -1){
           c=-1;
       }
       
       return c;
    }