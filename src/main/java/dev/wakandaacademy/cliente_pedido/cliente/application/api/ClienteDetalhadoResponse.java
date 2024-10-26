package dev.wakandaacademy.cliente_pedido.cliente.application.api;

import java.time.LocalDateTime;
import java.util.UUID;

import lombok.Value;

@Value
public class ClienteDetalhadoResponse {
	private UUID idCliente;
	private String nomeCompleto;
	private String cpf;
	private String celular;
	private String email;
	private LocalDateTime dataHoraDoCadastro;
}
