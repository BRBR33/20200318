package com.human.ex;

import java.util.Scanner;

public class array12 {
//�ζ� ���α׷�
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int lotto[] = new int[6];
		
		System.out.print("�ζǹ�ȣ �Է� : ");
		lotto[0] = sc.nextInt();
		
		for (int i = 1; i < lotto.length; i++) {
			System.out.print("�ζǹ�ȣ �Է� : ");
			lotto[i]= sc.nextInt();
			for(int j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) {
					System.out.println("���� ��ȣ�� �ֽ��ϴ�!");
					i--;
					break;
				}
			}		
		}
		System.out.print("�Էµ� �ζǹ�ȣ : ");
		for(int i=0;i<lotto.length;i++) {
		System.out.print(lotto[i]);
		System.out.print(" ");
		}
		sc.close();
	}
}
