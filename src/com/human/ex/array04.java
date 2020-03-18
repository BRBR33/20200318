package com.human.ex;

import java.util.Arrays;
import java.util.Random;

public class array04 {
//문자열 안의 글자들을 섞기
	public static void main(String[] args) {
		String array[] = {"a","p","p","l","e"};
		System.out.println(Arrays.toString(array));
		
		Random rd = new Random();
		
		for(int i=0;i<array.length;i++) {
			int num1 = rd.nextInt(5);
			int num2 = rd.nextInt(5);
			int pos1 = num1 % array.length;
			int pos2 = num2 % array.length;
			
			String temp; 
			temp= array[pos1];
			array[pos1] = array[pos2];
			array[pos2] = temp;
		}
		System.out.println(Arrays.toString(array));
		
	}

}
