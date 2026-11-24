package controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import model.Agendamento;
import model.Cliente;
import model.TipoServico;

public class AgendamentoController {
    private List<Agendamento> agendamentos = new ArrayList<>();
    private int proximoId = 1;

    public String agendar(Cliente cliente, TipoServico servico, LocalDateTime dataHora) {
        for (Agendamento a : agendamentos) {
            if (a.getDataHora().equals(dataHora) && a.getStatus().equals("Agendado")) {
                return "Erro: Já existe um agendamento para este horário!";
            }
        }
        agendamentos.add(new Agendamento(proximoId++, cliente, servico, dataHora));
        return "Sucesso: Agendamento realizado!";
    }

    public List<Agendamento> listarTodos() { return agendamentos; }

    public boolean cancelar(int id) {
        for (Agendamento a : agendamentos) {
            if (a.getId() == id) {
                a.setStatus("Cancelado");
                return true;
            }
        }
        return false;
    }
}
