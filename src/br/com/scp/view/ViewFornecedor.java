
package br.com.scp.view;

import br.com.scp.facade.ControllerFornecedor;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import br.com.scp.model.Fornecedor;

public class ViewFornecedor extends javax.swing.JFrame {
    Fornecedor modelFornecedor = new Fornecedor();
    ArrayList<Fornecedor> listModelFornecedors = new ArrayList<>();
    ControllerFornecedor controllerFornecedor = new ControllerFornecedor();
    String tipoCadastro;
    
  
    public ViewFornecedor() {
        initComponents();
        setLocationRelativeTo(null);
        carregarFornecedores();
        String tipoCadastro;
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfPesquisaFornecedor = new javax.swing.JTextField();
        btPesquisarFornecedor = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfEndereco = new javax.swing.JTextField();
        tfBairro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfCidade = new javax.swing.JTextField();
        tfUf = new javax.swing.JTextField();
        tfCep = new javax.swing.JTextField();
        tfTelefone = new javax.swing.JTextField();
        btNovo = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbFornecedores = new javax.swing.JTable();
        tfCodigo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fornecedores");
        setResizable(false);

        btPesquisarFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Search.png"))); // NOI18N
        btPesquisarFornecedor.setText("Pesquisar");
        btPesquisarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarFornecedorActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:");

        jLabel2.setText("Endereço:");

        jLabel3.setText("Bairro:");

        jLabel4.setText("Cidade:");

        jLabel5.setText("UF:");

        jLabel6.setText("CEP:");

        jLabel7.setText("Telefone:");

        btNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Add.png"))); // NOI18N
        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        btAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Modify.png"))); // NOI18N
        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/No.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Delete.png"))); // NOI18N
        jButton1.setText("Excluir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Save.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        tbFornecedores.setAutoCreateRowSorter(true);
        tbFornecedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Cidade", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbFornecedores.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tbFornecedores.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tbFornecedores);
        if (tbFornecedores.getColumnModel().getColumnCount() > 0) {
            tbFornecedores.getColumnModel().getColumn(1).setPreferredWidth(250);
        }

        jLabel8.setText("Codigo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSalvar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfPesquisaFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btPesquisarFornecedor))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tfCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                                        .addComponent(jLabel4)
                                        .addComponent(tfEndereco))
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel5)
                                                .addComponent(tfUf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel6)
                                                .addComponent(tfCep, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel7)
                                                .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(tfBairro)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfCodigo)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btCancelar, btPesquisarFornecedor});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btPesquisarFornecedor)
                    .addComponent(tfPesquisaFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNovo)
                    .addComponent(btAlterar)
                    .addComponent(btCancelar)
                    .addComponent(jButton1)
                    .addComponent(btSalvar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btAlterar, btCancelar, btNovo, btPesquisarFornecedor});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPesquisarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarFornecedorActionPerformed
     
    }//GEN-LAST:event_btPesquisarFornecedorActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        this.novo();
        this.habilitarCampos();
        this.recuperarFornecedor();
        tipoCadastro = "alteracao";
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
       
        this.novo();
    }//GEN-LAST:event_btNovoActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if(tipoCadastro.equals("novo")){
            salvarFornecedor();
        } else if(tipoCadastro.equals("alteracao")){
            alteraFornecedor();
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int linha = tbFornecedores.getSelectedRow();
        String nome = (String) tbFornecedores.getValueAt(linha, 1);
        int codigo = (int) tbFornecedores.getValueAt(linha, 0);

        
        int opcao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja"
                + " excluir o registro:\n" + "\n " + nome + "?", "Atenção", JOptionPane.YES_NO_OPTION);
           
        if (opcao == JOptionPane.OK_OPTION) {
            if (controllerFornecedor.excluirFornecedorController(codigo)) {
                JOptionPane.showMessageDialog(null, "Registro excluido com suscesso!");
                carregarFornecedores();
            }else{
            JOptionPane.showMessageDialog(this, "Erro ao e os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
       
        this.desabilitarCampos();
    }//GEN-LAST:event_btCancelarActionPerformed
    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewFornecedor().setVisible(true);
            }
        });
    }
    
   private boolean alteraFornecedor() {
        modelFornecedor.setCodigo(Integer.parseInt(this.tfCodigo.getText()));
        modelFornecedor.setNome(this.tfNome.getText());
        modelFornecedor.setEndereco(this.tfEndereco.getText());
        modelFornecedor.setBairro(this.tfBairro.getText());
        modelFornecedor.setCidade(this.tfCidade.getText());
        modelFornecedor.setUf(this.tfUf.getText());
        modelFornecedor.setCep(this.tfCep.getText());
        modelFornecedor.setTelefone(this.tfTelefone.getText());

        
        if (controllerFornecedor.atualizarFornecedorController(modelFornecedor)) {
            JOptionPane.showMessageDialog(this, "Registro alterado com sucesso!");
            this.desabilitarCampos();
            this.carregarFornecedores();
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao alterar os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    private boolean salvarFornecedor() {
        modelFornecedor.setNome(this.tfNome.getText());
        modelFornecedor.setEndereco(this.tfEndereco.getText());
        modelFornecedor.setBairro(this.tfBairro.getText());
        modelFornecedor.setCidade(this.tfCidade.getText());
        modelFornecedor.setUf(this.tfUf.getText());
        modelFornecedor.setCep(this.tfCep.getText());
        modelFornecedor.setTelefone(this.tfTelefone.getText());

        
        if (controllerFornecedor.salvarFornecedorController(modelFornecedor)>0) {
            JOptionPane.showMessageDialog(this, "Registro gravado com sucesso!");
            this.desabilitarCampos();
            this.carregarFornecedores();
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao gravar os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    private boolean recuperarFornecedor() {
        
        int linha = this.tbFornecedores.getSelectedRow();

      
        int codigo = (Integer) tbFornecedores.getValueAt(linha, 0);

        try {
            
            modelFornecedor = controllerFornecedor.getFornecedorController(codigo);
            
            this.tfCodigo.setText(String.valueOf(modelFornecedor.getCodigo()));
            this.tfNome.setText(modelFornecedor.getNome());
            this.tfEndereco.setText(modelFornecedor.getEndereco());
            this.tfBairro.setText(modelFornecedor.getBairro());
            this.tfCidade.setText(modelFornecedor.getCidade());
            this.tfUf.setText(modelFornecedor.getUf());
            this.tfCep.setText(modelFornecedor.getCep());
            this.tfTelefone.setText(modelFornecedor.getTelefone());
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Código inválido ou nenhum registro selecionado", "Aviso", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }
    
     private void carregarFornecedores() {
        listModelFornecedors = controllerFornecedor.getListaFornecedorController();
        DefaultTableModel modelo = (DefaultTableModel) tbFornecedores.getModel();
        modelo.setNumRows(0);
        
        int cont = listModelFornecedors.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listModelFornecedors.get(i).getCodigo(),
                listModelFornecedors.get(i).getNome(),
                listModelFornecedors.get(i).getCidade(),
                listModelFornecedors.get(i).getUf()
            });
        }
    }
    
    private void novo(){
        habilitarCampos();
        tfCodigo.setText("Novo");
        tfNome.setText("");
        tfEndereco.setText("");
        tfCidade.setText("");
        tfBairro.setText("");
        tfUf.setText("");
        tfCep.setText("");
        tfTelefone.setText("");
        tipoCadastro = "novo";
    }
    
    protected boolean verificarCampos(){
        if (!tfNome.getText().trim().equals("")){
            return true;
        }
        return false;
    }
    
    private void habilitarCampos(){
        tfNome.setEditable(true);
        tfEndereco.setEditable(true);
        tfBairro.setEditable(true);
        tfCidade.setEditable(true);
        tfCep.setEditable(true);
        tfUf.setEditable(true);
        tfTelefone.setEditable(true);
        btSalvar.setEnabled(true);
    }
    
    protected void desabilitarCampos(){
        tfNome.setEditable(false);
        tfEndereco.setEditable(false);
        tfBairro.setEditable(false);
        tfCidade.setEditable(false);
        tfCep.setEditable(false);
        tfUf.setEditable(false);
        tfTelefone.setEditable(false);
        btSalvar.setEnabled(false);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btPesquisarFornecedor;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbFornecedores;
    private javax.swing.JTextField tfBairro;
    private javax.swing.JTextField tfCep;
    private javax.swing.JTextField tfCidade;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfPesquisaFornecedor;
    private javax.swing.JTextField tfTelefone;
    private javax.swing.JTextField tfUf;
    // End of variables declaration//GEN-END:variables
    
}
