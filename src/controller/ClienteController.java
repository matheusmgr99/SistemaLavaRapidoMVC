package controller;

import java.util.ArrayList;
import java.util.List;
import model.Cliente;

public class ClienteController {
    private List<Cliente> clientes = new ArrayList<>();
    private int proximoId = 1;

    public void cadastrar(String nome, String cpf, String telefone, String email, String placa) {
        clientes.add(new Cliente(proximoId++, nome, cpf, telefone, email, placa));
    }

    public List<Cliente> listarTodos() { return clientes; }

    public boolean editar(int id, String nome, String cpf, String telefone, String email, String placa) {
        for (Cliente c : clientes) {
            if (c.getId() == id) {
                c.setNome(nome); c.setCpf(cpf); c.setTelefone(telefone); c.setEmail(email); c.setPlacaVeiculo(placa);
                return true;
            }
        }
        return false;
    }

    public boolean excluir(int id) {
        return clientes.removeIf(c -> c.getId() == id);
    }
}
