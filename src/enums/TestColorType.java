package enums;

public class TestColorType {
	public static void main(String[] args) {
		//get obj for black
		ColorType c = ColorType.BLACK;
		System.out.println(c);
		
		
		//get obj for WHITE
		ColorType c1 = ColorType.WHITE;
		System.out.println(c1);
		
		System.out.println("***************Print all objs****************************");
		//get all objs
		ColorType[] colors = ColorType.values();// retuns all objs
		for(ColorType color :colors) {
			System.out.println(color);
		}
		
	}
}
