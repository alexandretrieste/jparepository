package org.service;

import org.entity.Departamento;
import org.repository.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartamentoService {

    @Autowired
    private DepartamentoRepository repository;


    public List<Departamento> buscarTodos(){
        return repository.findAll();
    }

}
