package dev.wakandaacademy.cliente_pedido.cliente.application.service;

import java.util.List;
import java.util.UUID;

import dev.wakandaacademy.cliente_pedido.cliente.application.api.ClienteDetalhadoResponse;
import dev.wakandaacademy.cliente_pedido.cliente.application.api.ClienteListResponse;
import dev.wakandaacademy.cliente_pedido.cliente.application.api.ClienteRequest;
import dev.wakandaacademy.cliente_pedido.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);
	List<ClienteListResponse> buscaTodosClientes();
	ClienteDetalhadoResponse buscaClienteAtravesId(UUID idCliente);

}
