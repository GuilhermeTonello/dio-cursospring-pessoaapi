package curso.dio.spring.gerenciamentodepessoas.mapper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Service;

import curso.dio.spring.gerenciamentodepessoas.dto.request.PessoaDTO;
import curso.dio.spring.gerenciamentodepessoas.entity.Pessoa;

@Service
public class PessoaMapper {

	public Pessoa toModel(PessoaDTO pessoaDTO) {
		Pessoa pessoa = new Pessoa();
		pessoa.setCpf(pessoaDTO.getCpf());
		pessoa.setNome(pessoaDTO.getNome());
		pessoa.setSobrenome(pessoaDTO.getSobrenome());
		pessoa.setTelefones(pessoaDTO.getTelefones());
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		pessoa.setDataNascimento(LocalDate.parse(pessoaDTO.getDataNascimento(), dtf));
		
		pessoa.setId(pessoaDTO.getId());
		
		return pessoa;
	}

	public PessoaDTO toDTO(Pessoa pessoa) {
		PessoaDTO pessoaDTO = new PessoaDTO();
		pessoaDTO.setCpf(pessoa.getCpf());
		pessoaDTO.setNome(pessoa.getNome());
		pessoaDTO.setSobrenome(pessoa.getSobrenome());
		pessoaDTO.setTelefones(pessoa.getTelefones());
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		pessoaDTO.setDataNascimento(pessoa.getDataNascimento().format(dtf));
		
		pessoaDTO.setId(pessoa.getId());
		
		return pessoaDTO;
	}

}
