/*
 * A zero-indexed array A consisting of N integers is given. Rotation of the array means that each element is shifted 
 * right by one index, and the last element of the array is also moved to the first place.
 * 
 * For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7]. The goal is to rotate array A K times; 
 * that is, each element of A will be shifted to the right by K indexes.
 * 
 * Write a function:
 * 
 * struct Results solution(int A[], int N, int K);
 * that, given a zero-indexed array A consisting of N integers and an integer K, returns the array A rotated K times.
 * 
 * For example, given array A = [3, 8, 9, 7, 6] and K = 3, the function should return [9, 7, 6, 3, 8].
 * 
 * Assume that:
 * 
 * N and K are integers within the range [0..100];
 * each element of array A is an integer within the range [−1,000..1,000].
 * In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.
 * 
 */

package com.codility.lessons.arrays;

public class CyclicRotation {

	/*
	 * @Description This function take an array A and shift N time
	 * 
	 * @Input an Array A int[] with N integers values and an integer K of how many time will be shift.
	 * 
	 * @Return an Array int[] with the values shifted
	 */
	public static int[] solution(int[] A, int K) {
		if(A == null) {
			return new int[]{0};
		}
		
		if(A.length <= 1 || K == 0) {
			return A;
		}
		
		int[] results = new int[A.length]; 
		
		for(int i=K;i>0;) {
			if(i>=A.length)
				results = smallRotation(A,(A.length));
			else
				results = smallRotation(A,(i));
			
			i=i-A.length;
		}
		
		return results;
	}
	
	private static int[] smallRotation(int[] A, int K) {
		int[] results = new int[A.length]; 
		
		for(int i = A.length-K, p=0; i<A.length; i++, p++) {
			results[p] = A[i];
		}
		
		for(int i = K, p=0; i<A.length; i++, p++) {
			results[i] = A[p];
		}
		
		return results;
	}
}
