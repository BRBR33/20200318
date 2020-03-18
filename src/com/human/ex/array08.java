package com.human.ex;

import java.util.Scanner;

public class array08 {
//5명의 시험 점수를 입력하고 최고 점수를 출력하는 코드 , 70점 이상 학생 수를 세어서 출력하는 코드
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
			System.out.print((i+1)+"번 학생 국어 성적 입력 : ");
			kor[i] = sc.nextInt();
			System.out.print((i+1)+"번 학생 영어 성적 입력 : ");
			eng[i] = sc.nextInt();
			System.out.print((i+1)+"번 학생 수학 성적 입력 : ");
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
		
		System.out.println("국어총점:"+korSum+" 평균: "+korAvg);
		System.out.println("영어총점:"+engSum+" 평균: "+engAvg);
		System.out.println("수학총점:"+mathSum+" 평균: "+mathAvg);
		sc.close();
	}
}
