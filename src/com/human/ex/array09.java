package com.human.ex;

import java.util.Scanner;

public class array09 {
//4�ڸ� ���� �Է¹޾� ũ�� 4�� �迭�� �����ϰ� �������
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a[] = new int[4];
		System.out.print("�� �ڸ� ������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		a[0]=num/1000;
		a[1]=num%1000/100;
		a[2]=num%100/10;
		a[3]=num%10;
		for(int i=0;i<a.length;i++) {
			System.out.printf("a[%d]�� �� : %d\n", i, a[i]);
		}
			System.out.printf("������� : %d %d %d %d", a[3],a[2],a[1],a[0]);
		
		
		sc.close();
	}
}
