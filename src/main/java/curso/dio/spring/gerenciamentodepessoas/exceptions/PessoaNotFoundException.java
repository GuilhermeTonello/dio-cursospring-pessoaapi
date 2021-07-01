package curso.dio.spring.gerenciamentodepessoas.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class PessoaNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public PessoaNotFoundException(String mensagem) {
		super(mensagem);
	}

}
