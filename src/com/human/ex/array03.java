package com.human.ex;

import java.util.Arrays;

public class array03 {
//배열의 요소를 복사 ABC -> ABCCBA
	public static void main(String[] args) {
		String array[] = new String[6];
		array[0]="A";
		array[1]="B";
		array[2]="C";
		
		System.out.println(Arrays.toString(array));
		
		array[3]=array[2];
		array[4]=array[1];
		array[5]=array[0];
		System.out.println(Arrays.toString(array));
	}

}
