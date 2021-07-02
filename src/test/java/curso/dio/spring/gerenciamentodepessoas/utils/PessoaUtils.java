package curso.dio.spring.gerenciamentodepessoas.utils;

import java.time.LocalDate;
import java.util.Collections;

import curso.dio.spring.gerenciamentodepessoas.dto.request.PessoaDTO;
import curso.dio.spring.gerenciamentodepessoas.entity.Pessoa;
import curso.dio.spring.gerenciamentodepessoas.entity.Telefone;
import curso.dio.spring.gerenciamentodepessoas.enums.TelefoneTipo;

public class PessoaUtils {
	
    private static final String FIRST_NAME = "Rodrigo";
    private static final String LAST_NAME = "Peleias";
    private static final String CPF_NUMBER = "369.333.878-79";
    private static final long PERSON_ID = 1L;
    public static final LocalDate BIRTH_DATE = LocalDate.of(2010, 10, 1);

    public static PessoaDTO createFakeDTO() {
    	Telefone telefone = new Telefone();
    	telefone.setTipo(TelefoneTipo.CELULAR);
    	telefone.setNumero("1199999-9999");
        return PessoaDTO.builder()
                .nome(FIRST_NAME)
                .sobrenome(LAST_NAME)
                .cpf(CPF_NUMBER)
                .dataNascimento("04-04-2010")
                .telefones(Collections.singletonList(telefone))
                .build();
    }

    public static Pessoa createFakeEntity() {
        return Pessoa.builder()
                .id(PERSON_ID)
                .nome(FIRST_NAME)
                .sobrenome(LAST_NAME)
                .cpf(CPF_NUMBER)
                .dataNascimento(BIRTH_DATE)
                .telefones(Collections.singletonList(TelefoneUtils.createFakeEntity()))
                .build();
    }
	
}
