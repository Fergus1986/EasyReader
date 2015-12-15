package iteracion01.util;

public class SystemException extends Exception{

	private static final long serialVersionUID = 1L;
	
	private ErrorCode errorCode;

	public ErrorCode getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(ErrorCode errorCode) {
		this.errorCode = errorCode;
	}

}
