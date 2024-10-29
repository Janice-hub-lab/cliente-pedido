package dev.wakandaacademy.cliente_pedido.entrega.application.service;

import java.util.UUID;

import dev.wakandaacademy.cliente_pedido.entrega.application.api.EntregaRequest;
import dev.wakandaacademy.cliente_pedido.entrega.application.api.EntregaResponse;
import jakarta.validation.Valid;

public interface EntregaService {
	EntregaResponse criaEntrega(UUID idPedido, @Valid EntregaRequest entregaRequest);

}
