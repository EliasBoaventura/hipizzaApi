package com.hipizza.hipizzaapi.demo.modules.perfilEstabelecimento.repository;

import com.hipizza.hipizzaapi.demo.modules.perfilEstabelecimento.domain.PerfilEstabelecimento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PerfilEstabelecimentoRepository extends JpaRepository<PerfilEstabelecimento, Long> {
    List<PerfilEstabelecimento> findByEstabelecimentoId(Long idEstabelecimento);
}
