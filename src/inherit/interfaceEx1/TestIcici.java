package inherit.interfaceEx1;

public class TestIcici {
	public static void main(String[] args) {
		
		RBI r =  new Icici();// create obj for child and refer by RBI
		
		r.createAccount();  // Icici
		r.createPPF();   // Icici
		r.getKYC();      // Icici
	}
}
