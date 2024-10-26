package dev.wakandaacademy.cliente_pedido.cliente.application.repository;

import java.util.List;

import dev.wakandaacademy.cliente_pedido.cliente.domain.Cliente;


public interface ClienteRepository {
	Cliente salva(Cliente cliente);
	List<Cliente> buscaTodosClientes();

}
