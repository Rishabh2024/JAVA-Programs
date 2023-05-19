package basic;

import java.util.Scanner;
 
public class CWH_11_Exercise1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your physics marks");
	int physics=sc.nextInt();
	System.out.println("Enter your Chemistry marks");
	int chemistry=sc.nextInt();
	System.out.println("Enter your mathematics marks");
	int mathematics=sc.nextInt();
	System.out.println("Enter your english marks");
	int english=sc.nextInt();
	System.out.println("Enter your computer marks");
	int computer=sc.nextInt();
	 	 
	float percentage=(physics+chemistry+mathematics+english+computer)*100/500.0f;
	System.out.println("percentage");
	System.out.println(percentage);
	
}
}
