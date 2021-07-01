package curso.dio.spring.gerenciamentodepessoas.dto.request;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;

import curso.dio.spring.gerenciamentodepessoas.entity.Telefone;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PessoaDTO {

	private Long id;
	
	@NotEmpty
	@Size(min = 2, max = 100)
	private String nome;
	
	@NotEmpty
	@Size(min = 2, max = 100)
	private String sobrenome;

	@NotEmpty
	@CPF
	private String cpf;
	
	private String dataNascimento;
	
	@Valid
	@NotEmpty
	private List<Telefone> telefones;
	
}
