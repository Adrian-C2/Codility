package com.codility.lessons.arrays;

import java.util.*;

public class OddOccurrencesInArray {

	public static void main(String[] args) {
		//Value
		int[] A = {9,3,9,3,9,7,9};
		
		//Test #1
		System.out.println("Test -> ["+solution(A)+"]");
	}

	/*
	 * @Description 
	 * 
	 * @Input 
	 * 
	 * @Return 
	 */
	public static int solution(int[] A) {
		int result = 0;
		
		if(A == null) 
			return 0;
		else if(A.length == 0)
			return 0;
		else if(A.length == 1)
			return A[0];
		
		HashMap<Integer,Integer> occurs = new HashMap<>();
		
        for(int i=0;i<A.length;i++){
           if(occurs.containsKey(A[i]) && occurs.get(A[i]) == 1){
                occurs.remove(A[i]);  
            }else{
                occurs.put(A[i],1);
            }
        }
        
        for(int key : occurs.keySet()){
            return key;    
        }
		
		return result;
	}

}
