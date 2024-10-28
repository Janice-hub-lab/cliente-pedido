package dev.wakandaacademy.cliente_pedido.pedido.application.service;

import java.util.List;
import java.util.UUID;

import dev.wakandaacademy.cliente_pedido.pedido.domain.Pedido;


public interface PedidoRepository {
	Pedido salvaPedido(Pedido pedido);
	List<Pedido> buscaPedidosDoClienteComId(UUID idCliente);
	Pedido buscaPedidoPeloId(UUID idPedido);

}
