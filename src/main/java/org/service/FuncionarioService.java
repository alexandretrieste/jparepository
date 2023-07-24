package org.service;

import org.entity.Funcionario;
import org.repository.FuncionarioRepository1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository1 repository;

    public List<Funcionario> buscarTodos(){
        return repository.findAll();
    }

}
