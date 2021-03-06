package curso.dio.spring.gerenciamentodepessoas.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import curso.dio.spring.gerenciamentodepessoas.dto.request.PessoaDTO;
import curso.dio.spring.gerenciamentodepessoas.dto.response.MessageResponseDTO;
import curso.dio.spring.gerenciamentodepessoas.exceptions.PessoaNotFoundException;
import curso.dio.spring.gerenciamentodepessoas.service.PessoaService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/v1/pessoa")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PessoaController {
	
	private PessoaService pessoaService;
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public MessageResponseDTO criarPessoa(@RequestBody @Valid PessoaDTO pessoaDTO) {
		return pessoaService.save(pessoaDTO);
	}
	
	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	public List<PessoaDTO> listarTudo() {
		return pessoaService.findAll();
	}
	
	@GetMapping("{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public PessoaDTO mostrarUm(@PathVariable("id") Long id) throws PessoaNotFoundException {
		return pessoaService.findById(id);
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public void deletarPessoa(@PathVariable("id") Long id) throws PessoaNotFoundException {
		pessoaService.deleteById(id);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public MessageResponseDTO atualizarPessoa(
			@PathVariable("id") Long id, 
			@RequestBody PessoaDTO pessoaDTO) throws PessoaNotFoundException {
		return pessoaService.updateById(id, pessoaDTO);
	}
	

}
