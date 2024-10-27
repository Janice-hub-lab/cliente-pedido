package dev.wakandaacademy.cliente_pedido.cliente.application.repository;

import java.util.List;
import java.util.UUID;

import dev.wakandaacademy.cliente_pedido.cliente.domain.Cliente;


public interface ClienteRepository {
	Cliente salva(Cliente cliente);
	List<Cliente> buscaTodosClientes();
	Cliente buscaClienteAtravesId(UUID idCliente);
	void deletaCliente(Cliente cliente);

}
