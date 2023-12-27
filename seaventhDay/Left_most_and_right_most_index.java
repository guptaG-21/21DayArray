link->https://www.geeksforgeeks.org/problems/find-first-and-last-occurrence-of-x0849/1?page=2&category=Arrays&company=Amazon&difficulty=Easy&sortBy=submissions



public pair indexes(long v[], long x)
    {
       int fst = -1;
       int scnd = -1;
       int s=0;
       int e=v.length-1;
       
       //for first occ
       while(s<=e){
           int m = s+(e-s)/2;
           if(v[m]>x){
               e=m-1;
           }else if(v[m]<x){
               s=m+1;
           }else{
               if(m==0 || v[m]!=v[m-1]){
                   fst = m;
                   break;
               }else{
                   e=m-1;
               }
           }
       }
       
       s=0;
       e=v.length-1;
       while(s<=e){
           int m = s+(e-s)/2;
           if(v[m]>x){
               e=m-1;
           }else if(v[m]<x){
               s=m+1;
           }else{
               if(m==v.length-1 || v[m]!=v[m+1]){
                   scnd = m;
                   break;
               }else{
                   s=m+1;
               }
           }
       }
       
       pair p = new pair(fst,scnd);
       return p;
       
    }