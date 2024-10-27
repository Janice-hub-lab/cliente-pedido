package dev.wakandaacademy.cliente_pedido.pedido.application.api;

import jakarta.validation.constraints.NotBlank;
import lombok.Value;

@Value
public class PedidoRequest {
	@NotBlank
	private String quantidade;
	@NotBlank
	private String descricao;
	@NotBlank
	private String metodoPagamento;
}
