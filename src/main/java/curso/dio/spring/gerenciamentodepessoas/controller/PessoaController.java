package curso.dio.spring.gerenciamentodepessoas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/pessoa")
public class PessoaController {
	
	@GetMapping
	public String get() {
		return "get mapping";
	}

}
