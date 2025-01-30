class Employee{
	int salary = 10000;
}

class Engineer extends Employee{
	int benifits = 20000;
}

public class A2{
	public static void main(String args[]) {
		Engineer E1 = new Engineer();
		System.out.println("Salary:"+ E1.salary + "Benifits:" + " "+ E1.benifits);
	}
}