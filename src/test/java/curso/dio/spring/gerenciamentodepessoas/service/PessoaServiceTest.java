package curso.dio.spring.gerenciamentodepessoas.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import curso.dio.spring.gerenciamentodepessoas.dto.request.PessoaDTO;
import curso.dio.spring.gerenciamentodepessoas.dto.response.MessageResponseDTO;
import curso.dio.spring.gerenciamentodepessoas.entity.Pessoa;
import curso.dio.spring.gerenciamentodepessoas.mapper.PessoaMapper;
import curso.dio.spring.gerenciamentodepessoas.repository.PessoaRepository;
import curso.dio.spring.gerenciamentodepessoas.utils.PessoaUtils;

@ExtendWith(MockitoExtension.class)
public class PessoaServiceTest {
	
	@Mock
	private PessoaRepository pessoaRepository;
	
	@Mock
	private PessoaMapper pessoaMapper;
	
	@InjectMocks
	private PessoaService pessoaService;
	
	@Test
	void testGivenPessoaDTOThenReturnSaveMessage() {
        PessoaDTO pessoaDTO = PessoaUtils.createFakeDTO();
        Pessoa expectedSavedPessoa = PessoaUtils.createFakeEntity();

        when(pessoaMapper.toModel(pessoaDTO)).thenReturn(expectedSavedPessoa);
        when(pessoaRepository.save(Mockito.any(Pessoa.class))).thenReturn(expectedSavedPessoa);

        MessageResponseDTO expectedSuccessMessage = MessageResponseDTO.builder()
        		.message("Pessoa " + pessoaDTO.getNome() + " " + pessoaDTO.getSobrenome() + " criada!")
        		.build();
        MessageResponseDTO successMessage = pessoaService.save(pessoaDTO);

        assertEquals(expectedSuccessMessage, successMessage);
	}
	
}
