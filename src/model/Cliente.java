package model;

public class Cliente {
    private int id;
    private String nome, cpf, telefone, email, placaVeiculo;

    public Cliente(int id, String nome, String cpf, String telefone, String email, String placaVeiculo) {
        this.id = id; this.nome = nome; this.cpf = cpf; this.telefone = telefone; this.email = email; this.placaVeiculo = placaVeiculo;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public String getTelefone() { return telefone; }
    public String getEmail() { return email; }
    public String getPlacaVeiculo() { return placaVeiculo; }
    
    public void setNome(String nome) { this.nome = nome; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public void setEmail(String email) { this.email = email; }
    public void setPlacaVeiculo(String placaVeiculo) { this.placaVeiculo = placaVeiculo; }

    @Override
    public String toString() { return nome + " (" + placaVeiculo + ")"; }
}
