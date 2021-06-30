package curso.dio.spring.gerenciamentodepessoas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import curso.dio.spring.gerenciamentodepessoas.entity.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
