package com.human.ex;

import java.util.Arrays;
import java.util.Random;

public class array02 {
//�迭�� ���� 3 �������Ѽ� ������ �迭�� �ֱ�
	public static void main(String[] args) {
		int array[] = new int[10];
		Random rd = new Random();
		
		for(int i=0;i<array.length;i++) {
			int randomNumber = rd.nextInt(100);
			array[i] = randomNumber;
			
		}
		
		System.out.println(Arrays.toString(array));
		
		for(int i=0;i<array.length;i++) {
			array[i]=array[i]+3;
		}
		
		System.out.println(Arrays.toString(array));
		
	}

}
