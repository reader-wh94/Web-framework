package kr.hansung.ac.cse.exception;

public class UserDuplicatedException extends RuntimeException {

	private static final long serialVersionUID = 4303359688107145299L;

	private String username;
	
	public UserDuplicatedException(String username) {
		super();
		this.username = username;
	}

	public String getUsername() {
		return username;
	}
}
