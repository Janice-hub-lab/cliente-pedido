package dev.wakandaacademy.cliente_pedido.cliente.application.api;

import java.time.LocalDateTime;
import java.util.UUID;

import dev.wakandaacademy.cliente_pedido.cliente.domain.Cliente;
import lombok.Value;

@Value
public class ClienteDetalhadoResponse {
	
	private UUID idCliente;
	private String nomeCompleto;
	private String cpf;
	private String celular;
	private String email;
	private LocalDateTime dataHoraDoCadastro;
	
	public ClienteDetalhadoResponse(Cliente cliente) {
		this.idCliente = cliente.getIdCliente();
		this.nomeCompleto = cliente.getNomeCompleto();
		this.cpf = cliente.getCpf();
		this.celular = cliente.getCelular();
		this.email = cliente.getEmail();
		this.dataHoraDoCadastro = cliente.getDataHoraDoCadastro();
	}

}
