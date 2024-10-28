package dev.wakandaacademy.cliente_pedido.pedido.application.service;

import dev.wakandaacademy.cliente_pedido.pedido.domain.Pedido;


public interface PedidoRepository {
	Pedido salvaPedido(Pedido pedido);

}
