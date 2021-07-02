package curso.dio.spring.gerenciamentodepessoas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import curso.dio.spring.gerenciamentodepessoas.dto.request.PessoaDTO;
import curso.dio.spring.gerenciamentodepessoas.dto.response.MessageResponseDTO;
import curso.dio.spring.gerenciamentodepessoas.entity.Pessoa;
import curso.dio.spring.gerenciamentodepessoas.exceptions.PessoaNotFoundException;
import curso.dio.spring.gerenciamentodepessoas.mapper.PessoaMapper;
import curso.dio.spring.gerenciamentodepessoas.repository.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired
	private PessoaMapper pessoaMapper;
	
	public MessageResponseDTO save(PessoaDTO pessoaDTO) {
		Pessoa pessoaParaSalvar = pessoaMapper.toModel(pessoaDTO);
		pessoaRepository.save(pessoaParaSalvar);
		return MessageResponseDTO
				.builder()
				.message("Pessoa " + pessoaDTO.getNome() + " " + pessoaDTO.getSobrenome() + " criada!")
				.build();
	}

	public List<PessoaDTO> findAll() {
		return pessoaRepository.findAll()
				.stream()
				.map(pessoaMapper::toDTO)
				.collect(Collectors.toList());
	}

	public PessoaDTO findById(Long id) throws PessoaNotFoundException {
		return pessoaRepository.findById(id)
				.map(pessoaMapper::toDTO)
				.orElseThrow(() -> new PessoaNotFoundException("Pessoa " + id + " não encontrada!"));
	}

	public void deleteById(Long id) throws PessoaNotFoundException {
		findById(id);
		pessoaRepository.deleteById(id);
	}
	
}
