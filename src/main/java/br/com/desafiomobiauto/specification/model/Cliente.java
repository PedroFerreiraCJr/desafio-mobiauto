package br.com.desafiomobiauto.specification.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "clientes")
public class Cliente {
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 30, nullable = false)
    private String nome;

    @Column(length = 20, nullable = false)
    private String telefone;

    @Enumerated(EnumType.STRING)
    @Column(length = 30, nullable = false)
    private Genero sexo;
}
