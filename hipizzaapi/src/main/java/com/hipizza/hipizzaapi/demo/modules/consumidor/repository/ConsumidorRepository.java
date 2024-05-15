package com.hipizza.hipizzaapi.demo.modules.consumidor.repository;

import com.hipizza.hipizzaapi.demo.modules.consumidor.domain.Consumidor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsumidorRepository extends JpaRepository<Consumidor, Long> {
}
