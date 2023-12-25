link->https://www.geeksforgeeks.org/problems/convert-array-into-zig-zag-fashion1638/1?page=1&category=Arrays&company=Amazon&difficulty=Easy&sortBy=submissions




public void zigZag(int a[], int n){
        for(int i=0;i<n-1;i++){
            if(i%2==0 && a[i]>a[i+1]){
                swap(a,i,i+1);
            }else if(i%2 == 1 && a[i]<a[i+1]){
                swap(a,i,i+1);
            }
        }
    }
    
    public void swap(int array[], int a, int b){
        int temp=array[a];
        array[a] = array[b];
        array[b] = temp;
    }