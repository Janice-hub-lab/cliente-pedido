package dev.wakandaacademy.cliente_pedido.entrega.application.api;

import java.util.UUID;

import dev.wakandaacademy.cliente_pedido.entrega.domain.Entrega;
import lombok.Value;

@Value
public class EntregaPedidoDetalhadoResponse {
	private UUID idEntrega;
	private UUID idPedido;
	private String nomeCliente;
	private String pontoReferencia;
	private String enderecoEntrega;
	private String numeroCasa;

	public EntregaPedidoDetalhadoResponse(Entrega entrega) {
		this.idEntrega = entrega.getIdEntrega();
		this.idPedido = entrega.getIdPedido();
		this.nomeCliente = entrega.getNomeCliente();
		this.pontoReferencia = entrega.getPontoReferencia();
		this.enderecoEntrega = entrega.getEnderecoEntrega();
		this.numeroCasa = entrega.getNumeroCasa();
	}
}
