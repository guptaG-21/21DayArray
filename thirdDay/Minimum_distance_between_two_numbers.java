link->https://www.geeksforgeeks.org/problems/minimum-distance-between-two-numbers/1?page=1&category=Arrays&company=Amazon&difficulty=Easy&sortBy=submissions



int minDist(int a[], int n, int x, int y) {
        // code here
        int xDist = -1;
        int yDist = -1;
        int res = Integer.MAX_VALUE;
        
        for(int i=0;i<n;i++){
            if(a[i] == x){
                xDist = i;
            }
            if(a[i] == y){
                yDist = i;
            }
            if(xDist!=-1 && yDist!=-1){
                res = Math.min(res,Math.abs(xDist-yDist));
            }
        }
        if(res == Integer.MAX_VALUE ){
            return -1;
        }
        return res;
    }