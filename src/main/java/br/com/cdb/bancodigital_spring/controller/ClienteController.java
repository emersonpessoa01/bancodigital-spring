package br.com.cdb.bancodigital_spring.controller;

import br.com.cdb.bancodigital_spring.entity.Cliente;
import br.com.cdb.bancodigital_spring.service.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    private ClienteService clienteService = new ClienteService();
    // Método para adicionar cliente via JSON
    @PostMapping("/add")
    public void addCliente(@RequestBody Cliente cliente) {
        // Chama o serviço para adicionar o cliente
        clienteService.addCliente(cliente.getNome(), cliente.getCpf());
    }
    // Método alternativo para adicionar cliente via URL
    @PostMapping("/add/{nome}/{cpf}")
    public void addCliente(@PathVariable String nome, @PathVariable long cpf) {
        // Chama o serviço para adicionar o cliente
        clienteService.addCliente(nome, cpf);
    }

    @GetMapping("/all")
    public ArrayList<Cliente> getAllClientes() {
        // Chama o serviço para obter todos os clientes
        return clienteService.getClientes();
    }

}
