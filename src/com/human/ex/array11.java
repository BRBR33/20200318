package com.human.ex;

import java.util.Scanner;

public class array11 {
//채점 프로그램
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int score[] = new int[5];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
	
		System.out.println("5명 심사위원의 점수 입력 : ");
		for(int i=0;i<5;i++) {
			score[i] = sc.nextInt();
			if(score[i]>max) {
				max = score[i];
			}
			if(score[i]<min) {
				min = score[i];
			}
		}

		double sum = 0;
		int count = 0;
		System.out.print("유효점수 : ");
		for(int i=0;i<score.length;i++) {
			if(score[i]!=max && score[i]!=min) {
				System.out.print(score[i]);
				System.out.print(" ");
				sum = sum + score[i];
				count++;
			}

		}
		System.out.println("");
		System.out.println(String.format("평균 : %.1f",sum/count));
		
		sc.close();
	}
}
