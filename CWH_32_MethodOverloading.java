package core; 

public class CWH_32_MethodOverloading {
//	method overloading
	static void foo() {
		System.out.println("Good Morning Bro");
	}

	static void foo(int a) {
		System.out.println("Good morning" + a + "bro!");
	}

	static void foo(int a, int b) {
		System.out.println("Rishabh" + a + "pal" + b);
	}

	static void change(int x) {
		x = 95;
	}
  
 static void change2(int[] arr) {
		arr[0] = 98;
	}

	static void telljoke() {
		System.out.println("I invented a new word !\n" + "plagiarsm");        
	}

	public static void main(String[] args) {
//	telljoke();

//	case:1 changing the integer
//	int[] marks= {52,73,77,89,98,94};
//	int x=73;
//	change(x);
//	System.out.println("The value of x after running change:" + x);

//	case:2 changing the array
	int []marks= {52,73,77,89,98,94};
	change2(marks);
	System.out.println("The value of x after running change:" + marks[0]);

//method overloading
//		foo();
//		foo(20);
//		foo(10, 50);
	}
}