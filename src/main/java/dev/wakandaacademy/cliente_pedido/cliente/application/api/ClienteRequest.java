package dev.wakandaacademy.cliente_pedido.cliente.application.api;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Value;

@Value
public class ClienteRequest {
	private String nomeCompleto;
    @NotBlank
    private String endereco;
    @NotBlank
    private String celular;
    @NotBlank
    @CPF
    private String cpf;
    @NotBlank
    @Email
    private String email;
}
