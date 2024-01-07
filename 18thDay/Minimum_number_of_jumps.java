link->https://www.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1?page=1&category=Arrays&company=Amazon&difficulty=Medium&sortBy=submissions



static int minJumps(int[] arr){
       int n = arr.length;
       int maxI = Integer.MIN_VALUE;
       int cov = 0;
       int lastI = 0;
       int jump = 0;
       
       if(n==1){
           return 0;
       }
       
       for(int i=0;i<n;i++){
           maxI = Math.max(maxI,i+arr[i]);
           if(i==lastI){
               lastI = maxI;
               jump++;
               if(lastI>=n-1){
                   return jump;
               }
           }
       }
       return -1;
    }