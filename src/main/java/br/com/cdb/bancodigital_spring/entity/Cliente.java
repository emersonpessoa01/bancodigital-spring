package br.com.cdb.bancodigital_spring.entity;

public class Cliente {
    private String nome;
    private String cpf;

    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
}
