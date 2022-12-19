package mvc.exception;

/**
 * 모델번호가 중복일때 처리할 예외클래스
 * */
public class DuplicateException extends Exception {
	public DuplicateException() {}
	public DuplicateException(String message) {
		super(message);
	}

}
