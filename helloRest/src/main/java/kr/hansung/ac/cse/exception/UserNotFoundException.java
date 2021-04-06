package kr.hansung.ac.cse.exception;

public class UserNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 2774765296450969024L;

	private long userId;

	public UserNotFoundException(long userId) {
		super();
		this.userId = userId;
	}

	public long getUserId() {
		return userId;
	}
}
