package oops.methods.WithInstanceMethods;

public class TestPersonInstanceMaethod {
	public static void main(String[] args) {
		// create obj
		Person p1 = new Person();
		// set the data
		p1.id = 2010;
		p1.name = "user2";
		p1.age = 25;
		System.out.println("**************printing p1****************");
		// cal the display function
		p1.display();
		//if the method is called using the object then logic inside the method is applied on the calling object.

		
		
		// create obj
		Person p2 = new Person();
		// set the data
		p2.id = 2011;
		p2.name = "user3";
		p2.age = 26;
		System.out.println("**************printing p2****************");
		// cal the display function
		p2.display();// prints the id,name, age for p2 obj

		
		
		// create obj
		Person p3 = new Person();
		// set the data
		p3.id = 2012;
		p3.name = "user5";
		p3.age = 20;
		System.out.println("**************printing p3****************");
		// cal the display function
		p3.display();// prints the id,name, age for p3 obj
		
		
		
		
		
		
		
		

	/*	Person p2 = getPersonObj(2009, "user3", 29);
		p2.display();

		Person p3 = getPersonObj(2011, "user4", 35);
		p3.display(); */
	}

	
	public static Person getPersonObj(int id, String name, int age) {
		Person obj = new Person();
		obj.id = id;
		obj.name = name;
		obj.age = age;

		return obj;
	}
}
