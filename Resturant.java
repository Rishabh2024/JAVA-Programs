package resturant;

import java.util.Scanner;

public class Resturant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Welcome To My Resturant");
		System.out.println("Sir Please Enter Your Aadhar Number");
		double n = sc.nextDouble();
		System.out.println("Sir Please  Enter your mobile Number");
		double p = sc.nextDouble();
		System.out.println("Your table No =6");
		System.out.println("Please Enter your Name");
		String s = sc.nextLine();
		System.out.println("Welcome To" + s + "And Your table No is 6");
		System.out.println("1 Break Fast");
		System.out.println("2 lunch");
		System.out.println("3 Dinner");
		System.out.println("Please Choose Anything");
		int b = sc.nextInt();
		switch (b) {
		case 1:
			System.out.println("1. Tea Price 50");
			System.out.println("2. Coffe Price 80");
			System.out.println("Enter Person") ;
			int g = sc.nextInt();
			System.out.println("Your Choice");
			int d = sc.nextInt();
			switch (d) {
			case 1:
				System.out.println("Your Amount is" + g * 50);
				break;
			case 2:
				System.out.println("Your Amount is=" + g * 80);
				break;
			default:
				break;

			}
			break;
		case 2:
			System.out.println("1.Kadai Rice price 250");
			System.out.println("2.Chole Bhature price 150");
			int e = sc.nextInt();
			System.out.println("Your Choice");
			int f = sc.nextInt();
			switch (f) {
			case 1:
				System.out.println("Your Amount is" + e * 250);
				break;
			case 2:
				System.out.println("Your Amount is" + e * 150);
				break;
			default:
				break;
			}
		case 3:
			System.out.println("Chicken (Price=400)");
			System.out.println("Shai Panner (Price=500)");
			System.out.println("Enter The Person");
			int t = sc.nextInt();
			System.out.println("Your Choice");
			int h = sc.nextInt();
			switch (h) {
			case 1:
				System.out.println("Your Amount is" + t * 400);
				break;
			case 2:
				System.out.println("Your Amount is" + t * 500);
				break;
			default:
				break;

			}

		}

	}
}
