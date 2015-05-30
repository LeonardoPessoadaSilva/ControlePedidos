package br.com.scp.DAO;

import br.com.scp.conexoes.ConnectionFactory;
import br.com.scp.model.Pedidos;
import java.util.ArrayList;

public class DAOPedidos extends ConnectionFactory {

    public int salvarPedidosDAO(Pedidos pModelPedidos) {
        try {
            this.conectar();
                return this.insertSQL("INSERT INTO pedidos ("
                    + "clientes_codigo,"
                    + "data_pedido,"
                    + "valor_total,"
                    + "desconto "
                    + ") VALUES ("
                    + "'" + pModelPedidos.getClientesCodigo() + "',"
                    + "'" + pModelPedidos.getDataPedido() + "',"
                    + "'" + pModelPedidos.getValorTotal() + "',"
                    + "'" + pModelPedidos.getDesconto() + "'"
                    + ")RETURNING codigo;"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    
   
    public boolean salvarProdutosPedidosDAO(Pedidos pModelPedidos) {
        try {
            this.conectar();
            int sizeLista = pModelPedidos.getListamModelPedidoses().size();
            for (int i = 0; i < sizeLista; i++) {
                this.insertSQL("insert into PEDIDOS_PRODUTO "
                        + "( "
                        + "CODIGO_PRODUTO"
                        + ", CODIGO_PEDIDO "
                        + ", QUANTIDADE) "
                        + " VALUES ("
                        + "'" + pModelPedidos.getListamModelPedidoses().get(i).getProdutosCodigo() + "',"
                        + "'" + pModelPedidos.getCodigo()+ "',"
                        + "'" + pModelPedidos.getListamModelPedidoses().get(i).getQuantidade() + "'"
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
    
    
    public Pedidos getPedidosDAO(int pCodigo){
        Pedidos modelPedidos = new Pedidos();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "codigo,"
                    + "valor_total,"
                    + "clientes_codigo,"
                    + "data_pedido,"
                    + "desconto"
                 + " FROM"
                     + " pedidos"
                 + " WHERE"
                     + " codigo = '" + pCodigo + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelPedidos.setCodigo(this.getResultSet().getInt(1));
                modelPedidos.setValorTotal(this.getResultSet().getFloat(2));
                modelPedidos.setClientesCodigo(this.getResultSet().getInt(3));
                modelPedidos.setDataPedido(this.getResultSet().getDate(4));
                modelPedidos.setDesconto(this.getResultSet().getFloat(5));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelPedidos;
    }

   
    public ArrayList<Pedidos> getListaPedidosDAO(){
        ArrayList<Pedidos> listamodelPedidos = new ArrayList();
        Pedidos modelPedidos = new Pedidos();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "codigo,"
                    + "clientes_codigo,"
                    + "data_pedido "
                 + " FROM"
                     + " pedidos"
                + ";"
            );

            while(this.getResultSet().next()){
                modelPedidos = new Pedidos();
                modelPedidos.setCodigo(this.getResultSet().getInt(1));
                modelPedidos.setClientesCodigo(this.getResultSet().getInt(2));
                modelPedidos.setDataPedido(this.getResultSet().getDate(3));
                listamodelPedidos.add(modelPedidos);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelPedidos;
    }
    
    /**
    * recupera uma lista de Vendas
        * return ArrayList
    */
    public ArrayList<Pedidos> getListaPedidosDAO(int pCodigo){
        ArrayList<Pedidos> listamodelPedidos = new ArrayList();
        Pedidos modelPedidos = new Pedidos();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "codigo_produto,"
                    + "codigo_pedido,"
                    + "quantidade "
                    + " FROM"
                    + " pedidos_produto WHERE codigo_pedido = '" + pCodigo + "'"
                    + ";"
            );

            while(this.getResultSet().next()){
                modelPedidos = new Pedidos();
                modelPedidos.setProdutosCodigo(this.getResultSet().getInt(1));
                modelPedidos.setCodigo(this.getResultSet().getInt(2));
                modelPedidos.setQuantidade(this.getResultSet().getInt(3));
                listamodelPedidos.add(modelPedidos);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelPedidos;
    }

    
    public boolean atualizarPedidosDAO(Pedidos pModelPedidos){
        try {
            this.conectar();
            this.executarUpdateSQL("UPDATE PEDIDOS SET "
                    + "codigo = '" + pModelPedidos.getCodigo() + "',"
                    + "valor_total = '" + pModelPedidos.getValorTotal()+ "',"
                    + "clientes_codigo = '" + pModelPedidos.getClientesCodigo() + "',"
                    + "data_pedido = '" + pModelPedidos.getDataPedido() + "',"
                    + "desconto = '" + pModelPedidos.getDesconto()+ "'"
                + " WHERE "
                    + "codigo = '" + pModelPedidos.getCodigo() + "'"
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

    
    public boolean excluirPedidosDAO(int pCodigo){
        try {
            this.conectar();
            this.executarUpdateSQL(
                "DELETE FROM PEDIDOS "
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