link->https://www.geeksforgeeks.org/problems/word-with-maximum-frequency0120/1?page=3&category=Arrays&company=Amazon&difficulty=Easy&sortBy=submissions



    public static String maximumFrequency (String S) {
        String[] arr = S.split(" ");
        Map<String,Integer> m = new LinkedHashMap<>();
        for(String s:arr){
            m.put(s,m.getOrDefault(s,0)+1);
        }
        String ans = "";
        String keyS = "";
        int count =0;
        for(String key:m.keySet()){
            if(m.get(key)>count){
                count = m.get(key);
                keyS = key;
            }
        }
        ans = ans+keyS+" "+count;
        return ans;
    }