package com.human.ex;

import java.util.Scanner;

public class array09 {
//4자리 수를 입력받아 크기 4의 배열에 저장하고 역순출력
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a[] = new int[4];
		System.out.print("네 자리 정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		a[0]=num/1000;
		a[1]=num%1000/100;
		a[2]=num%100/10;
		a[3]=num%10;
		for(int i=0;i<a.length;i++) {
			System.out.printf("a[%d]의 값 : %d\n", i, a[i]);
		}
			System.out.printf("역순출력 : %d %d %d %d", a[3],a[2],a[1],a[0]);
		
		
		sc.close();
	}
}
