package com.mscompra.compra.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@Entity(name = "tb_pedido")
@ToString
public class Pedido implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank
    private String nome;
    @NotNull
    @Min(1)
    private Long produto;
    @NotNull
    @Min(1)
    private BigDecimal valor;
    @NotNull
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dataCompra;
    @NotBlank
    private String cpfCliente;
    @NotBlank
    private String cep;
}


