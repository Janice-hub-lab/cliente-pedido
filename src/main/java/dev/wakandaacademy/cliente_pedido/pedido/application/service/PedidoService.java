package dev.wakandaacademy.cliente_pedido.pedido.application.service;

import java.util.List;
import java.util.UUID;

import dev.wakandaacademy.cliente_pedido.pedido.application.api.PedidoAlteracaoRequest;
import dev.wakandaacademy.cliente_pedido.pedido.application.api.PedidoClienteDetalhadoResponse;
import dev.wakandaacademy.cliente_pedido.pedido.application.api.PedidoClienteListResponse;
import dev.wakandaacademy.cliente_pedido.pedido.application.api.PedidoRequest;
import dev.wakandaacademy.cliente_pedido.pedido.application.api.PedidoResponse;
import jakarta.validation.Valid;

public interface PedidoService {
	PedidoResponse criaPedido(UUID idCliente, @Valid PedidoRequest pedidoRequest);
	List<PedidoClienteListResponse> buscaPedidosDoClienteComId(UUID idCliente);
	PedidoClienteDetalhadoResponse buscaPedidoDoClienteComID(UUID idCliente, UUID idPedido);
	void deletaPedidoDoClienteComId(UUID idCliente, UUID idPedido);
	void alteraPedidoDoClienteComId(UUID idCliente, UUID idPedido,
	PedidoAlteracaoRequest pedidoAlteracaoRequest);
	void buscaEntregaAtravesId(UUID idPedido);
	
	
	
}
