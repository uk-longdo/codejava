package wook.java;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		System.out.println("두 수를 입력 하세요.");
		Scanner sc = new Scanner(System.in);
		int i;
		int j;
		//int result;
		System.out.println("첫번째 수 를 입력하세요.");
		i = sc.nextInt();
		System.out.println("두번째 수 를 입력하세요.");
		j = sc.nextInt();
		//result = (i+j);
		System.out.println("두 수의 합은 " + (i+j)+"입니다.");
		sc.close();		
	}
}
