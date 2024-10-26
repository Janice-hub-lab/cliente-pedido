package dev.wakandaacademy.cliente_pedido.cliente.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.wakandaacademy.cliente_pedido.cliente.domain.Cliente;

public interface ClienteSpringDataJPARepository extends JpaRepository<Cliente, UUID> {

}
