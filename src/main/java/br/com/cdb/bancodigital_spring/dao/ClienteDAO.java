package br.com.cdb.bancodigital_spring.dao;

import br.com.cdb.bancodigital_spring.entity.Cliente;

import java.util.ArrayList;

// ClienteDao serve para acessar os dados dos clientes
public class ClienteDAO {
    // Aqui você pode implementar métodos para acessar o banco de dados,
    // como salvar, buscar, atualizar e deletar clientes.

    // Neste exemplo, vamos usar uma lista em memória para simular o armazenamento de clientes.
    ArrayList<Cliente> listaClientes = new ArrayList<>();
    public void save(Cliente cliente){
        listaClientes.add(cliente);
    }
    public ArrayList<Cliente> listAll(){
        return listaClientes;
    }

}
