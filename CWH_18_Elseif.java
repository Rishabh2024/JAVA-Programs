package core;

import java.util.Scanner;

public class CWH_18_Elseif {
	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		/*
		 * if(age>56) { System.out.println("you are experienced"); } else if(age>46) {
		 * System.out.println("you are semi experienced"); } else if(age>30) {
		 * System.out.println("you are semi-semi experienced"); } else {
		 * System.out.println("you are not experienced"); }
		 */

		switch (age) {
		case 18:
			System.out.println("you are going to adult");
			break;
		case 23:
			System.out.println("you are going to join job");
			break;

		case 60:
			System.out.println("you are going to get retired");
			break;
		default:
			System.out.println("enjoy your life");
		}
	}
}
