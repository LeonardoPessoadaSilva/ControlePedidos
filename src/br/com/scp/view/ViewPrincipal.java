package br.com.scp.view;

import br.com.scp.facade.ControllerCliente;
import br.com.scp.facade.ControllerFornecedor;
import br.com.scp.facade.ControllerProdutos;
import javax.swing.JOptionPane;


public class ViewPrincipal extends javax.swing.JFrame {

    
    public ViewPrincipal() {
        initComponents();
        setExtendedState(this.MAXIMIZED_BOTH); 
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        uJPanelImagem1 = new componentes.UJPanelImagem();
        jpMenuRapido = new javax.swing.JPanel();
        btClientes = new javax.swing.JButton();
        btProdutos = new javax.swing.JButton();
        btFornecedores = new javax.swing.JButton();
        btConsultarVenda = new javax.swing.JButton();
        btRegistrarVenda = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmArquivo = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JSeparator();
        mnuSair = new javax.swing.JMenuItem();
        jmCadastrar = new javax.swing.JMenu();
        jmiClientes = new javax.swing.JMenuItem();
        jmiProdutos = new javax.swing.JMenuItem();
        jmiFornecedor = new javax.swing.JMenuItem();
        jmVendas = new javax.swing.JMenu();
        mnuRegistrarVenda = new javax.swing.JMenuItem();
        jmiConsultarVenda = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jmiRelClientes = new javax.swing.JMenuItem();
        jmiRelFornecedor = new javax.swing.JMenuItem();
        jmiRelProdutos = new javax.swing.JMenuItem();
        jmAjuda = new javax.swing.JMenu();

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("jMenu4");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SCPedidos");

        uJPanelImagem1.setBackground(new java.awt.Color(51, 51, 51));
        uJPanelImagem1.setImagem(new java.io.File("C:\\Users\\Leonardo\\Documents\\NetBeansProjects\\ControlePedidos\\src\\br\\com\\scp\\imagens\\imagem-de-fundo.jpg"));

        jpMenuRapido.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menu rápido", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        btClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/24x24/Male.png"))); // NOI18N
        btClientes.setText("Clientes");
        btClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClientesActionPerformed(evt);
            }
        });

        btProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/24x24/Modify.png"))); // NOI18N
        btProdutos.setText("Produtos");
        btProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProdutosActionPerformed(evt);
            }
        });

        btFornecedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/24x24/Home.png"))); // NOI18N
        btFornecedores.setText("Fornecedores");
        btFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFornecedoresActionPerformed(evt);
            }
        });

        btConsultarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/24x24/Zoom.png"))); // NOI18N
        btConsultarVenda.setText("Consultar Pedidos");
        btConsultarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarVendaActionPerformed(evt);
            }
        });

        btRegistrarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/24x24/Dollar.png"))); // NOI18N
        btRegistrarVenda.setText("Registrar Pedido");
        btRegistrarVenda.setActionCommand("RegistrarPedido");
        btRegistrarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegistrarVendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpMenuRapidoLayout = new javax.swing.GroupLayout(jpMenuRapido);
        jpMenuRapido.setLayout(jpMenuRapidoLayout);
        jpMenuRapidoLayout.setHorizontalGroup(
            jpMenuRapidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuRapidoLayout.createSequentialGroup()
                .addComponent(btClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btFornecedores, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btRegistrarVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btConsultarVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );
        jpMenuRapidoLayout.setVerticalGroup(
            jpMenuRapidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuRapidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                .addComponent(btRegistrarVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btConsultarVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btFornecedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout uJPanelImagem1Layout = new javax.swing.GroupLayout(uJPanelImagem1);
        uJPanelImagem1.setLayout(uJPanelImagem1Layout);
        uJPanelImagem1Layout.setHorizontalGroup(
            uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMenuRapido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        uJPanelImagem1Layout.setVerticalGroup(
            uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                .addComponent(jpMenuRapido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 336, Short.MAX_VALUE))
        );

        jpMenuRapido.getAccessibleContext().setAccessibleName("Atalhos");

        jmArquivo.setText("Arquivo");
        jmArquivo.add(jSeparator1);

        mnuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        mnuSair.setText("Sair");
        mnuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSairActionPerformed(evt);
            }
        });
        jmArquivo.add(mnuSair);

        jMenuBar1.add(jmArquivo);

        jmCadastrar.setText("Cadastros");

        jmiClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jmiClientes.setText("Clientes");
        jmiClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiClientesActionPerformed(evt);
            }
        });
        jmCadastrar.add(jmiClientes);

        jmiProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        jmiProdutos.setText("Produtos");
        jmiProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiProdutosActionPerformed(evt);
            }
        });
        jmCadastrar.add(jmiProdutos);

        jmiFornecedor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK));
        jmiFornecedor.setText("Fornecedores");
        jmiFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFornecedorActionPerformed(evt);
            }
        });
        jmCadastrar.add(jmiFornecedor);

        jMenuBar1.add(jmCadastrar);

        jmVendas.setText("Pedidos");

        mnuRegistrarVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK));
        mnuRegistrarVenda.setText("Pedidos");
        mnuRegistrarVenda.setToolTipText("");
        mnuRegistrarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRegistrarVendaActionPerformed(evt);
            }
        });
        jmVendas.add(mnuRegistrarVenda);

        jmiConsultarVenda.setText("Consultar Pedidos");
        jmiConsultarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConsultarVendaActionPerformed(evt);
            }
        });
        jmVendas.add(jmiConsultarVenda);

        jMenuBar1.add(jmVendas);

        jMenu1.setText("Relatórios");

        jmiRelClientes.setText("Clientes");
        jmiRelClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRelClientesActionPerformed(evt);
            }
        });
        jMenu1.add(jmiRelClientes);

        jmiRelFornecedor.setText("Fornecedores");
        jmiRelFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRelFornecedorActionPerformed(evt);
            }
        });
        jMenu1.add(jmiRelFornecedor);

        jmiRelProdutos.setText("Produtos");
        jmiRelProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRelProdutosActionPerformed(evt);
            }
        });
        jMenu1.add(jmiRelProdutos);

        jMenuBar1.add(jMenu1);

        jmAjuda.setText("Ajuda");
        jMenuBar1.add(jmAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(uJPanelImagem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(uJPanelImagem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuSairActionPerformed

    private void jmiClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiClientesActionPerformed
        new ViewClientes().setVisible(true);
    }//GEN-LAST:event_jmiClientesActionPerformed

    private void jmiProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiProdutosActionPerformed
        new ViewProduto().setVisible(true);
    }//GEN-LAST:event_jmiProdutosActionPerformed

    private void jmiFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFornecedorActionPerformed
        new ViewFornecedor().setVisible(true);
    }//GEN-LAST:event_jmiFornecedorActionPerformed

    private void mnuRegistrarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRegistrarVendaActionPerformed
        new ViewPedido().setVisible(true);
    }//GEN-LAST:event_mnuRegistrarVendaActionPerformed

    private void jmiConsultarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConsultarVendaActionPerformed
        ViewPedido venda = new ViewPedido();
        venda.setViewConsultarPedidos();
        venda.setVisible(true);
    }//GEN-LAST:event_jmiConsultarVendaActionPerformed

    private void btRegistrarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegistrarVendaActionPerformed
       new ViewPedido().setVisible(true);   
    }//GEN-LAST:event_btRegistrarVendaActionPerformed

    private void btConsultarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarVendaActionPerformed
      
    }//GEN-LAST:event_btConsultarVendaActionPerformed

    private void btFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFornecedoresActionPerformed
        new ViewFornecedor().setVisible(true);
    }//GEN-LAST:event_btFornecedoresActionPerformed

    private void btProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProdutosActionPerformed
        new ViewProduto().setVisible(true);
    }//GEN-LAST:event_btProdutosActionPerformed

    private void btClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClientesActionPerformed
        new ViewClientes().setVisible(true);
    }//GEN-LAST:event_btClientesActionPerformed

    private void jmiRelClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRelClientesActionPerformed
        ControllerCliente controllerCliente = new ControllerCliente();
        controllerCliente.gerarRelatorioCliente();       
    }//GEN-LAST:event_jmiRelClientesActionPerformed

    private void jmiRelFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRelFornecedorActionPerformed
        ControllerFornecedor controllerFornecedor = new ControllerFornecedor();
        controllerFornecedor.gerarRelatorioFornecedor();
    }//GEN-LAST:event_jmiRelFornecedorActionPerformed

    private void jmiRelProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRelProdutosActionPerformed
         ControllerProdutos controllerProdutos = new ControllerProdutos();
         controllerProdutos.gerarRelatorioProdutos();
    }//GEN-LAST:event_jmiRelProdutosActionPerformed

   
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btClientes;
    private javax.swing.JButton btConsultarVenda;
    private javax.swing.JButton btFornecedores;
    private javax.swing.JButton btProdutos;
    private javax.swing.JButton btRegistrarVenda;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenu jmAjuda;
    private javax.swing.JMenu jmArquivo;
    private javax.swing.JMenu jmCadastrar;
    private javax.swing.JMenu jmVendas;
    private javax.swing.JMenuItem jmiClientes;
    private javax.swing.JMenuItem jmiConsultarVenda;
    private javax.swing.JMenuItem jmiFornecedor;
    private javax.swing.JMenuItem jmiProdutos;
    private javax.swing.JMenuItem jmiRelClientes;
    private javax.swing.JMenuItem jmiRelFornecedor;
    private javax.swing.JMenuItem jmiRelProdutos;
    private javax.swing.JPanel jpMenuRapido;
    private javax.swing.JMenuItem mnuRegistrarVenda;
    private javax.swing.JMenuItem mnuSair;
    private componentes.UJPanelImagem uJPanelImagem1;
    // End of variables declaration//GEN-END:variables
}
