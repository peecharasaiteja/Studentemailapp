package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		Email email = new Email("sai", "teja");
		email.setAlternateEmail("xyz@gmail.com");
		email.getAlternateEmail();
		email.setPassword("12sewd");
		email.getPassword();

	}

}
