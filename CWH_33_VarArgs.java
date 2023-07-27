package core;

public class CWH_33_VarArgs {
//	static int sum(int a,int b) {
//		return a+b;
//	}
//	static int sum(int a,int b,int c) {
//		return a+b+c;
//	}

//	best approach same out put
	static int sum(int... arr) {
//		available as int []arr;
		int result = 0;
		for (int a : arr) {
			result += a;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println("welcome to var Args Tutorial");
		System.out.println("The sum of 4 and 5 is" + sum(4, 5));
		System.out.println("The sum of 3,2,5" + sum(3, 2, 5));
		System.out.println("The sum of total num is" + sum(5, 4, 4, 4, 7, 8, 8, 6));
		System.out.println("The sum of nothing" + sum(555 + 555 + 555 + 5555 + 5555));
	}
}
