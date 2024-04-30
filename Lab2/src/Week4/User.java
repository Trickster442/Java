package Week4;

public class User {
	
	private final String userName ;
	private String password ;
	
	public User(String userName, String password) {
		this.userName = userName ;
		this.password = password ;
		
	}
	public String getUserName() {
		return this.userName ;
	}
	
	public Boolean checkPassword(String password) {
		return this.password.equals(password);
	}
	
	public void setPassword(String oldPassword, String newPassword) {
		if (this.checkPassword(oldPassword)) {
		this.password = newPassword;
		System.out.println("Password changed successfully!!");}
		else {
			System.out.println("Incorrect password, not changed!!");
		}
	}
}
