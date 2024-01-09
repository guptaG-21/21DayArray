link->https://www.geeksforgeeks.org/problems/trapping-rain-water-1587115621/1?page=1&category=Arrays&company=Amazon&difficulty=Medium&sortBy=submissions



static long trappingWater(int arr[], int n) { 
        int[] leftMax = new int[n];
        leftMax[0] = arr[0];
        for(int i =1;i<n;i++){
            leftMax[i] = Math.max(arr[i],leftMax[i-1]);
        }
        
        int[] rightMax = new int[n];
        rightMax[n-1] = arr[n-1];
        for(int i =n-2;i>=0;i--){
            rightMax[i] = Math.max(arr[i],rightMax[i+1]);
        }
        long waterTrap = 0;
        for(int i=0;i<n;i++){
            int waterLevel = Math.min(leftMax[i],rightMax[i]);
            waterTrap+=(waterLevel-arr[i])*1;
        }
        return waterTrap;
    } 