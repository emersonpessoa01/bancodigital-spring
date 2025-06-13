package br.com.cdb.bancodigital_spring.service;

import br.com.cdb.bancodigital_spring.dao.ClienteDAO;
import br.com.cdb.bancodigital_spring.entity.Cliente;

// Camada que implementa as regras de negócio e serve para validar os dados

public class ClienteService {
    private ClienteDAO clienteDAO = new ClienteDao();

    public void addCliente(String nome, long cpf){
        //VALIDAR CPF
        // VALIDAR NOME
        Cliente cliente = new Cliente(nome, cpf);
        // Salvar o cliente no DAO
        clienteDAO.save(cliente);
    }
}
