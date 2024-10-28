package dev.wakandaacademy.cliente_pedido.pedido.application.api;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import dev.wakandaacademy.cliente_pedido.cliente.application.api.ClienteListResponse;
import dev.wakandaacademy.cliente_pedido.pedido.domain.Pedido;
import lombok.Value;

@Value
public class PedidoClienteListResponse {
	private UUID idPedido;
	private UUID idCliente;
	private String quantidade;
	private String descricao;
	private String metodoPagamento;

	public static List<PedidoClienteListResponse> converte(List<Pedido> pedidosDoCliente) {
		return pedidosDoCliente.stream()
				.map(PedidoClienteListResponse::new)
				.collect(Collectors.toList());
	}

	public PedidoClienteListResponse(Pedido pedido) {
		this.idPedido = pedido.getIdPedido();
		this.idCliente = pedido.getIdCliente();
		this.quantidade = pedido.getQuantidade();
		this.descricao = pedido.getDescricao();
		this.metodoPagamento = pedido.getMetodoPagamento();
	}
}
