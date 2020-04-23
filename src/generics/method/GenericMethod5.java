package generics.method;

public class GenericMethod5 {

	public static void main(String args[]) {
		String a1 = getData(1);
		String a2 =getData("hello");
		String a3 =getData(12.242424f);
		String a4= getData(1141414141414144141l);
		String a5 =getData(2424242.242424244242d);
		String a6 =getData('h');
		
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		System.out.println(a6);
	}

	public static <T> String getData(T data) {
		return "your data=" + data;
	}
}
