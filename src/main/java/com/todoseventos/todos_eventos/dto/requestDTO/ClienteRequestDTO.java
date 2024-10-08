package com.todoseventos.todos_eventos.dto.requestDTO;

import com.todoseventos.todos_eventos.enuns.TipoClienteEnum;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClienteRequestDTO {

    private Long idPessoa;
    private String nome;
    private String cpf;
    private String cnpj;
    private String email;
    private String senha;
    private String telefone;
    private String dataNascimento;
    private TipoClienteEnum tipo_pessoa;
}
