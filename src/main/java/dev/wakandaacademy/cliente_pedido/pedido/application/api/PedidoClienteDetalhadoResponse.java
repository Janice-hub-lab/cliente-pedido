package dev.wakandaacademy.cliente_pedido.pedido.application.api;

import java.util.UUID;

import dev.wakandaacademy.cliente_pedido.pedido.domain.Pedido;
import lombok.Value;

@Value
public class PedidoClienteDetalhadoResponse {
	private UUID idPedido;
	private UUID idCliente;
	private String quantidade;
	private String descricao;
	private String metodoPagamento;
	
	public PedidoClienteDetalhadoResponse(Pedido pedido) {
		this.idPedido =pedido.getIdPedido();
		this.idCliente = pedido.getIdCliente();
		this.quantidade = pedido.getQuantidade();
		this.descricao = pedido.getDescricao();
		this.metodoPagamento = pedido.getMetodoPagamento();
	}
}
