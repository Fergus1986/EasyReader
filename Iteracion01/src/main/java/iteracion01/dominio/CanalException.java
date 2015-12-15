package iteracion01.dominio;

import iteracion01.util.SystemException;

public class CanalException extends SystemException{

	public CanalException(CanalErrorCode badUrl) {
		setErrorCode(badUrl);
	}

	private static final long serialVersionUID = 1L;

}
