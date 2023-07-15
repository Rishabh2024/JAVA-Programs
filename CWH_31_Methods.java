package core;

public class CWH_31_Methods {
	static int logic(int x, int y) {
		int z;
		if (x > y) {
			z = x + y;
		} else {
			z = (x + y) * 5;
		}
		return z;
	}

	
	  public static void main(String[] args) { int a = 3; int b = 7; int c;
	 
		
//	Method invocation using object creation   //with non static
		CWH_31_Methods obj = new CWH_31_Methods();
		c = obj.logic(a, b);

//	c=logic(a,b);
		System.out.println(c);
	}
}
