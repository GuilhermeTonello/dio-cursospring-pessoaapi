package curso.dio.spring.gerenciamentodepessoas.dto.request;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import curso.dio.spring.gerenciamentodepessoas.enums.TelefoneTipo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TelefoneDTO {
	
	private Long id;
	
	@Enumerated(EnumType.STRING)
	private TelefoneTipo tipo;

	@NotEmpty
	@Size(min = 13, max = 14)
	private String numero;
	
}
