link->https://www.geeksforgeeks.org/problems/find-equal-point-in-string-of-brackets2542/1?page=3&category=Arrays&company=Amazon&difficulty=Easy&sortBy=submissions


public long countSub(String str) {
        // Your code goes here 
        long countPrev = 0;
        long countNext = 0;
        
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i) == ')'){
                countNext++;
            }
        }
        
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == '('){
                countPrev++;
            }
            if(ch == ')'){
                countNext--;
            }
            if(countPrev == countNext){
                return (long)i+1;
            }
        }
        return 0;
    }