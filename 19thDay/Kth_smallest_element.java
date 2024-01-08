link->https://www.geeksforgeeks.org/problems/kth-smallest-element5635/1?page=1&category=Arrays&company=Amazon&difficulty=Medium&sortBy=submissions



class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
       PriorityQueue<Integer> pq = new PriorityQueue<>();
       for(int i = l;i<=r;i++){
           pq.add(arr[i]);
       }
       if(k>0){
           for(int i = 0;i<k-1;i++){
           	pq.poll();
           }
       }
       int a = pq.poll();
       return a;
    } 
   
}