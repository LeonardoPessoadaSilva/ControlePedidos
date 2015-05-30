
package br.com.scp.view;

import br.com.scp.facade.ControllerCliente;
import br.com.scp.facade.ControllerProdutos;
import br.com.scp.facade.ControllerPedidos;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import br.com.scp.model.Cliente;
import br.com.scp.model.Produtos;
import br.com.scp.model.Pedidos;
import br.com.scp.util.SCPDatas;


public class ViewPedido extends javax.swing.JFrame {
    
    ControllerPedidos controllerPedidos = new ControllerPedidos();
    Pedidos modelPedidos = new Pedidos();
    Produtos modelProdutos = new Produtos();
    ArrayList<Pedidos> listaModelPedidos = new ArrayList<>();
    ArrayList<Cliente> listaModelClientes = new ArrayList<>();
    ArrayList<Produtos> listaProdutoses = new ArrayList<>();
    ControllerCliente controllerCliente = new ControllerCliente();
    ControllerProdutos controllerProdutos = new ControllerProdutos();
    
   
    public ViewPedido() {
        initComponents();
        listarClientes();
        listarProdutos();
        this.carregarPedidos();
        setLocationRelativeTo(null);
        this.desabilitarCampos();
    }
    
    private void listarProdutos(){
        listaProdutoses = controllerProdutos.getListaProdutosController();
        jcbProdutos.removeAllItems();
        for (int i = 0; i < listaProdutoses.size(); i++){
            jcbProdutos.addItem(listaProdutoses.get(i).getNome());
        }
    }
    
    private void listarClientes(){
        listaModelClientes = controllerCliente.getListaClienteController();
        jcbClientes.removeAllItems();
        for (int i = 0; i < listaModelClientes.size(); i++){
            jcbClientes.addItem(listaModelClientes.get(i).getNome());
        }
    }
    
    public void setViewConsultarPedidos(){
        this.jTabbedPane1.setSelectedIndex(1);
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        tfQuantidade = new JFormattedTextField(NumberFormat.getNumberInstance());
        jLabel3 = new javax.swing.JLabel();
        btFinalizar = new javax.swing.JButton();
        btIncluirProduto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfDesconto = new JFormattedTextField(NumberFormat.getNumberInstance());
        jLabel4 = new javax.swing.JLabel();
        btCancelar = new javax.swing.JButton();
        tfValorTotal = new JFormattedTextField(NumberFormat.getNumberInstance());
        btRetirar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbProdutos = new javax.swing.JTable();
        tfNumeroPedido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jcbClientes = new javax.swing.JComboBox();
        jcbProdutos = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        btPesquisar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        btCancelar1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbConsultasPedidos = new javax.swing.JTable();
        jbAlterar = new javax.swing.JButton();
        jbImprimir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Venda");
        setResizable(false);

        jTabbedPane1.setMinimumSize(new java.awt.Dimension(520, 405));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfQuantidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jPanel1.add(tfQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 58, -1));

        jLabel3.setText("Quant.:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, -1, -1));

        btFinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Save.png"))); // NOI18N
        btFinalizar.setText("Salvar");
        btFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFinalizarActionPerformed(evt);
            }
        });
        jPanel1.add(btFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, -1, -1));

        btIncluirProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Create.png"))); // NOI18N
        btIncluirProduto.setText("Incluir");
        btIncluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIncluirProdutoActionPerformed(evt);
            }
        });
        jPanel1.add(btIncluirProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, -1, -1));

        jLabel1.setText("Cliente:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel2.setText("Produto:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel5.setText("Total:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, -1, -1));

        tfDesconto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        tfDesconto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfDescontoKeyReleased(evt);
            }
        });
        jPanel1.add(tfDesconto, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 94, -1));

        jLabel4.setText("Desconto:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, -1, -1));

        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/No.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        tfValorTotal.setEditable(false);
        tfValorTotal.setBackground(new java.awt.Color(255, 153, 153));
        tfValorTotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat(""))));
        jPanel1.add(tfValorTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 120, -1));

        btRetirar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Delete.png"))); // NOI18N
        btRetirar.setText("Retirar");
        btRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRetirarActionPerformed(evt);
            }
        });
        jPanel1.add(btRetirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Add.png"))); // NOI18N
        jButton3.setText("Novo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, -1, -1));

        tbProdutos.setAutoCreateRowSorter(true);
        tbProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Valor unit.", "Quantidade", "Valor total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
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
        jScrollPane3.setViewportView(tbProdutos);
        if (tbProdutos.getColumnModel().getColumnCount() > 0) {
            tbProdutos.getColumnModel().getColumn(0).setPreferredWidth(300);
        }

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 530, 190));

        tfNumeroPedido.setEditable(false);
        tfNumeroPedido.setBackground(new java.awt.Color(102, 255, 204));
        jPanel1.add(tfNumeroPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 30, 140, -1));

        jLabel6.setText("Nº de venda:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        jPanel1.add(jcbClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 370, -1));

        jPanel1.add(jcbProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 280, -1));

        jTabbedPane1.addTab("Cadastro", jPanel1);

        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Search.png"))); // NOI18N
        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        jbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Delete.png"))); // NOI18N
        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        btCancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/No.png"))); // NOI18N
        btCancelar1.setText("Cancelar");
        btCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelar1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Pesquisa:");

        tbConsultasPedidos.setAutoCreateRowSorter(true);
        tbConsultasPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Venda", "Cliente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbConsultasPedidos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tbConsultasPedidos.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(tbConsultasPedidos);
        if (tbConsultasPedidos.getColumnModel().getColumnCount() > 0) {
            tbConsultasPedidos.getColumnModel().getColumn(0).setHeaderValue("Código");
            tbConsultasPedidos.getColumnModel().getColumn(1).setPreferredWidth(150);
            tbConsultasPedidos.getColumnModel().getColumn(1).setHeaderValue("Cliente");
        }

        jbAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Modify.png"))); // NOI18N
        jbAlterar.setText("Alterar");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jbImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/print.png"))); // NOI18N
        jbImprimir.setText("Imprimir");
        jbImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btCancelar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 261, Short.MAX_VALUE)
                        .addComponent(jbAlterar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btPesquisar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbImprimir)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(13, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(13, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPesquisar)
                    .addComponent(jbImprimir))
                .addGap(306, 306, 306)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbExcluir)
                    .addComponent(btCancelar1)
                    .addComponent(jbAlterar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(69, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(54, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Consulta", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        desabilitarCampos();
    }//GEN-LAST:event_btCancelarActionPerformed

    protected void desabilitarCampos(){
        jcbClientes.setSelectedIndex(0);
        jcbProdutos.setSelectedIndex(0);
        tfNumeroPedido.setText("");
        tfQuantidade.setText("");
        tfDesconto.setText("");
        tfValorTotal.setText("");
        DefaultTableModel modelo = (DefaultTableModel) tbProdutos.getModel();
        modelo.setNumRows(0);      
        jcbClientes.setEnabled(false);
        jcbProdutos.setEnabled(false);
        tfQuantidade.setEnabled(false);
        tfDesconto.setEnabled(false);
    }
    
    private void btFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFinalizarActionPerformed
        cadastrarPedido();
    }//GEN-LAST:event_btFinalizarActionPerformed

    private boolean cadastrarPedido() {
        if (tfDesconto.getText().equals("") || tfValorTotal.getText().equals("") || tbProdutos.getRowCount() < 1) {
            JOptionPane.showMessageDialog(this, "Você deve preencher todos os campos!", "ATENÇÂO", JOptionPane.WARNING_MESSAGE);
            return false;
        } else {
            listaModelPedidos = new ArrayList<>();
            listaProdutoses = new ArrayList<>();
            int codigoProduto, quantidade;
            SCPDatas bl = new SCPDatas();

            for (int i = 0; i < tbProdutos.getRowCount(); i++) {
                modelPedidos = new Pedidos();
                modelProdutos = new Produtos();
                modelPedidos.setClientesCodigo(controllerCliente.getClienteController(jcbClientes.getSelectedItem().toString()).getCodigo());
                modelPedidos.setDesconto(Float.parseFloat(this.tfDesconto.getText()));
                modelPedidos.setValorTotal(Float.parseFloat(this.tfValorTotal.getText()));
                try {
                    modelPedidos.setDataPedido(bl.converterDataParaDateUS(new java.util.Date(System.currentTimeMillis())));
                } catch (Exception ex) {
                    Logger.getLogger(ViewPedido.class.getName()).log(Level.SEVERE, null, ex);
                }
                codigoProduto = controllerProdutos.getProdutosController(tbProdutos.getValueAt(i,0).toString()).getCodigo();
                modelPedidos.setProdutosCodigo(codigoProduto);
                modelPedidos.setQuantidade(Integer.parseInt(tbProdutos.getValueAt(i, 2).toString()));
                modelProdutos.setCodigo(codigoProduto);
                quantidade = controllerProdutos.getProdutosController(codigoProduto).getEstoque() - Integer.parseInt(tbProdutos.getValueAt(i, 2).toString());
                modelProdutos.setEstoque(quantidade);
                listaModelPedidos.add(modelPedidos);
                listaProdutoses.add(modelProdutos);
            }
            modelPedidos.setListamModelVendases(listaModelPedidos);
            modelProdutos.setListaModelProdutoses(listaProdutoses);
            
            //salvar venda
            int codigoPedido = controllerPedidos.salvarPedidosController(modelPedidos);
            if (codigoPedido > 0) {
                modelPedidos.setCodigo(codigoPedido);
                //da baixa no estoque
                controllerProdutos.atualizarProdutosQuantidadeController(modelProdutos);
                //salvar lista de produtos
                controllerPedidos.salvarPedidosProdutosController(modelPedidos);
                JOptionPane.showMessageDialog(this, "Registro gravado com sucesso!");
                this.habilitarCampos();
                this.carregarPedidos();
                //avançar para aba 2
                jTabbedPane1.setSelectedIndex(jTabbedPane1.getSelectedIndex() + 1);
                return true;
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao gravar os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
    }
    
    private void btIncluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIncluirProdutoActionPerformed
        this.incluirProduto();
        this.tfValorTotal.setText(String.valueOf(this.somaEAtualizaValorTotal()));
    }//GEN-LAST:event_btIncluirProdutoActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
//        pesquisarVendas();
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        int linha = tbConsultasPedidos.getSelectedRow();
        String nome = (String) tbConsultasPedidos.getValueAt(linha, 1);
        int codigo = (int) tbConsultasPedidos.getValueAt(linha, 0);

        //pegunta se realmente deseja excluir
        int opcao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja"
                + " excluir o registro:\n" + "\n " + nome + "?", "Atenção", JOptionPane.YES_NO_OPTION);
        //se sim exclui, se não não faz nada    
        if (opcao == JOptionPane.OK_OPTION) {
            if (controllerPedidos.excluirPedidosController(codigo)) {
                if (controllerPedidos.excluirPedidosController(codigo)) {     
                JOptionPane.showMessageDialog(null, "Registro excluido com suscesso!");
                }else{
                    JOptionPane.showMessageDialog(this, "Erro ao excluir os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
                }
                JOptionPane.showMessageDialog(null, "Registro excluido com suscesso!");
                carregarPedidos();
            }else{
            JOptionPane.showMessageDialog(this, "Erro ao excluir os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void btCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btCancelar1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.novoProduto();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        // TODO add your handling code here:
        recuperarVenda();
        //voltar para aba 1
        jTabbedPane1.setSelectedIndex(jTabbedPane1.getSelectedIndex() - 1 );
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void btRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRetirarActionPerformed
        // para excluir a linha
        int linhaSelecionada = tbProdutos.getSelectedRow();
        // Verificamos se existe realmente alguma linha selecionada
        if (linhaSelecionada < 0) {
            return;
        } else {
            // Obtem o modelo da JTable
            DefaultTableModel modelo = (DefaultTableModel) tbProdutos.getModel();
            // Remove a linha
            modelo.removeRow(linhaSelecionada);
        }
    }//GEN-LAST:event_btRetirarActionPerformed

    private void tfDescontoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDescontoKeyReleased
        try{
            float desconto = Float.parseFloat(this.tfDesconto.getText());
            float total = Float.parseFloat(this.tfValorTotal.getText());
            float valorFinal = total - desconto;
            
            this.tfValorTotal.setText(String.valueOf(valorFinal));
        }catch(NumberFormatException e){
            this.tfDesconto.setText("0");
            JOptionPane.showMessageDialog(this, "Campo numérico!");
        }
    }//GEN-LAST:event_tfDescontoKeyReleased

    private void jbImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbImprimirActionPerformed
        // imrimir fornecedores
        
        ControllerPedidos controllerPedidos = new ControllerPedidos();
        
        int linha = tbConsultasPedidos.getSelectedRow();
        int codigo = (int) tbConsultasPedidos.getValueAt(linha, 0);

        controllerPedidos.gerarRelatorioPedido(codigo);
        
    }//GEN-LAST:event_jbImprimirActionPerformed

    private boolean recuperarVenda() {
        try {
            //recebe a linha selecionada
            int linha = this.tbConsultasPedidos.getSelectedRow();
            //pega o codigo do cliente na linha selecionada
            int codigo = (Integer) tbConsultasPedidos.getValueAt(linha, 0);
            int codigoProduto;
            modelPedidos.setCodigo(codigo);
            //recupera os dados do banco
            modelPedidos = controllerPedidos.getPedidosController(codigo);
            //seta os dados na interface
            this.jcbClientes.setSelectedItem(controllerCliente.getClienteController(modelPedidos.getCodigo()).getNome());
            this.tfNumeroPedido.setText(String.valueOf(modelPedidos.getCodigo()));
            this.tfDesconto.setText(String.valueOf(modelPedidos.getDesconto()));
            this.tfValorTotal.setText(String.valueOf(modelPedidos.getValorTotal()));
            //recupera os dados do banco
            listaModelPedidos = controllerPedidos.getListaPedidosController(codigo);
            //carregar lista de produtos da venda
            DefaultTableModel modelo = (DefaultTableModel) tbProdutos.getModel();
            modelo.setNumRows(0);
            
            int cont = listaModelPedidos.size();
            for (int i = 0; i < cont; i++) {
                codigoProduto = listaModelPedidos.get(i).getProdutosCodigo();
                modelProdutos = controllerProdutos.getProdutosController(codigoProduto);
                modelo.addRow(new Object[]{
                    modelProdutos.getNome(),
                    modelProdutos.getValor(),
                    listaModelPedidos.get(i).getQuantidade(),
                    listaModelPedidos.get(i).getQuantidade() * modelProdutos.getValor()                  
                });
            }
            
            return true;
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Código inválido ou nenhum registro selecionado", "Aviso", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }
    
   
    private void novoProduto(){
        tfNumeroPedido.setText("Novo");
        tfQuantidade.setText("");
        listarClientes();
        listarProdutos();
        DefaultTableModel modelo = (DefaultTableModel) tbProdutos.getModel();
        modelo.setNumRows(0);
        this.tfDesconto.setText("0");
        habilitarCampos();
    }
    
    private void habilitarCampos(){
        jcbClientes.setEnabled(true);
        jcbProdutos.setEnabled(true);
        tfQuantidade.setEnabled(true);
        tfDesconto.setEnabled(true);
    }
    
    private void incluirProduto(){
       // TODO add your handling code here:
        if(tfQuantidade.getText().equals("")){
        JOptionPane.showMessageDialog(rootPane, "Você deve informar a quantidade para adicionar!");
        }else{
            //Adiciona linhas na tabela
            DefaultTableModel modelo = (DefaultTableModel)tbProdutos.getModel();
            int cont = 0;
            for(int i = 0; i < cont; i++){
                modelo.setNumRows(0);
            }

            Double valor = controllerProdutos.getProdutosController(this.jcbProdutos.getSelectedItem().toString()).getValor();
            //pega a quantidade de linhas e joga na variavel
            modelo.addRow(new Object [] {
            this.jcbProdutos.getSelectedItem().toString(),
            valor,
            this.tfQuantidade.getText(),
            valor * Float.parseFloat(this.tfQuantidade.getText())
            });
        } 
    }
    
    /**
     * Soma e atualiza os valores total
     * @return 
     */
    private double somaEAtualizaValorTotal() {
        double soma = 0;
        double valor = 0;
        int cont = tbProdutos.getRowCount();
        for (int i = 0; i < cont; i++) {
            valor = Double.parseDouble(String.valueOf(tbProdutos.getValueAt(i, 3)));
            soma = valor+soma;
        }
        return soma;
    }
    
    
     private void carregarPedidos() {
        listaModelPedidos = controllerPedidos.getListaPedidosController();
        DefaultTableModel modelo = (DefaultTableModel) tbConsultasPedidos.getModel();
        modelo.setNumRows(0);
        //CARREGA OS DADOS DA LISTA NA TABELA
        int cont = listaModelPedidos.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelPedidos.get(i).getCodigo(),
                controllerCliente.getClienteController(listaModelPedidos.get(i).getClientesCodigo()).getNome()
            });
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPedido().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btCancelar1;
    private javax.swing.JButton btFinalizar;
    private javax.swing.JButton btIncluirProduto;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btRetirar;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbImprimir;
    private javax.swing.JComboBox jcbClientes;
    private javax.swing.JComboBox jcbProdutos;
    private javax.swing.JTable tbConsultasPedidos;
    private javax.swing.JTable tbProdutos;
    private javax.swing.JFormattedTextField tfDesconto;
    private javax.swing.JTextField tfNumeroPedido;
    private javax.swing.JFormattedTextField tfQuantidade;
    private javax.swing.JFormattedTextField tfValorTotal;
    // End of variables declaration//GEN-END:variables
    
}
