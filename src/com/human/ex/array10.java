package com.human.ex;

import java.util.Scanner;

public class array10 {
//�⼮��Ȳ ���, �⼮�� üũ
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int att[] = new int[16];
		boolean attFlag = true;
		int count = 0;
		
		for(int i=0;i<att.length;i++) {
			System.out.print((i+1)+"��° ���ǿ� �⼮�ϼ̳���? <�⼮�� 1, �Ἦ�� 0>: ");
			if(sc.nextLine().equals("0")) {
				attFlag = false;
			}
			if(attFlag) {
				count++;
			}
		}
		
		double attRate = (double) (100*count)/att.length;
		if(attRate>=80) {
			System.out.println("���� �ϼ� �����Դϴ�. "+"<�⼮�� :"+attRate+"%>");
		}else {
			System.out.println("���� �ϼ� �����Դϴ�. "+"<�⼮�� :"+attRate+"%>");
		}
		
		
		sc.close();
	}
}
