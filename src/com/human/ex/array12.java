package com.human.ex;

import java.util.Scanner;

public class array12 {
//로또 프로그램
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int lotto[] = new int[6];
		
		System.out.print("로또번호 입력 : ");
		lotto[0] = sc.nextInt();
		
		for (int i = 1; i < lotto.length; i++) {
			System.out.print("로또번호 입력 : ");
			lotto[i]= sc.nextInt();
			for(int j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) {
					System.out.println("같은 번호가 있습니다!");
					i--;
					break;
				}
			}		
		}
		System.out.print("입력된 로또번호 : ");
		for(int i=0;i<lotto.length;i++) {
		System.out.print(lotto[i]);
		System.out.print(" ");
		}
		sc.close();
	}
}
