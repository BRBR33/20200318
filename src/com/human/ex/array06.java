package com.human.ex;

import java.util.Arrays;

public class array06 {
//�� �迭�� �����ϰ� �ε����� ���� �迭�� ���� ���ο� �迭�� �־��.
	public static void main(String[] args) {
		
		int a[] = {1,9,3,6,5,4,7,8,2,10};
		int b[] = {7,8,2,5,10,1,3,6,4,9};
		int c[] = new int[10];
		
		for(int i=0;i<c.length;i++) {
			c[i] = a[i]*b[i];
		}
		
		System.out.println(Arrays.toString(c));
				
	}
}
