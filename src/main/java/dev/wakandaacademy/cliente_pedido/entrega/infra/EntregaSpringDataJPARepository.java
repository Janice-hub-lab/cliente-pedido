package dev.wakandaacademy.cliente_pedido.entrega.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.wakandaacademy.cliente_pedido.entrega.domain.Entrega;

public interface EntregaSpringDataJPARepository extends JpaRepository<Entrega, UUID> {
	List<Entrega> findByIdPedido(UUID idPedido);
}
