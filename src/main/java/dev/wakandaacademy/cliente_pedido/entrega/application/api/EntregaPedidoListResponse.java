package dev.wakandaacademy.cliente_pedido.entrega.application.api;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import dev.wakandaacademy.cliente_pedido.entrega.domain.Entrega;
import lombok.Value;

@Value
public class EntregaPedidoListResponse {
	private UUID idEntrega;
	private String nomeCliente;
	private String pontoReferencia;
	private String enderecoEntrega;
	private String numeroCasa;

	public static List<EntregaPedidoListResponse> converte(List<Entrega> entregasDoPedido) {
		return entregasDoPedido.stream()
				.map(EntregaPedidoListResponse::new)
				.collect(Collectors.toList());
	}

	public EntregaPedidoListResponse(Entrega entrega) {
		this.idEntrega = entrega.getIdEntrega();
		this.nomeCliente = entrega.getNomeCliente();
		this.pontoReferencia = entrega.getPontoReferencia();
		this.enderecoEntrega = entrega.getEnderecoEntrega();
		this.numeroCasa = entrega.getNumeroCasa();
	}

}
