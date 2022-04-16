package emailApp;

public class Email_App {

	public static void main(String[] args) {
		Email email = new Email("Sudha","Potla");
		
		email.setAlternateEmail("ks.gmail.com");
		System.out.println(email.showInfo());
		
	}
}
