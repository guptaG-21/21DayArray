link->https://www.geeksforgeeks.org/problems/minimum-energy1107/1?page=3&category=Arrays&company=Amazon&difficulty=Easy&sortBy=submissions




public static int minEnergy(int a[], int n)
    {
        int stepReq = 1;
        int sum = 0;
        for(int val:a){
            sum+=val;
            if(sum<0){
                stepReq+=Math.abs(sum);
                sum = 0;
            }
        }
        return stepReq;
    }