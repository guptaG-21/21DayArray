link->https://www.geeksforgeeks.org/problems/remove-all-duplicates-from-a-given-string4321/1?page=2&category=Arrays&company=Amazon&difficulty=Easy&sortBy=submissions




String removeDuplicates(String str) {
        // code here
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        String s = "";
        for(Map.Entry<Character,Integer>entry:map.entrySet()){
            s = s+entry.getKey();
        }
        return s;
    }