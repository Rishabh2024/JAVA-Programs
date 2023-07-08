package core;

public class CWH_24_BreakAndContinue {
	public static void main(String[] args) {

//	for break

//	for(int i=5; i>0; i--) {
//		System.out.println(i);
//		System.out.println("java is a great");
//		if(i==2) {
//			System.out.println("ending the loop");
//			break;
//		}
//	}
//System.out.println("loop ends here");

//int i=0;
//do{
//	System.out.println(i);
//		System.out.println("java is a great");
//	if(i==2) {
//		System.out.println("ending the loop");
//		break;
//	}
//	i++;
//}while(i<5);
//System.out.println(" do loop ends here");

//for continue

for(int i=5; i<10; i++) {
	System.out.println(i);
	System.out.println("java is a great");
	if(i==2) {
		System.out.println("ending the loop");
		continue;
	}
	System.out.println(i);
	System.out.println("java is a great");
}
System.out.println("loop ends here");
 
		
//		int i = 0;
//		do {
//			i++;

//			if (i == 2) {
//				System.out.println("ending the loop");
//				continue;
//			}
//			System.out.println(i);
//			System.out.println("java is a great");
//		} while (i < 5);
//		System.out.println(" do loop ends here");
 
	}
}