package basics.StringsEx;

public class TestStrPooling {
	public static void main(String[] args) {
		String text1 = new String("user1");
		String text2 = new String("user1");

		if (text1 == text2) {
			System.out.println("text1, text2 String address are same");
		} else {
			System.out.println("text1, text2 String address are diff");
		}

		String text3 = "user2";
		String text4 = "user2";

		if (text3 == text4) {
			System.out.println("text3, text4 String address are same");
		} else {
			System.out.println("text3, text4 String address are diff");
		}
		
		
		String text5 = "user3";
		String text6= new String("user3");
		
		if (text5 .equals(text6)) {
			System.out.println("text5, text6 String content are same");
		}else {
			System.out.println("text5, text6 String content are diff");
		}
	}
}
