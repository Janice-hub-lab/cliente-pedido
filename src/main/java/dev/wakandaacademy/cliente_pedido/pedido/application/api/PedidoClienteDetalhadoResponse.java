package dev.wakandaacademy.cliente_pedido.pedido.application.api;

import java.util.UUID;

import lombok.Value;

@Value
public class PedidoClienteDetalhadoResponse {
	private UUID idPedido;
	private UUID idCliente;
	private String quantidade;
	private String descricao;
	private String metodoPagamento;

}
