package com.hipizza.hipizzaapi.demo.modules.estabelecimento.repository;

import com.hipizza.hipizzaapi.demo.modules.estabelecimento.domain.Estabelecimento;
import com.hipizza.hipizzaapi.demo.projection.EstabelecimentoProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstabelecimentoRepository extends JpaRepository<Estabelecimento, Long> {
    List<EstabelecimentoProjection> findAllBy();

}
