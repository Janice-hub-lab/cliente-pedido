package dev.wakandaacademy.cliente_pedido.entrega.application.service;

import java.util.List;
import java.util.UUID;

import dev.wakandaacademy.cliente_pedido.entrega.domain.Entrega;

public interface EntregaRepository {
	Entrega salvaEntrega(Entrega entrega);
	List<Entrega> buscaEntregasDoPedidoComID(UUID idPedido);
	Entrega buscaEntregaPeloId(UUID idEntrega);
	void deletaEntrega(Entrega entrega);

}
