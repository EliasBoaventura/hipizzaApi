package com.hipizza.hipizzaapi.demo.modules.avaliacao.repository;

import com.hipizza.hipizzaapi.demo.modules.avaliacao.domain.Avaliacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AvaliacaoRepository extends JpaRepository<Avaliacao,Long> {

    List<Avaliacao> findByConsumidorId(Long idConsumidor);
    List<Avaliacao> findByEstabelecimentoId(Long idEstabelecimento);

}
