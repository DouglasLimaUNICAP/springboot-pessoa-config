package com.example.springbootpessoa;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PessoaConfig {

    @Value("${pessoa.nome}")
    private String nome;

    @Value("${pessoa.idade}")
    private int idade;

    @Value("${pessoa.sexo}")
    private String sexo;

    @Value("${pessoa.estadoCivil}")
    private String estadoCivil;

    @Value("${pessoa.profissao}")
    private String profissao;

    @Bean
    public Pessoa pessoa() {
        return new Pessoa(nome, idade, sexo, estadoCivil, profissao);
    }
}
