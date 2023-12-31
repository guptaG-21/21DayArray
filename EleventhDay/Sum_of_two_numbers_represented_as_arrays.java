link->https://www.geeksforgeeks.org/problems/sum-of-two-numbers-represented-as-arrays3110/1?page=3&category=Arrays&company=Amazon&difficulty=Easy&sortBy=submissions


ArrayList<Integer> findSum(int a[], int b[]) {
       int n = a.length;
       int m = b.length;
       ArrayList<Integer>ans = new ArrayList<>();
       int i = n-1;
       int j = m-1;
       int c = 0;
       while(i>=0 && j>=0){
           int val1 = a[i];
           int val2 = b[j];
           int sum = val1+val2+c;
           c = sum/10;
           sum = sum%10;
           ans.add(sum);
           i--;
           j--;
       }
       while(i>=0){
           int val = a[i];
           int sum = val+c;
           c = sum/10;
           sum = sum%10;
           ans.add(sum);
           i--;
       }
       while(j>=0){
           int val = b[j];
           int sum = val+c;
           c = sum/10;
           sum = sum%10;
           ans.add(sum);
           j--;
       }
       while(c!=0){
           int sum = c;
           c = sum/10;
           sum = sum%10;
           ans.add(sum);
       }
       Collections.reverse(ans);
       return ans;
    }