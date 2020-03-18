package com.human.ex;

import java.util.Arrays;
import java.util.Scanner;

public class array05 {
//배열의 값을 입력한 수만큼 왼쪽으로 이동하고, 그 자리에는 0 채워 넣기
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		Scanner sc = new Scanner(System.in);
		
		System.out.println(Arrays.toString(a));
		System.out.print("이동을 원하는 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		for(int i=0;i<a.length;i++) {
			if((i+input)<a.length) {
				a[i] = a[i+input];
			}else {
				a[i] = 0;
			}
			
		}
		
		System.out.println(Arrays.toString(a));
		
		sc.close();
	}

}
