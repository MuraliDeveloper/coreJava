package other;

public class Ternanry {
	public static void main(String[] args) {
		int age=90;
		if(validateAge(age)) {
			System.out.println("valid age");
		}
		else {
			System.out.println("invalid age");
		}
	}
	
	
	public static boolean validateAge(int age){
		/*if(age>18){
			return true;
		}
		return false;*/
		return age>18?true:false;
	}
}
