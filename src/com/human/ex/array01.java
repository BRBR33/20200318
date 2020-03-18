package com.human.ex;

import java.util.Arrays;
import java.util.Scanner;

public class array01 {
//배열에서 특정한 값 탐색하기
	public static void main(String[] args) {
		int array[] = {10,20,30,40,50,60,70,80,90,100};
		System.out.println(Arrays.toString(array));
		Scanner sc = new Scanner(System.in);
		System.out.print("탐색할 값을 입력하시오 : ");
		int key = sc.nextInt();
		int i;
		for(i=0;i<array.length;i++) {
			if(array[i]==key) {
				break;
			}
		}
		System.out.println("탐색 성공 인덱스 = "+i);

		sc.close();
	}

}
