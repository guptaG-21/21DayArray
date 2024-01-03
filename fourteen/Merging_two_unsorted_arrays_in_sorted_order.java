link->https://www.geeksforgeeks.org/problems/merging-two-unsorted-arrays-in-sorted-order1020/1?page=3&category=Arrays&company=Amazon&difficulty=Easy&sortBy=submissions

void sortedMerge(long A[], long B[], long res[], int N,int M)
    {
       PriorityQueue<Long> pq = new PriorityQueue<>();
        for(long i : A)pq.offer(i);
        for(long i : B)pq.offer(i);
        
        int c =0;
        while(pq.size()>0)
        res[c++] = pq.poll();
    }