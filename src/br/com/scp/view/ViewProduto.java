package br.com.scp.view;

import br.com.scp.controller.ControllerFornecedor;
import br.com.scp.controller.ControllerProdutos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import br.com.scp.model.ModelFornecedor;
import br.com.scp.model.ModelProdutos;


public class ViewProduto extends javax.swing.JFrame {

    ModelProdutos modelProdutos = new ModelProdutos();
    ControllerProdutos controllerProdutos = new ControllerProdutos();
    ControllerFornecedor controllerFornecedor = new ControllerFornecedor();
    ArrayList<ModelProdutos> listamModelProdutos = new ArrayList<ModelProdutos>();
    ArrayList<ModelFornecedor> listaFornecedor = new ArrayList<ModelFornecedor>();
    String tipoCadastro;
    
    
    public ViewProduto() {
        initComponents();
        setLocationRelativeTo(null);
        this.carregarProdutos();
        this.listarFornecedor();
        this.desabilitarCampos();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btPesquisaProduto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btNovo = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbProdutos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        tfCodigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfValor = new javax.swing.JFormattedTextField();
        tfEstoque = new javax.swing.JFormattedTextField();
        jtfNome = new javax.swing.JTextField();
        tfPesquisaProduto = new javax.swing.JTextField();
        cbFornecedores = new componentes.UJComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Produtos");
        setAlwaysOnTop(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btPesquisaProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Search.png"))); // NOI18N
        btPesquisaProduto.setText("Pesquisar");
        btPesquisaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisaProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(btPesquisaProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 119, -1, -1));

        jLabel1.setText("Nome:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 10, -1, -1));

        jLabel2.setText("Valor:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 10, -1, -1));

        jLabel3.setText("Fornecedor:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 140, -1));

        jLabel4.setText("Estoque:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, -1));

        btNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Add.png"))); // NOI18N
        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });
        getContentPane().add(btNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, -1, -1));

        btAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Modify.png"))); // NOI18N
        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(btAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, -1, -1));

        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Delete.png"))); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, -1, -1));

        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/No.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        tbProdutos.setAutoCreateRowSorter(true);
        tbProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Valor", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbProdutos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tbProdutos.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tbProdutos);
        if (tbProdutos.getColumnModel().getColumnCount() > 0) {
            tbProdutos.getColumnModel().getColumn(1).setPreferredWidth(250);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 152, 463, 230));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Save.png"))); // NOI18N
        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, -1, -1));

        tfCodigo.setEditable(false);
        tfCodigo.setEnabled(false);
        getContentPane().add(tfCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 82, -1));

        jLabel5.setText("Código:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        getContentPane().add(tfValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 31, 111, -1));
        getContentPane().add(tfEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 81, 124, -1));
        getContentPane().add(jtfNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 31, 259, -1));
        getContentPane().add(tfPesquisaProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 123, 357, -1));
        getContentPane().add(cbFornecedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 320, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPesquisaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisaProdutoActionPerformed
        
    }//GEN-LAST:event_btPesquisaProdutoActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        novoProduto();
        habilitarCampos();
        tipoCadastro = "novo";
    }//GEN-LAST:event_btNovoActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        novoProduto();
        habilitarCampos();
        recuperarProduto();
        tipoCadastro = "alteracao";
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        excluirProduto();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.desabilitarCampos();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (tipoCadastro.equals("novo")){
            salvarProduto();
        } else if(tipoCadastro.equals("alteracao")){
            alterarProduto();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void listarFornecedor(){
        listaFornecedor = controllerFornecedor.getListaFornecedorController();
        cbFornecedores.removeAllItems();
        for (int i = 0; i < listaFornecedor.size(); i++){
            cbFornecedores.addItem(listaFornecedor.get(i).getNome());
        }
    }
    
    private void excluirProduto(){
        int linha = tbProdutos.getSelectedRow();
        String nome = (String) tbProdutos.getValueAt(linha, 1);
        int codigo = (int) tbProdutos.getValueAt(linha, 0);
      
        int opcao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja"
                + " excluir o registro:\n" + "\n " + nome + "?", "Atenção", JOptionPane.YES_NO_OPTION);
      
        if (opcao == JOptionPane.OK_OPTION) {
            if (controllerProdutos.excluirProdutosController(codigo)) {
                JOptionPane.showMessageDialog(null, "Registro excluido com suscesso!");
                carregarProdutos();
            }else{
            JOptionPane.showMessageDialog(this, "Erro ao e os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private boolean recuperarProduto() {
        
        int linha = this.tbProdutos.getSelectedRow();
        
        int codigo = (Integer) tbProdutos.getValueAt(linha, 0);
        try {
            
            modelProdutos = controllerProdutos.getProdutosController(codigo);
          
            this.tfCodigo.setText(String.valueOf(modelProdutos.getCodigo()));
            this.jtfNome.setText(modelProdutos.getNome());
            this.tfValor.setText(modelProdutos.getValor().toString());
            this.tfEstoque.setText(String.valueOf(modelProdutos.getEstoque()));
            this.cbFornecedores.setSelectedItem(controllerFornecedor.getFornecedorController(modelProdutos.getFornecedoresCodigo()).getNome());
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Código inválido ou nenhum registro selecionado", "Aviso", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }
    
    private boolean alterarProduto(){
        modelProdutos.setCodigo(Integer.parseInt(this.tfCodigo.getText()));
        modelProdutos.setNome(this.jtfNome.getText());
        modelProdutos.setValor(Double.parseDouble(this.tfValor.getText()));
        modelProdutos.setFornecedoresCodigo(controllerFornecedor.getFornecedorController(this.cbFornecedores.getSelectedItem().toString()).getCodigo());
        modelProdutos.setEstoque(Integer.parseInt(this.tfEstoque.getText()));
       
        if (controllerProdutos.atualizarProdutosController(modelProdutos)) {
            JOptionPane.showMessageDialog(this, "Registro alterado com sucesso!");
            this.desabilitarCampos();
            this.carregarProdutos();
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao alterar os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
     private void carregarProdutos() {
        listamModelProdutos = controllerProdutos.getListaProdutosController();
        DefaultTableModel modelo = (DefaultTableModel) tbProdutos.getModel();
        modelo.setNumRows(0);
       
        int cont = listamModelProdutos.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listamModelProdutos.get(i).getCodigo(),
                listamModelProdutos.get(i).getNome(),
                listamModelProdutos.get(i).getValor(),
                listamModelProdutos.get(i).getEstoque()
            });
        }
    }
    
    protected void desabilitarCampos(){
        jtfNome.setEditable(false);
        tfValor.setEditable(false);
        tfEstoque.setEditable(false);
        tfPesquisaProduto.setEditable(false);
        carregarProdutos();
    }
    
    private void novoProduto(){
        habilitarCampos();
        tfCodigo.setText("Novo");
        jtfNome.setText("");
        tfValor.setText("");
        tfEstoque.setText("");
        cbFornecedores.setSelectedItem("");
        tipoCadastro = "novo";
    }
    
    private void habilitarCampos(){
        jtfNome.setEditable(true);
        tfValor.setEditable(true);
        tfEstoque.setEditable(true);
        cbFornecedores.setEditable(true);
    }
    
    private boolean salvarProduto(){
        modelProdutos.setNome(this.jtfNome.getText());
        modelProdutos.setValor(Double.parseDouble(this.tfValor.getText()));
        modelProdutos.setFornecedoresCodigo(controllerFornecedor.getFornecedorController(this.cbFornecedores.getSelectedItem().toString()).getCodigo());
        modelProdutos.setEstoque(Integer.parseInt(this.tfEstoque.getText()));
         
        if (controllerProdutos.salvarProdutosController(modelProdutos)>0) {
            JOptionPane.showMessageDialog(this, "gravado com sucesso!");
            this.desabilitarCampos();
            this.carregarProdutos();
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao gravar os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btPesquisaProduto;
    private componentes.UJComboBox cbFornecedores;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTable tbProdutos;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JFormattedTextField tfEstoque;
    private javax.swing.JTextField tfPesquisaProduto;
    private javax.swing.JFormattedTextField tfValor;
    // End of variables declaration//GEN-END:variables
}
