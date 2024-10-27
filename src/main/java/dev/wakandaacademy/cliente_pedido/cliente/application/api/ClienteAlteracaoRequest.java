package dev.wakandaacademy.cliente_pedido.cliente.application.api;

import jakarta.validation.constraints.NotBlank;
import lombok.Value;

@Value
public class ClienteAlteracaoRequest {
	private String nomeCompleto;
    @NotBlank
    private String endereco;
    @NotBlank
    private String celular;

}
