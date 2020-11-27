package passValue;

public class TestPassByRef {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.id= 2001;
		p1.name= "user1";
		p1.age =29;
		
		System.out.println("before call");
		show(p1);
		
		modify(p1);
		
		System.out.println("after call");
		show(p1);
		
	}
	
	private static void modify(Person p2){
		p2.id= 4000;
		p2.name= "user11";
		p2.age =45;
	}
	
	// if method1() calls method2() by passing obj , if the method2() is modifying obj ,
	//then it will have impact on method1()
	public static void show(Person pObj){
		System.out.println(pObj.id);
		System.out.println(pObj.name);
		System.out.println(pObj.age);
	}

}
