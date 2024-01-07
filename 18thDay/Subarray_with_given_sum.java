link->https://www.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1?page=1&category=Arrays&company=Amazon&difficulty=Medium&sortBy=submissions



static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
       ArrayList<Integer> list = new ArrayList<>();
       
      if(n>1 && s==0){
          list.add(-1);
          return list;
      }
       int i=0,j=0;
       int currSum = arr[0];
       
       while(j<n){
           if(currSum == s){
               list.add(i+1);
               list.add(j+1);
               return list;
           }else if(currSum<s){
               j++;
               if(j>=n) break;
               currSum+=arr[j];
           }else{
               currSum-=arr[i];
               i++;
           }
       }
       list.add(-1);
       return list;
    }