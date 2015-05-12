package br.com.scp.DAO;

import br.com.scp.conexoes.ConnectionFactory;
import br.com.scp.model.Pedidos;
import java.util.ArrayList;

public class DAOPedidos extends ConnectionFactory {

    
    public int salvarVendasDAO(Pedidos pModelVendas) {
        try {
            this.conectar();
                return this.insertSQL(
                    "INSERT INTO vendas ("
                    + "clientes_codigo,"
                    + "data_venda,"
                    + "valor_total,"
                    + "desconto "
                    + ") VALUES ("
                    + "'" + pModelVendas.getClientesCodigo() + "',"
                    + "'" + pModelVendas.getDataVenda() + "',"
                    + "'" + pModelVendas.getValorTotal() + "',"
                    + "'" + pModelVendas.getDesconto() + "'"
                    + ")RETURNING codigo;"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    
   
    public boolean salvarProdutosVendasDAO(Pedidos pModelVendas) {
        try {
            this.conectar();
            int sizeLista = pModelVendas.getListamModelVendases().size();
            for (int i = 0; i < sizeLista; i++) {
                this.insertSQL(
                        "insert into VENDAS_PRODUTO "
                        + "( "
                        + "CODIGO_PRODUTO"
                        + ", CODIGO_VENDA "
                        + ", QUANTIDADE) "
                        + " VALUES ("
                        + "'" + pModelVendas.getListamModelVendases().get(i).getProdutosCodigo() + "',"
                        + "'" + pModelVendas.getCodigo()+ "',"
                        + "'" + pModelVendas.getListamModelVendases().get(i).getQuantidade() + "'"
                        + ") RETURNING codigo;"
                );
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
    
   
    public Pedidos getVendasDAO(int pCodigo){
        Pedidos modelVendas = new Pedidos();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "codigo,"
                    + "valor_total,"
                    + "clientes_codigo,"
                    + "data_venda,"
                    + "desconto"
                 + " FROM"
                     + " vendas"
                 + " WHERE"
                     + " codigo = '" + pCodigo + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVendas.setCodigo(this.getResultSet().getInt(1));
                modelVendas.setValorTotal(this.getResultSet().getFloat(2));
                modelVendas.setClientesCodigo(this.getResultSet().getInt(3));
                modelVendas.setDataVenda(this.getResultSet().getDate(4));
                modelVendas.setDesconto(this.getResultSet().getFloat(5));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelVendas;
    }

    
    public ArrayList<Pedidos> getListaVendasDAO(){
        ArrayList<Pedidos> listamodelVendas = new ArrayList();
        Pedidos modelVendas = new Pedidos();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "codigo,"
                    + "clientes_codigo,"
                    + "data_venda "
                 + " FROM"
                     + " vendas"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVendas = new Pedidos();
                modelVendas.setCodigo(this.getResultSet().getInt(1));
                modelVendas.setClientesCodigo(this.getResultSet().getInt(2));
                modelVendas.setDataVenda(this.getResultSet().getDate(3));
                listamodelVendas.add(modelVendas);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelVendas;
    }
    
   
    public ArrayList<Pedidos> getListaVendasDAO(int pCodigo){
        ArrayList<Pedidos> listamodelVendas = new ArrayList();
        Pedidos modelVendas = new Pedidos();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "codigo_produto,"
                    + "codigo_venda,"
                    + "quantidade "
                    + " FROM"
                    + " vendas_produto WHERE codigo_venda = '" + pCodigo + "'"
                    + ";"
            );

            while(this.getResultSet().next()){
                modelVendas = new Pedidos();
                modelVendas.setProdutosCodigo(this.getResultSet().getInt(1));
                modelVendas.setCodigo(this.getResultSet().getInt(2));
                modelVendas.setQuantidade(this.getResultSet().getInt(3));
                listamodelVendas.add(modelVendas);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelVendas;
    }

   
    public boolean atualizarVendasDAO(Pedidos pModelVendas){
        try {
            this.conectar();
            this.executarUpdateSQL(
                "UPDATE vendas SET "
                    + "codigo = '" + pModelVendas.getCodigo() + "',"
                    + "valor_total = '" + pModelVendas.getValorTotal()+ "',"
                    + "clientes_codigo = '" + pModelVendas.getClientesCodigo() + "',"
                    + "data_venda = '" + pModelVendas.getDataVenda() + "',"
                    + "desconto = '" + pModelVendas.getDesconto()+ "'"
                + " WHERE "
                    + "codigo = '" + pModelVendas.getCodigo() + "'"
                + ";"
            );
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

   
    public boolean excluirVendasDAO(int pCodigo){
        try {
            this.conectar();
            this.executarUpdateSQL(
                "DELETE FROM vendas "
                + " WHERE "
                    + "codigo = '" + pCodigo + "'"
                + ";"
            );
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
}