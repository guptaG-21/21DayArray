link->https://www.geeksforgeeks.org/problems/pairs-with-positive-negative-values3719/1?page=2&category=Arrays&company=Amazon&difficulty=Easy&sortBy=submissions


public List<Long> PosNegPair(long a[], long n)
    {
        List<Long> list = new ArrayList<>();
        Map<Long, Integer> map = new HashMap<>();
        Arrays.sort(a);
        for (int i = 0; i < n; i++)
        {
            long v = a[i];
    
            map.put(v, map.getOrDefault(v, 0) + 1);
    
            if (map.getOrDefault(v, 0) > 0 && map.getOrDefault(-v, 0) > 0)
            {
                if (v > 0)
                    v = -v;
    
                list.add(v);
                list.add(-v);
    
                map.put(v, map.get(v) - 1);
                map.put(-v, map.get(-v) - 1);
            }
        }
        return list;
    }