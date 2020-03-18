package com.human.ex;

import java.util.Scanner;

public class array07 {
//5명의 시험 점수를 입력하고 최고 점수를 출력하는 코드 , 70점 이상 학생 수를 세어서 출력하는 코드
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int max = 0;
		int count = 0;
		int score[] = new int[5];
		System.out.println("시험 점수를 입력하세요");
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
			System.out.printf("%d번째 사람의 시험 점수는 %d점 입니다.", i + 1, score[i]);
			System.out.println("");
		}
		System.out.printf("최고 점수는 %d점 입니다.", max);
		System.out.println("");
		System.out.println("70점 이상인 학생은 "+count+"명입니다.");
		sc.close();
	}
}
