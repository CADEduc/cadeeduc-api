package br.com.imd.cadeduc.service.exception;

public class ResourceEmptyException extends GenericServiceException {

	private static final long serialVersionUID = 1L;

	public ResourceEmptyException(String message) {
		super(message);
	}
}
