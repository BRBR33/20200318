package com.human.ex;

import java.util.Arrays;
import java.util.Scanner;

public class array05 {
//�迭�� ���� �Է��� ����ŭ �������� �̵��ϰ�, �� �ڸ����� 0 ä�� �ֱ�
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		Scanner sc = new Scanner(System.in);
		
		System.out.println(Arrays.toString(a));
		System.out.print("�̵��� ���ϴ� ���ڸ� �Է��ϼ��� : ");
		int input = sc.nextInt();
		
		for(int i=0;i<a.length;i++) {
			if((i+input)<a.length) {
				a[i] = a[i+input];
			}else {
				a[i] = 0;
			}
			
		}
		
		System.out.println(Arrays.toString(a));
		
		sc.close();
	}

}
