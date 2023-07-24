package org.repository;

import org.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository1 extends JpaRepository <Funcionario, Long> {
}

