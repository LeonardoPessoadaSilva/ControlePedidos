package br.com.scp.relatorios;

import br.com.scp.conexoes.ConnectionFactory;
import java.awt.Desktop;
import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;


public class DAORelatorios extends ConnectionFactory{
    
    
    public boolean gerarRelatorioCliente() {
        try {
              this.conectar();
              this.executarSQL("SELECT * FROM clientes;");
              JRResultSetDataSource jrRS = new JRResultSetDataSource(getResultSet());
             
            InputStream caminhoRelatorio = this.getClass().getClassLoader().getResourceAsStream("ArquivosJasper/relatorioClientes.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(caminhoRelatorio, new HashMap(), jrRS);

            String nomeArquivo = "C:/controledepedidos/temp/rel.pdf";
            JasperExportManager.exportReportToPdfFile(jasperPrint, nomeArquivo);
            File file = new File(nomeArquivo);
            try {
                Desktop.getDesktop().open(file);
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e);
            }
            file.deleteOnExit();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }
            return true;
    }

    public boolean gerarRelatorioProdutos() {
        try {
              this.conectar();
              this.executarSQL("SELECT * FROM produtos;");
              JRResultSetDataSource jrRS = new JRResultSetDataSource(getResultSet());
            // caminho do arquivo dentro dos pacotes  
            InputStream caminhoRelatorio = this.getClass().getClassLoader().getResourceAsStream("ArquivosJasper/relatorioProdutos.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(caminhoRelatorio, new HashMap(), jrRS);

            String nomeArquivo = "C:/controledepedidos/temp/rel.pdf";
            JasperExportManager.exportReportToPdfFile(jasperPrint, nomeArquivo);
            File file = new File(nomeArquivo);
            try {
                Desktop.getDesktop().open(file);
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e);
            }
            file.deleteOnExit();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }
            return true;
    }
    public boolean gerarRelatorioFornecedores() {
        try {
              this.conectar();
              this.executarSQL("SELECT * FROM fornecedores;");
              JRResultSetDataSource jrRS = new JRResultSetDataSource(getResultSet());
            // caminho do arquivo dentro dos pacotes  
            InputStream caminhoRelatorio = this.getClass().getClassLoader().getResourceAsStream("ArquivosJasper/relatorioFornecedores.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(caminhoRelatorio, new HashMap(), jrRS);

            String nomeArquivo = "C:/controledepedidos/temp/rel.pdf";
            JasperExportManager.exportReportToPdfFile(jasperPrint, nomeArquivo);
            File file = new File(nomeArquivo);
            try {
                Desktop.getDesktop().open(file);
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e);
            }
            file.deleteOnExit();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }
            return true;
    }

    public boolean gerarRelatorioPedido(int pCodigo) {
        try {
            this.conectar();
            this.executarSQL("select PEDIDOS.CODIGO as PEDIDOSCODIGO\n"
                    + "     , PEDIDOS.CLIENTES_CODIGO as PEDIDOSCLIENTES_CODIGO\n"
                    + "     , PEDIDOS.DATA_PEDIDO as PEDIDOSDATA_VENDA\n"
                    + "     , PEDIDOS.VALOR_TOTAL as PEDIDOSVALOR_TOTAL\n"
                    + "     , PEDIDOS.DESCONTO as PEDIDOSDESCONTO\n"
                    + "     , PEDIDOS_PRODUTO.CODIGO as PEDIDOS_PRODUTOCODIGO\n"
                    + "     , PEDIDOS_PRODUTO.CODIGO_PRODUTO as PEDIDOS_PRODUTOCODIGO_PRODUTO\n"
                    + "     , PEDIDOS_PRODUTO.CODIGO_PEDIDO as PEDIDOS_PRODUTOCODIGO_PEDIDO\n"
                    + "     , PEDIDOS_PRODUTO.QUANTIDADE as PEDIDOS_PRODUTOQUANTIDADE\n"
                    + "     , PRODUTOS.CODIGO as PRODUTOSCODIGO\n"
                    + "     , PRODUTOS.NOME as PRODUTOSNOME\n"
                    + "     , PRODUTOS.VALOR as PRODUTOSVALOR\n"
                    + "     , CLIENTES.CODIGO as CLIENTESCODIGO\n"
                    + "     , CLIENTES.NOME as CLIENTESNOME\n"
                    + "     , CLIENTES.ENDERECO as CLIENTESENDERECO\n"
                    + "     , CLIENTES.BAIRRO as CLIENTESBAIRRO\n"
                    + "     , CLIENTES.CIDADE as CLIENTESCIDADE\n"
                    + "     , CLIENTES.UF as CLIENTESUF\n"
                    + "     , CLIENTES.CEP as CLIENTESCEP\n"
                    + "     , CLIENTES.TELEFONE as CLIENTESTELEFONE\n"
                    + "from PEDIDOS inner join PEDIDOS_PRODUTO on PEDIDOS.CODIGO = PEDIDOS_PRODUTO.CODIGO_VENDA\n"
                    + "inner join CLIENTES on VENDAS.CLIENTES_CODIGO = CLIENTES.CODIGO\n"
                    + "inner join PRODUTOS on PEDIDOS_PRODUTO.CODIGO_PRODUTO = PRODUTOS.CODIGO where PEDIDOS.CODIGO = '" + pCodigo + "'");
              JRResultSetDataSource jrRS = new JRResultSetDataSource(getResultSet());
            // caminho do arquivo dentro dos pacotes  
            InputStream caminhoRelatorio = this.getClass().getClassLoader().getResourceAsStream("ArquivosJasper/relatorioPedidos.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(caminhoRelatorio, new HashMap(), jrRS);

            String nomeArquivo = "C:/controledepedidos/temp/rel.pdf";
            JasperExportManager.exportReportToPdfFile(jasperPrint, nomeArquivo);
            File file = new File(nomeArquivo);
            try {
                Desktop.getDesktop().open(file);
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e);
            }
            file.deleteOnExit();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }
            return true;
    }

    
}
