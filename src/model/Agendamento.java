package model;

import java.time.LocalDateTime;

public class Agendamento {
    private int id;
    private Cliente cliente;
    private TipoServico tipoServico;
    private LocalDateTime dataHora;
    private String status;

    public Agendamento(int id, Cliente cliente, TipoServico tipoServico, LocalDateTime dataHora) {
        this.id = id; this.cliente = cliente; this.tipoServico = tipoServico; this.dataHora = dataHora; this.status = "Agendado";
    }

    public int getId() { return id; }
    public Cliente getCliente() { return cliente; }
    public TipoServico getTipoServico() { return tipoServico; }
    public LocalDateTime getDataHora() { return dataHora; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
