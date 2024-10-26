package dev.wakandaacademy.cliente_pedido.cliente.application.service;

import dev.wakandaacademy.cliente_pedido.cliente.application.api.ClienteRequest;
import dev.wakandaacademy.cliente_pedido.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);

}
