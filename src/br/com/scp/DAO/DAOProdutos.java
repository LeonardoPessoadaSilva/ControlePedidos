package br.com.scp.DAO;

import br.com.scp.conexoes.ConnectionFactory;
import br.com.scp.model.Produtos;
import java.util.ArrayList;

public class DAOProdutos extends ConnectionFactory {

    
    public int salvarProdutosDAO(Produtos pModelProdutos){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO produtos ("
                    + "fornecedores_codigo,"
                    + "nome,"
                    + "valor,"
                    + "estoque"
                + ") VALUES ("
                    + "'" + pModelProdutos.getFornecedoresCodigo() + "',"
                    + "'" + pModelProdutos.getNome() + "',"
                    + "'" + pModelProdutos.getValor() + "',"
                    + "'" + pModelProdutos.getEstoque() + "'"
                + ") RETURNING codigo;"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }

   
    public Produtos getProdutosDAO(int pCodigo){
        Produtos modelProdutos = new Produtos();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "codigo,"
                    + "fornecedores_codigo,"
                    + "nome,"
                    + "valor,"
                    + "estoque"
                 + " FROM"
                     + " produtos"
                 + " WHERE"
                     + " codigo = '" + pCodigo + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelProdutos.setCodigo(this.getResultSet().getInt(1));
                modelProdutos.setFornecedoresCodigo(this.getResultSet().getInt(2));
                modelProdutos.setNome(this.getResultSet().getString(3));
                modelProdutos.setValor(this.getResultSet().getDouble(4));
                modelProdutos.setEstoque(this.getResultSet().getInt(5));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelProdutos;
    }
    
   
    public Produtos getProdutosDAO(String pNome){
        Produtos modelProdutos = new Produtos();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "codigo,"
                    + "fornecedores_codigo,"
                    + "nome,"
                    + "valor,"
                    + "estoque"
                 + " FROM"
                     + " produtos"
                 + " WHERE"
                     + " nome = '" + pNome + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelProdutos.setCodigo(this.getResultSet().getInt(1));
                modelProdutos.setFornecedoresCodigo(this.getResultSet().getInt(2));
                modelProdutos.setNome(this.getResultSet().getString(3));
                modelProdutos.setValor(this.getResultSet().getDouble(4));
                modelProdutos.setEstoque(this.getResultSet().getInt(5));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelProdutos;
    }

    
    public ArrayList<Produtos> getListaProdutosDAO(){
        ArrayList<Produtos> listamodelProdutos = new ArrayList();
        Produtos modelProdutos = new Produtos();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "codigo,"
                    + "fornecedores_codigo,"
                    + "nome,"
                    + "valor,"
                    + "estoque"
                 + " FROM"
                     + " produtos"
                + ";"
            );

            while(this.getResultSet().next()){
                modelProdutos = new Produtos();
                modelProdutos.setCodigo(this.getResultSet().getInt(1));
                modelProdutos.setFornecedoresCodigo(this.getResultSet().getInt(2));
                modelProdutos.setNome(this.getResultSet().getString(3));
                modelProdutos.setValor(this.getResultSet().getDouble(4));
                modelProdutos.setEstoque(this.getResultSet().getInt(5));
                listamodelProdutos.add(modelProdutos);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelProdutos;
    }

    
    public boolean atualizarProdutosDAO(Produtos pModelProdutos){
        try {
            this.conectar();
            this.executarUpdateSQL(
                "UPDATE produtos SET "
                    + "codigo = '" + pModelProdutos.getCodigo() + "',"
                    + "fornecedores_codigo = '" + pModelProdutos.getFornecedoresCodigo() + "',"
                    + "nome = '" + pModelProdutos.getNome() + "',"
                    + "valor = '" + pModelProdutos.getValor() + "',"
                    + "estoque = '" + pModelProdutos.getEstoque() + "'"
                + " WHERE "
                    + "codigo = '" + pModelProdutos.getCodigo() + "'"
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
    
   
    public boolean atualizarProdutosQuantidadeDAO(Produtos pModelProdutos){
        try {
            this.conectar();
            System.out.println(pModelProdutos.getListaModelProdutoses().size());
            int sizeLista = pModelProdutos.getListaModelProdutoses().size();
            for (int i = 0; i < sizeLista; i++) {
                this.executarUpdateSQL(
                "UPDATE produtos SET "
                    + "estoque = '" + pModelProdutos.getListaModelProdutoses().get(i).getEstoque() + "'"
                + " WHERE "
                    + "codigo = '" + pModelProdutos.getListaModelProdutoses().get(i).getCodigo() + "'"
                + ";"
            );
            }
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    
    public boolean excluirProdutosDAO(int pCodigo){
        try {
            this.conectar();
            this.executarUpdateSQL(
                "DELETE FROM produtos "
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