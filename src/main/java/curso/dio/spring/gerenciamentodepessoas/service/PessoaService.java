package curso.dio.spring.gerenciamentodepessoas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import curso.dio.spring.gerenciamentodepessoas.dto.response.MessageResponseDTO;
import curso.dio.spring.gerenciamentodepessoas.entity.Pessoa;
import curso.dio.spring.gerenciamentodepessoas.repository.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	public MessageResponseDTO save(Pessoa pessoa) {
		pessoaRepository.save(pessoa);
		return MessageResponseDTO
				.builder()
				.message("Pessoa " + pessoa.getNome() + " " + pessoa.getSobrenome() + " criada!")
				.build();
	}
	
}
