package com.human.ex;

import java.util.Scanner;

public class array13 {
//�Էµ� ���� ����� 0���� ����ϸ鼭 �迭 �����ϱ�
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a[] = new int[50];
		int b[] = new int[50];
		System.out.println("����(����� �ڸ��� 0���� ����)�� �Է��ϼ���: ");
		int input = sc.nextInt();
		
		System.out.println("�迭 a :");
		for(int i=0;i<a.length;i++) {
			a[i]=i+1;
			System.out.print(a[i]+"\t");
			if((i)%10==9) {
				System.out.println("");
			}
		}
		System.out.println("");
		System.out.println("�迭 b :");
		for(int i=0;i<b.length;i++) {
			if((i+1)%input==0) {
				b[i]=0;
			}else {
				b[i]=a[i];
			}
			System.out.print(b[i]+"\t");
			if((i)%10==9) {
				System.out.println("");
			}
		}

		
		sc.close();
	}
}
