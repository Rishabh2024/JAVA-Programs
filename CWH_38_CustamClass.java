package core;

class Employee { // custam class
	int id;
	String name;
	int salary;
	String Add;

	public void printdetails() {
		System.out.println("My id is " + id);
		System.out.println("and my name is" + name);
	}

	public int getSalary() {
		return salary;

	}

//	public void getDetails() {
//		String Add;
//	}
}

public class CWH_38_CustamClass {
	public static void main(String[] args) {
		System.out.println("This is a custam class");
		Employee Rishabh = new Employee();
//	Employee  A=new Employee();
//	
		Rishabh.id = 2469;
		Rishabh.name = "Rishabh Pal";
		Rishabh.Add = "SulemSarai Allahabad up";
		Rishabh.salary = 60;

//	A.id=44;
//	A.name="Akash Sharma";
//	A.Add="Kanpur";
//	A.salary=55;

		Rishabh.printdetails(); // print with the help of method
		int salary = Rishabh.getSalary();
		System.out.println("My salary is" + salary);

		System.out.println("Address" + Rishabh.Add);

//     A.printdetails();
//    int salary1=A.getSalary();
//    System.out.println(salary1); 
//    System.out.println(A.Add);

//	System.out.println(Rishabh.id);
//	System.out.println(Rishabh.name);
//     System.out.println(A.id);
//     System.out.println(A.name);

	}
}
