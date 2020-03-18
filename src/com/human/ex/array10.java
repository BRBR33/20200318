package com.human.ex;

import java.util.Scanner;

public class array10 {
//출석상황 기록, 출석률 체크
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int att[] = new int[16];
		boolean attFlag = true;
		int count = 0;
		
		for(int i=0;i<att.length;i++) {
			System.out.print((i+1)+"번째 강의에 출석하셨나요? <출석은 1, 결석은 0>: ");
			if(sc.nextLine().equals("0")) {
				attFlag = false;
			}
			if(attFlag) {
				count++;
			}
		}
		
		double attRate = (double) (100*count)/att.length;
		if(attRate>=80) {
			System.out.println("수업 일수 충족입니다. "+"<출석률 :"+attRate+"%>");
		}else {
			System.out.println("수업 일수 부족입니다. "+"<출석률 :"+attRate+"%>");
		}
		
		
		sc.close();
	}
}
