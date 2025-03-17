package com.example.springbootpessoa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootPessoaApplication implements CommandLineRunner {

    private final ApplicationContext context;

    public SpringbootPessoaApplication(ApplicationContext context) {
        this.context = context;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootPessoaApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Pessoa pessoa = context.getBean(Pessoa.class);
        System.out.println(pessoa);
    }
}
