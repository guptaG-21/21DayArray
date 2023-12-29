link->https://www.geeksforgeeks.org/problems/equal-left-and-right-subarray-sum--170647/1?page=2&category=Arrays&company=Amazon&difficulty=Easy&sortBy=submissions

int equalSum(int [] A, int N) {
		//Write your code here
		if(N==1){
		    return 1;
		}
		for(int i=1;i<N;i++){
		    A[i]+=A[i-1];
		}
		for(int i=1;i<N;i++){
		    if(A[i-1]==A[N-1]-A[i]){
		        return i+1;
		    }
		}
		
		return -1;
	}