package org.main;

import org.entity.Departamento;
import org.entity.Funcionario;
import org.service.DepartamentoService;
import org.service.FuncionarioService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = "org.main")
public class Atividade06Main {

    private static final Logger Log = LoggerFactory.getLogger(Atividade06Main.class);
    public static void main(String[] args) {
        SpringApplication.run(Atividade06Main.class,args);
    }

    @Bean
    public CommandLineRunner demo(DepartamentoService departamentoService,
                                  FuncionarioService funcionarioService){
        return (args) -> {

            Log.info("Listagem de todos os departamentos");
            Log.info("----------------------------------");
            for(Departamento departamento : departamentoService.buscarTodos())
                Log.info(departamento.toString());
            Log.info("");

            Log.info("Listagem de todos os funcionários");
            Log.info("---------------------------------");
            for(Funcionario funcionario : funcionarioService.buscarTodos())
                Log.info(funcionario.toString());
            Log.info("");
        };
    }

}
