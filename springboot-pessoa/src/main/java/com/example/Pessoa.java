package com.example.springbootpessoa;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    private String estadoCivil;
    private String profissao;

    public Pessoa(String nome, int idade, String sexo, String estadoCivil, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.profissao = profissao;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                ", profissao='" + profissao + '\'' +
                '}';
    }
}
