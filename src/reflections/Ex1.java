package reflections;

/**
 
syntax:
1.how to create the class object for Person
Class c = Class.forName("reflections.Person");

1.how to create the class object for Student
Class c1 = Class.forName("reflections.Student");

Class c = Person.class; 
		System.out.println(c.getName());
	
		c = Student.class;
		System.out.println(c.getName());
		
 */


public class Ex1 {
	public static void main(String args[]) throws ClassNotFoundException {
		Class c1 = Class.forName("reflections.Person");
		System.out.println(c1.getName());
		
		Class c2 = Class.forName("reflections.Student");
		System.out.println(c2.getName());
	}
}
