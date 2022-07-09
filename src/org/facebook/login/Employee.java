package org.facebook.login;

//Child Class
public class Employee extends CorporateAccount {

	public void empName() {
		System.out.println("emp name is Ravi");
	}

	public static void main(String[] args) {

		char c = 33;
		System.out.println(c);

		int d = 'c';
		System.out.println(d);

		System.out.println("Java" + "programm");
		System.out.println('j' + 'a' + 'v' + 'a');
		byte b = 10;
		int i = 20;

		int f = b + i;
		System.out.println(f);
		Employee e5 = new Employee();
		e5.empName();
		e5.empName();


	}
}
