package com.human.ex;

import java.util.Arrays;
import java.util.Random;

public class array00 {
//�迭�� ������ ���ڸ� �ְ� �� �߿��� ���� ū �� , ���� ���� �� ���ϱ�
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
		System.out.println("�迭 �ȿ��� �ִ��� "+max+" �Դϴ�.");
		System.out.println("�迭 �ȿ��� �ּڰ��� "+min+" �Դϴ�.");
		
		
	}

}
