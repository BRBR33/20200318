package com.human.ex;

import java.util.Scanner;

public class array08 {
//5���� ���� ������ �Է��ϰ� �ְ� ������ ����ϴ� �ڵ� , 70�� �̻� �л� ���� ��� ����ϴ� �ڵ�
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int kor[] = new int[5];
		int eng[] = new int[5];
		int math[] = new int[5];
		int korSum = 0;
		int engSum = 0;
		int mathSum = 0;
		double korAvg = 0;
		double engAvg = 0;
		double mathAvg = 0;
		
		
		for(int i=0;i<5;i++) {
			System.out.print((i+1)+"�� �л� ���� ���� �Է� : ");
			kor[i] = sc.nextInt();
			System.out.print((i+1)+"�� �л� ���� ���� �Է� : ");
			eng[i] = sc.nextInt();
			System.out.print((i+1)+"�� �л� ���� ���� �Է� : ");
			math[i] = sc.nextInt();
		}
		
		for(int i=0;i<5;i++) {
			korSum = korSum + kor[i];
			engSum = engSum + eng[i];
			mathSum = mathSum + math[i];
		}
		
		korAvg = korSum / 5;
		engAvg = engSum / 5;
		mathAvg = mathSum / 5;
		
		System.out.println("��������:"+korSum+" ���: "+korAvg);
		System.out.println("��������:"+engSum+" ���: "+engAvg);
		System.out.println("��������:"+mathSum+" ���: "+mathAvg);
		sc.close();
	}
}
