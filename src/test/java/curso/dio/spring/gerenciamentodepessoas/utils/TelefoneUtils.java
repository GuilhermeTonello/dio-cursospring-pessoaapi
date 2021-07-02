package curso.dio.spring.gerenciamentodepessoas.utils;

import curso.dio.spring.gerenciamentodepessoas.dto.request.TelefoneDTO;
import curso.dio.spring.gerenciamentodepessoas.entity.Telefone;
import curso.dio.spring.gerenciamentodepessoas.enums.TelefoneTipo;

public class TelefoneUtils {

    private static final String PHONE_NUMBER = "1199999-9999";
    private static final TelefoneTipo PHONE_TYPE = TelefoneTipo.CELULAR;

    public static TelefoneDTO createFakeDTO() {
        return TelefoneDTO.builder()
                .numero(PHONE_NUMBER)
                .tipo(PHONE_TYPE)
                .build();
    }
    
    public static Telefone createFakeEntity() {
        return Telefone.builder()
        		.id(1L)
                .numero(PHONE_NUMBER)
                .tipo(PHONE_TYPE)
                .build();
    }
	
}
