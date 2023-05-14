package basic;

import java.util.Scanner;

public class CWH_05_Takinginput {
	public static void main(String[] args) {
		System.out.println("Taking input from user");
		Scanner p = new Scanner(System.in);
		System.out.println("Enter no one");
		int a = p.nextInt();
		System.out.println("Enter no two");
		int b = p.nextInt();
		System.out.println("Sum of a and b");
		int sum = a + b;
		System.out.println(sum);

		

//	boolean b=p.hasNextInt();
//	System.out.println(b);
//	String str=p.next();
//	String str=p.nextLine();
//	System.out.println(str);

	}
}
