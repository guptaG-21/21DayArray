link->https://www.geeksforgeeks.org/problems/check-if-array-contains-contiguous-integers-with-duplicates-allowed2046/1?page=2&category=Arrays&company=Amazon&difficulty=Easy&sortBy=submissions





public static boolean areElementsContiguous (int arr[], int n) {
        Set<Integer>set = new HashSet<>();
        for(int i=0;i<n;i++) {
        set.add(arr[i]);
        }
        int count=0;
        for(Integer i:set) {
                if (count+1!=set.size() && !set.contains(i+1)) {
                    return false;
            }
            count++;
        }
        return true;
    }