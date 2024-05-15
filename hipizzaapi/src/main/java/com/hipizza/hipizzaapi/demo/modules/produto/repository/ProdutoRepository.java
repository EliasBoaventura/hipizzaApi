package com.hipizza.hipizzaapi.demo.modules.produto.repository;

import com.hipizza.hipizzaapi.demo.modules.produto.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    List<Produto> findByCategoriaId(Long idCategoria);
}
