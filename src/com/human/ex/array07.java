package com.human.ex;

import java.util.Scanner;

public class array07 {
//5���� ���� ������ �Է��ϰ� �ְ� ������ ����ϴ� �ڵ� , 70�� �̻� �л� ���� ��� ����ϴ� �ڵ�
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int max = 0;
		int count = 0;
		int score[] = new int[5];
		System.out.println("���� ������ �Է��ϼ���");
		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();

			if (score[i] > max) {
				max = score[i];
			}
			if(score[i]>=70) {
				count++;
			}
		}
		for (int i = 0; i < score.length; i++) {
			System.out.printf("%d��° ����� ���� ������ %d�� �Դϴ�.", i + 1, score[i]);
			System.out.println("");
		}
		System.out.printf("�ְ� ������ %d�� �Դϴ�.", max);
		System.out.println("");
		System.out.println("70�� �̻��� �л��� "+count+"���Դϴ�.");
		sc.close();
	}
}
