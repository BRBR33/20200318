package com.human.ex;

import java.util.Arrays;
import java.util.Scanner;

public class array01 {
//�迭���� Ư���� �� Ž���ϱ�
	public static void main(String[] args) {
		int array[] = {10,20,30,40,50,60,70,80,90,100};
		System.out.println(Arrays.toString(array));
		Scanner sc = new Scanner(System.in);
		System.out.print("Ž���� ���� �Է��Ͻÿ� : ");
		int key = sc.nextInt();
		int i;
		for(i=0;i<array.length;i++) {
			if(array[i]==key) {
				break;
			}
		}
		System.out.println("Ž�� ���� �ε��� = "+i);

		sc.close();
	}

}
