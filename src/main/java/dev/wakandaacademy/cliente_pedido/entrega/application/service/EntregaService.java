package dev.wakandaacademy.cliente_pedido.entrega.application.service;

import java.util.List;
import java.util.UUID;

import dev.wakandaacademy.cliente_pedido.entrega.application.api.EntregaAlterecaoRequest;
import dev.wakandaacademy.cliente_pedido.entrega.application.api.EntregaPedidoDetalhadoResponse;
import dev.wakandaacademy.cliente_pedido.entrega.application.api.EntregaPedidoListResponse;
import dev.wakandaacademy.cliente_pedido.entrega.application.api.EntregaRequest;
import dev.wakandaacademy.cliente_pedido.entrega.application.api.EntregaResponse;
import jakarta.validation.Valid;

public interface EntregaService {
	EntregaResponse criaEntrega(UUID idPedido, @Valid EntregaRequest entregaRequest);
	List<EntregaPedidoListResponse> buscaEntregasDoPedidoComID(UUID idPedido);
	EntregaPedidoDetalhadoResponse buscaEntregasDoPedidoComID(UUID idPedido, UUID idEntrega);
	void alteraEntregaDoPedidoComId(UUID idPedido, UUID idEntrega,
			@Valid EntregaAlterecaoRequest entregaAlteracaoRequest);
	void deletaEntregaDoPedidoComId(UUID idPedido, UUID idEntrega);
	

}
