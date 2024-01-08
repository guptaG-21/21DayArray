link->https://www.geeksforgeeks.org/problems/majority-element-1587115620/1?page=1&category=Arrays&company=Amazon&difficulty=Medium&sortBy=submissions



static int majorityElement(int a[], int size)
    {
        int count =0;
        int elmnt = 0;
        for(int val:a){
            if(count==0){
                elmnt = val;
                count++;
            }else if(val == elmnt){
                count++;
            }else if(val!=elmnt){
                count--;
            }
        }
        int count2 = 0;
        for(int i = 0;i<size;i++){
            if(a[i] == elmnt){
                count2++;
            }
        }
        if(count2>(size/2)){
            return elmnt;
        }
        return -1;
    }