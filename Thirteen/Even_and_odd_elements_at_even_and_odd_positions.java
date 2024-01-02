link->https://www.geeksforgeeks.org/problems/even-and-odd-elements-at-even-and-odd-positions1342/1?page=3&category=Arrays&company=Amazon&difficulty=Easy&sortBy=submissions


ArrayList<Long> arrangeOddAndEven(long a[], int n)
    {
        int pos =0;
        ArrayList<Long> ans = new ArrayList<>();
        List<Long> even = new ArrayList<>();
        List<Long> odd = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                even.add(a[i]);
            }else{
                odd.add(a[i]);
            }
        }
        int i =0;
        int j = 0;
        while(i<even.size() && j<odd.size()){
            ans.add(even.get(i));
            i++;
            ans.add(odd.get(j));
            j++;
        }
        while(i<even.size()){
            ans.add(even.get(i));
            i++;
        }
        while(j<odd.size()){
            ans.add(odd.get(j));
            j++;
        }
        return ans;
    }