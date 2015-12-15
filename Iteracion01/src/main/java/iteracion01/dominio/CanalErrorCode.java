package iteracion01.dominio;

import iteracion01.util.ErrorCode;

public enum CanalErrorCode implements ErrorCode{
	BAD_URL(101),
	BAD_FEED(102),
	BAD_UNDEFINED(103),
	BAD_DUPLICATED(104);
	
	private final int number;
	
	private CanalErrorCode(int number){
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

}
