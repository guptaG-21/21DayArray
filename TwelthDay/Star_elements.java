link->https://www.geeksforgeeks.org/problems/start-elements3447/1?page=3&category=Arrays&company=Amazon&difficulty=Easy&sortBy=submissions

public static int[] getStarAndSuperStar(int[] arr, int n) {
        Stack<Integer> st = new Stack<>();
        int max = Integer.MIN_VALUE;
        int flag = 0;
        for(int i=n-1;i>=0;i--){
            if(arr[i]>max){
                max = arr[i];
                st.push(arr[i]);
                flag = 0;
            }else if(arr[i] == max){
                flag = 1;
            }
        }
        int ans[] = new int[st.size()+1];
        if(flag == 1){
            st.push(-1);
        }else{
            st.push(max);
        }
        int indx = 0;
        while(!st.isEmpty()){
            ans[indx] = st.pop();
            indx++;
        }
        return ans;
    }