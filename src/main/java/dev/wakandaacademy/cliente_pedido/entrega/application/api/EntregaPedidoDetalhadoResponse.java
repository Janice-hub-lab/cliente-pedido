package dev.wakandaacademy.cliente_pedido.entrega.application.api;

import java.util.UUID;

import lombok.Value;

@Value
public class EntregaPedidoDetalhadoResponse {
	private UUID idEntrega;
	private UUID idPedido;
	private String nomeCliente;
	private String pontoReferencia;
	private String enderecoEntrega;
	private String numeroCasa;
}
