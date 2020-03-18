package com.human.ex;

import java.util.Arrays;
import java.util.Random;

public class array00 {
//배열에 랜덤한 숫자를 넣고 그 중에서 가장 큰 수 , 가장 작은 수 구하기
	public static void main(String[] args) {
		int array[] = new int[10];
		Random rd = new Random();
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
	
		for(int i=0;i<array.length;i++) {
			int randomNumber = rd.nextInt(100);
			array[i] = randomNumber;
			
			if(array[i]>max) {
				max = array[i];
			}
			if(array[i]<min) {
				min = array[i];
			}
		
		}
		
		System.out.println(Arrays.toString(array));
		System.out.println("배열 안에서 최댓값은 "+max+" 입니다.");
		System.out.println("배열 안에서 최솟값은 "+min+" 입니다.");
		
		
	}

}
