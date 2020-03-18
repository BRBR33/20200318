package com.human.ex;

import java.util.Scanner;

public class array13 {
//입력된 수의 배수는 0으로 출력하면서 배열 복사하기
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a[] = new int[50];
		int b[] = new int[50];
		System.out.println("숫자(배수의 자리를 0으로 설정)를 입력하세요: ");
		int input = sc.nextInt();
		
		System.out.println("배열 a :");
		for(int i=0;i<a.length;i++) {
			a[i]=i+1;
			System.out.print(a[i]+"\t");
			if((i)%10==9) {
				System.out.println("");
			}
		}
		System.out.println("");
		System.out.println("배열 b :");
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
