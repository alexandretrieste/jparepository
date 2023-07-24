package org.entity;

import jakarta.persistence.*;
import org.springframework.data.jpa.domain.AbstractPersistable;
import java.util.List;

@Entity
@Table(name = "DEPARTAMENTOS")
public class Departamento extends AbstractPersistable<Long>{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @OneToMany(mappedBy = "departamento")
    private List<Funcionario> funcionarios;

    @Override
    public void setId(Long id) {
        super.setId(id);
    }

    // getters e setters
}