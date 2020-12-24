package com.codility.lessons;

public class Equi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {-1, 3, -4, 5, 1, -6, 2, 1};
		
		System.out.println("Case E -> "+solution(A));
	}
	
	public static int solution(int[] A) {
		if(A==null)
			return -1;
		
		int n = A.length;
        
        if(n==0)
            return -1;
            
        long sum = 0;
        
        for(int i=0;i<n;i++) 
            sum+=(long) A[i];
        
        long sum_left = 0;    
        for(int i=0;i<n;i++) {
            long sum_right = sum - sum_left - (long) A[i];
            
            if (sum_left == sum_right) 
                return i;
                
            sum_left += (long) A[i];
        } 
        return -1; 
    }
}
