package inherit.single;

public class TetInherit {
	public static void main(String[] args) {
		// create obj for person
		Person p = new Person();
		p.name ="testUser2";
		p.age=50;
		p.id = 65556;

		
		//create obj for employee
		Employee emp = new Employee();
		//set data for inherited props
		emp.name ="testUser1";
		emp.age=45;
		emp.id = 12345;
		emp.pan = "bnadh671a6";
		emp.pfNo="testPfNo";
		
		
		System.out.println("displaying person info");
		p.displayPerson();
		
		System.out.println("displaying employee info");
		emp.displayPerson();
		emp.displayEmp();
	}
}
