package core;

public class CWH_35_PracticeSetonMethods {
	

	static void multiplication(int n) {
	for(int i=1;i<=10;i++) {
		System.out.format("%d X %d=%d\n",n,i, n*i);
	}
	}
	
	static void pattern1(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static int sumRec(int n) {
		if(n==1) {
			return 1;
		}
		return n+sumRec(n-1);
	}
	
	
	
	
	
	static int fib(int n) {
		if(n==1) {
			return 0;
		}
		else if(n==2) {
			return 1;
		}
		return fib(n-1)+fib(n-2);
	}
	
	
	static void pattern1_rec(int n) {
		
		if(n>0) {
			pattern1_rec(n-1);
			for(int i=0;i<n;i++);{
				System.out.print("*");
			}
			System.out.println();
		}
		}

public static void main(String[] args) {
//	problem 1
	multiplication(4);
	
//	problem 2
	pattern1(4);
	
//	problem 3
int c=	sumRec(5);
		System.out.println(c);
	


	
//	problem 5
	int result=fib(5);
	System.out.println(result);
	
	//problem 8
	pattern1_rec(3);
	
	
	}
}

