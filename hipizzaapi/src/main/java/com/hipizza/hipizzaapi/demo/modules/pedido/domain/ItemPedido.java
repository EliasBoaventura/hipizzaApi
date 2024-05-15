package com.hipizza.hipizzaapi.demo.modules.pedido.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.hipizza.hipizzaapi.demo.modules.promocao.domain.Promocao;
import com.hipizza.hipizzaapi.demo.modules.produto.domain.Produto;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Table(name = "DB105_itens_pedidos")
@Data
public class ItemPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DB105_ITE_PED_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "DB106_PED_ID")
    @JsonBackReference
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "DB108_PRO_ID")
    private Produto produto;

    @ManyToOne
    @JoinColumn(name = "DB109_PRO_ID")
    private Promocao promocao;

    @Column(name = "DB105_ITE_PED_QTD", nullable = false)
    @NotNull(message = "quantidade não pode ser nulo!")
    @Min(value = 1, message = "A quantidade deve ser no mínimo 1")
    @Max(value = 999, message = "A quantidade deve ser no máximo 999")
    private int quantidade;
}
