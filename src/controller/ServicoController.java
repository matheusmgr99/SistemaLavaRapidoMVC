package controller;

import java.util.ArrayList;
import java.util.List;
import model.TipoServico;

public class ServicoController {
    private List<TipoServico> servicos = new ArrayList<>();
    private int proximoId = 1;

    public ServicoController() {
        servicos.add(new TipoServico(proximoId++, "Lavagem Simples", "Apenas parte externa", 30.00));
        servicos.add(new TipoServico(proximoId++, "Lavagem Completa", "Parte interna e externa", 50.00));
        servicos.add(new TipoServico(proximoId++, "Com Cera", "Lavagem completa + cera", 70.00));
    }

    public List<TipoServico> listarTodos() { return servicos; }

    public void cadastrar(String nome, String descricao, double preco) {
        servicos.add(new TipoServico(proximoId++, nome, descricao, preco));
    }
}
