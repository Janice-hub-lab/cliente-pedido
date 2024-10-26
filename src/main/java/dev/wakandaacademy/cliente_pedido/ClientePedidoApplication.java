package dev.wakandaacademy.cliente_pedido;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class ClientePedidoApplication {
	@GetMapping
	public String getHomeTeste() {
		return "Cliente Pedido - API Home";
	}

	public static void main(String[] args) {
		SpringApplication.run(ClientePedidoApplication.class, args);
	}

}
