package org.entity;

import jakarta.persistence.*;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Table(name = "FUNCIONARIOS")
public class Funcionario extends AbstractPersistable<Long>{

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "nome")
        private String nome;

        @Column(name = "quantidade_de_dependentes")
        private int qtd_dependentes;

        @Column(name = "salario")
        private double salario;

        @Column(name = "cargo")
        private String cargo;

        @ManyToOne
        @JoinColumn(name = "departamento_id")
        private Departamento departamento;

        @Override
        public void setId(Long id) {
                super.setId(id);
        }

        // getters e setters
}