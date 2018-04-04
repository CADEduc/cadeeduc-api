package br.com.imd.cadeduc.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends GerericServiceException {

	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException() {
		super("Recurso não encontrado.");
	}

	public ResourceNotFoundException(String message) {
		super(message);
	}
}
