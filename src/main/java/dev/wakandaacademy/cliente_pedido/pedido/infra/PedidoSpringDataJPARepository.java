package dev.wakandaacademy.cliente_pedido.pedido.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.wakandaacademy.cliente_pedido.pedido.domain.Pedido;

public interface PedidoSpringDataJPARepository extends JpaRepository<Pedido, UUID> {
	

}
