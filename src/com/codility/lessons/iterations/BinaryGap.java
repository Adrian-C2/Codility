package com.codility.lessons.iterations;

public class BinaryGap {

	public static void main(String[] args) {
		//System.out.println("Solution is ->"+Integer.toBinaryString(529));
		
		System.out.println("Solution is -> "+solution(529));
	}
	
	public static int solution(long n) {
		int gap=0, max=0;
		boolean countLast = false;
		
		String binary = Long.toBinaryString(n);
		
		String[] gaps = binary.split("1");
		
		if(binary.toCharArray()[binary.length()-1] == '1')
			countLast=true;
		
		if(countLast)
			max=gaps.length;
		else
			max=gaps.length-1;
		
		for(int i=0; i<max; i++) {
			if(gap<gaps[i].length())
				gap=gaps[i].length();
		}
		
		return gap;
	}

}
