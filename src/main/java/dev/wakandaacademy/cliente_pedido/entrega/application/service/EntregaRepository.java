package dev.wakandaacademy.cliente_pedido.entrega.application.service;

import dev.wakandaacademy.cliente_pedido.entrega.domain.Entrega;

public interface EntregaRepository {
	Entrega salvaEntrega(Entrega entrega);

}
