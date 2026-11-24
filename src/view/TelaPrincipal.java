package view;

import controller.AgendamentoController;
import controller.ClienteController;
import controller.ServicoController;
import model.Agendamento;
import model.Cliente;
import model.TipoServico;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDateTime;

public class TelaPrincipal extends javax.swing.JFrame {

    private ClienteController clienteCtrl = new ClienteController();
    private ServicoController servicoCtrl = new ServicoController();
    private AgendamentoController agendaCtrl = new AgendamentoController();
    private int idClienteEditando = -1;
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        txtCPF = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPlaca = new javax.swing.JTextField();
        bntSalvar = new javax.swing.JButton();
        bntEditar = new javax.swing.JButton();
        bntExcluir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        comboClientes = new javax.swing.JComboBox<>();
        comboServicos = new javax.swing.JComboBox<>();
        bntAgendar = new javax.swing.JButton();
        bntCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bntNovoServico = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome");
        jLabel2.setText("CPF");
        jLabel3.setText("Telefone");
        jLabel4.setText("Email");
        jLabel5.setText("Placa");

        bntSalvar.setText("Salvar");
        bntSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSalvarActionPerformed(evt);
            }
        });

        bntEditar.setText("Editar");

        bntExcluir.setText("Excluir");
        bntExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1).addComponent(jLabel2).addComponent(jLabel3).addComponent(jLabel4).addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1).addComponent(txtCPF).addComponent(txtTelefone).addComponent(txtEmail).addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(315, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(bntSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(bntEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(bntExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel1).addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel2).addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel3).addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel4).addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel5).addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(bntSalvar).addComponent(bntEditar).addComponent(bntExcluir))
                .addContainerGap(200, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Clientes", jPanel1);

        jLabel6.setText("Cliente");
        jLabel7.setText("Serviço");
        
        bntAgendar.setText("Agendar");
        bntAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAgendarActionPerformed(evt);
            }
        });

        bntCancelar.setText("Cancelar");
        
        bntNovoServico.setText("Novo Serviço");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] { "Title 1", "Title 2", "Title 3", "Title 4" }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel6).addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(comboClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(comboServicos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(bntAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bntCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bntNovoServico, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel6).addComponent(comboClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel7).addComponent(comboServicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(bntAgendar).addComponent(bntCancelar).addComponent(bntNovoServico))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Agendar", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jTabbedPane1));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jTabbedPane1));
        pack();
    }// </editor-fold>                        

    public TelaPrincipal() {
        initComponents();
        
        bntAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { bntAgendarActionPerformed(evt); }
        });
        bntCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { bntCancelarActionPerformed(evt); }
        });
        bntEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { bntEditarActionPerformed(evt); }
        });
        bntNovoServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { bntNovoServicoActionPerformed(evt); }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] { "ID", "Cliente", "Serviço", "Data/Hora", "Status" }
        ));
        
        carregarServicosCombo();
        carregarClientesCombo();
    }

    private void carregarTabelaAgenda() {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0);
        for (Agendamento a : agendaCtrl.listarTodos()) {
            modelo.addRow(new Object[]{a.getId(), a.getCliente().getNome(), a.getTipoServico().getNome(), a.getDataHora(), a.getStatus()});
        }
    }

    private void carregarClientesCombo() {
        comboClientes.removeAllItems();
        for (Cliente c : clienteCtrl.listarTodos()) {
            comboClientes.addItem(c.toString());
        }
    }

    private void carregarServicosCombo() {
        comboServicos.removeAllItems();
        for (TipoServico s : servicoCtrl.listarTodos()) {
            comboServicos.addItem(s.toString());
        }
    }

    private void limparCamposCliente() {
        jTextField1.setText("");
        txtCPF.setText("");
        txtTelefone.setText("");
        txtEmail.setText("");
        txtPlaca.setText("");
    }

    private void bntSalvarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (idClienteEditando == -1) {
            clienteCtrl.cadastrar(jTextField1.getText(), txtCPF.getText(), txtTelefone.getText(), txtEmail.getText(), txtPlaca.getText());
            JOptionPane.showMessageDialog(this, "Cliente salvo!");
        } else {
            clienteCtrl.editar(idClienteEditando, jTextField1.getText(), txtCPF.getText(), txtTelefone.getText(), txtEmail.getText(), txtPlaca.getText());
            idClienteEditando = -1;
            bntSalvar.setText("Salvar");
            JOptionPane.showMessageDialog(this, "Cliente atualizado!");
        }
        limparCamposCliente();
        carregarClientesCombo();
    }                                         

    private void bntExcluirActionPerformed(java.awt.event.ActionEvent evt) {                                           
        JOptionPane.showMessageDialog(this, "Para excluir, adicione uma tabela na aba Clientes.");
    }                                          

    private void bntEditarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        int linha = jTable1.getSelectedRow();
        if (linha >= 0) {
            idClienteEditando = (int) jTable1.getValueAt(linha, 0);
            jTextField1.setText((String) jTable1.getValueAt(linha, 1));
            txtCPF.setText((String) jTable1.getValueAt(linha, 2));
            bntSalvar.setText("Atualizar");
            JOptionPane.showMessageDialog(this, "Dados carregados para edição!");
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um cliente na tabela para editar.");
        }
    }

    private void bntAgendarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        String nomeCliente = (String) comboClientes.getSelectedItem();
        String nomeServico = (String) comboServicos.getSelectedItem();
        if (nomeCliente == null || nomeServico == null) { return; }
        
        Cliente c = null;
        for (Cliente cli : clienteCtrl.listarTodos()) {
            if (cli.toString().equals(nomeCliente)) { c = cli; break; }
        }
        TipoServico s = null;
        for (TipoServico serv : servicoCtrl.listarTodos()) {
            if (serv.toString().equals(nomeServico)) { s = serv; break; }
        }
        
        String resultado = agendaCtrl.agendar(c, s, LocalDateTime.now().plusHours(1));
        JOptionPane.showMessageDialog(this, resultado);
        if (resultado.contains("Sucesso")) { carregarTabelaAgenda(); }
    }                                          

    private void bntCancelarActionPerformed(java.awt.event.ActionEvent evt) {                                             
        int linha = jTable1.getSelectedRow();
        if (linha >= 0) {
            agendaCtrl.cancelar((int) jTable1.getValueAt(linha, 0));
            JOptionPane.showMessageDialog(this, "Agendamento cancelado!");
            carregarTabelaAgenda();
        }
    }

    private void bntNovoServicoActionPerformed(java.awt.event.ActionEvent evt) {                                               
        String nome = JOptionPane.showInputDialog(this, "Nome do Serviço:");
        if (nome == null || nome.trim().isEmpty()) return;
        String precoStr = JOptionPane.showInputDialog(this, "Preço do Serviço (ex: 50.00):");
        try {
            double preco = Double.parseDouble(precoStr.replace(",", "."));
            servicoCtrl.cadastrar(nome, "Serviço cadastrado", preco);
            carregarServicosCombo();
            JOptionPane.showMessageDialog(this, "Serviço cadastrado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Preço inválido!");
        }
    }

    // Variables declaration
    private javax.swing.JButton bntAgendar;
    private javax.swing.JButton bntCancelar;
    private javax.swing.JButton bntEditar;
    private javax.swing.JButton bntExcluir;
    private javax.swing.JButton bntSalvar;
    private javax.swing.JButton bntNovoServico;
    private javax.swing.JComboBox<String> comboClientes;
    private javax.swing.JComboBox<String> comboServicos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtTelefone;
}
