package oops.poly;

public class TestData0 {
	public static void main(String[] args) {
		Data data = new Data();
		//data.save(null);
        
		//this will give compilation
		// compiler is confused which method to call..

		Person p = null;
		String s = null;
		
		// can we call save method by passing null?????
		data.save(p);
		data.save(s);
		
		
 	}
}
