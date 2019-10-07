package java2019;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the number you want to - ");
		
		int A = S.nextInt();
		for (int i = 1; i<=10; i++) {
			System.out.println(A + " * " + i + " = " +  A*i);
		}

	}

}

