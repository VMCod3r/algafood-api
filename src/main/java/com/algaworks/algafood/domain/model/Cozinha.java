package com.algaworks.algafood.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
//@Table(name = "tab_cozinha") //Quando Necessário para um nome diferente do nome da Classe
public class Cozinha {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //    @Column(name = "nm_cozinha") //Quando necessário para um nome diferente do nome da coluna especificado no atributo
//    @JsonIgnore
    @JsonProperty(value = "titulo") //Não altera o nome do atributo
    @Column(nullable = false)
    private String nome;

}
