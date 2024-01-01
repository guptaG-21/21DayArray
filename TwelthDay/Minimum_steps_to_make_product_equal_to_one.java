link->https://www.geeksforgeeks.org/problems/minimum-steps-to-make-product-equal-to-one/1?page=3&category=Arrays&company=Amazon&difficulty=Easy&sortBy=submissions



static int makeProductOne(int[] arr, int N) {
       int countPos = 0;
       int countNeg = 0;
       int countZero = 0;
       int count = 0;
       for(int i=0;i<N;i++){
           int num = arr[i];
           if(num<0){
               countNeg++;
               int diff = -1-num;
               count+=diff;
           }else if(num>0){
               countPos++;
               int diff = num-1;
               count+=diff;
           }else{
               countZero++;
               count++;
           }
       }
       if(countZero == 0 && countNeg%2!=0){
           count+=2;
       }
       return count;
    }