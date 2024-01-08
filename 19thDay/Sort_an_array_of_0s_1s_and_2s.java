link->https://www.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1?page=1&category=Arrays&company=Amazon&difficulty=Medium&sortBy=submissions




public static void sort012(int a[], int n)
    {
        // code here 
        int zero = 0;
        int one = 0;
        int two = n-1;
        while(one<=two){
            if(a[one] == 0){
                swap(a,zero,one);
                zero++;
                one++;
            }else if(a[one] == 2){
                swap(a,one,two);
                two--;
            }else{
                one++;
            }
        }
    }
    static void swap(int[]arr,int f,int s){
        int tmp = arr[f];
        arr[f] = arr[s];
        arr[s] = tmp;
    }