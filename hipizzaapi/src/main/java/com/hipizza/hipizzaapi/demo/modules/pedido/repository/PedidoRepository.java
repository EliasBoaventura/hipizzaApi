package com.hipizza.hipizzaapi.demo.modules.pedido.repository;

import com.hipizza.hipizzaapi.demo.modules.pedido.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    List<Pedido> findByConsumidorId(Long idConsumidor);
    List<Pedido> findByEstabelecimentoId(Long idEstabelecimento);

}