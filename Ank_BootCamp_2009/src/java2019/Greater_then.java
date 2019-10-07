package java2019;

import java.util.Scanner;

public class Greater_then {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the value of a-");
		int a = S.nextInt();
		System.out.println("Enter the value of b-");
		int b = S.nextInt();
		int x = a+b;
		 System.out.println("Additional nunber x =" + x) ;
		 
		 if (a>b ) {
System.out.println("a is greater than b ");
	}else {
		if (b>a) {
			System.out.println("b is greater than a ");
		}
	}

	}
}

