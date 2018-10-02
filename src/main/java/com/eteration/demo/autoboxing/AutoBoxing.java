package com.eteration.demo.autoboxing;
public class AutoBoxing {

	public static void main(String[] args) {
		
		long sum = 0L;
		long startTime = System.currentTimeMillis();

		for(long i=0;i<Integer.MAX_VALUE ;i++){
			sum+=i;
		}
		
		long breakTime = System.currentTimeMillis();

		System.out.println("First sum is calculated in "+(breakTime-startTime));

		
		Long sum2 = 0L;
		
		for(long i=0;i<Integer.MAX_VALUE ;i++){
			sum2+=i;
		}
		
		
		System.out.println("Second sum is calculated in "+(System.currentTimeMillis()-breakTime));

		

	}

}
