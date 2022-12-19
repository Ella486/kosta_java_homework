package mvc.exception;

/**
 * 등록, 수정, 삭제에 오류가 발생했을때 처리 할 예외 클래스 
 * */
public class DMLException extends Exception {
	public DMLException() {}
	public DMLException(String message) {
		super(message);
	}

}
