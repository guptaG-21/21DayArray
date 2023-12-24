link->https://www.geeksforgeeks.org/problems/array-of-alternate-ve-and-ve-nos1401/1?page=1&category=Arrays&company=Amazon&difficulty=Easy&sortBy=submissions



void rearrange(int arr[], int n) {
        
        Queue<Integer> pos = new ArrayDeque<>();
        Queue<Integer> neg = new ArrayDeque<>();
        
        for(int i =0;i<n;i++){
            if(arr[i]<0){
                neg.add(arr[i]);
            }else{
                pos.add(arr[i]);
            }
        }
        int k =0;
        while(k<n){
            if(!pos.isEmpty()){
                arr[k++] = pos.poll();
            }
            if(k<n && !neg.isEmpty()){
                arr[k++] = neg.poll();
            }
        }
    }