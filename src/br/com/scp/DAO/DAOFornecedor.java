package br.com.scp.DAO;

import br.com.scp.conexoes.ConnectionFactory;
import br.com.scp.model.Fornecedor;
import java.util.ArrayList;

public class DAOFornecedor extends ConnectionFactory {

    
    public int salvarFornecedorDAO(Fornecedor pModelFornecedor){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO fornecedores ("
                    + "nome,"
                    + "endereco,"
                    + "bairro,"
                    + "cidade,"
                    + "uf,"
                    + "cep,"
                    + "telefone"
                + ") VALUES ("
                    + "'" + pModelFornecedor.getNome() + "',"
                    + "'" + pModelFornecedor.getEndereco() + "',"
                    + "'" + pModelFornecedor.getBairro() + "',"
                    + "'" + pModelFornecedor.getCidade() + "',"
                    + "'" + pModelFornecedor.getUf() + "',"
                    + "'" + pModelFornecedor.getCep() + "',"
                    + "'" + pModelFornecedor.getTelefone() + "'"
                + ") RETURNING codigo;"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }

   
    public Fornecedor getFornecedorDAO(int pCodigo){
        Fornecedor modelFornecedor = new Fornecedor();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "codigo,"
                    + "nome,"
                    + "endereco,"
                    + "bairro,"
                    + "cidade,"
                    + "uf,"
                    + "cep,"
                    + "telefone"
                 + " FROM"
                     + " fornecedores"
                 + " WHERE"
                     + " codigo = '" + pCodigo + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelFornecedor.setCodigo(this.getResultSet().getInt(1));
                modelFornecedor.setNome(this.getResultSet().getString(2));
                modelFornecedor.setEndereco(this.getResultSet().getString(3));
                modelFornecedor.setBairro(this.getResultSet().getString(4));
                modelFornecedor.setCidade(this.getResultSet().getString(5));
                modelFornecedor.setUf(this.getResultSet().getString(6));
                modelFornecedor.setCep(this.getResultSet().getString(7));
                modelFornecedor.setTelefone(this.getResultSet().getString(8));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelFornecedor;
    }
    
    
    public Fornecedor getFornecedorDAO(String pNome){
        Fornecedor modelFornecedor = new Fornecedor();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "codigo,"
                    + "nome,"
                    + "endereco,"
                    + "bairro,"
                    + "cidade,"
                    + "uf,"
                    + "cep,"
                    + "telefone"
                 + " FROM"
                     + " fornecedores"
                 + " WHERE"
                     + " nome = '" + pNome + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelFornecedor.setCodigo(this.getResultSet().getInt(1));
                modelFornecedor.setNome(this.getResultSet().getString(2));
                modelFornecedor.setEndereco(this.getResultSet().getString(3));
                modelFornecedor.setBairro(this.getResultSet().getString(4));
                modelFornecedor.setCidade(this.getResultSet().getString(5));
                modelFornecedor.setUf(this.getResultSet().getString(6));
                modelFornecedor.setCep(this.getResultSet().getString(7));
                modelFornecedor.setTelefone(this.getResultSet().getString(8));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelFornecedor;
    }

    
    public ArrayList<Fornecedor> getListaFornecedorDAO(){
        ArrayList<Fornecedor> listamodelFornecedor = new ArrayList();
        Fornecedor modelFornecedor = new Fornecedor();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "codigo,"
                    + "nome,"
                    + "endereco,"
                    + "bairro,"
                    + "cidade,"
                    + "uf,"
                    + "cep,"
                    + "telefone"
                 + " FROM"
                     + " fornecedores"
                + ";"
            );

            while(this.getResultSet().next()){
                modelFornecedor = new Fornecedor();
                modelFornecedor.setCodigo(this.getResultSet().getInt(1));
                modelFornecedor.setNome(this.getResultSet().getString(2));
                modelFornecedor.setEndereco(this.getResultSet().getString(3));
                modelFornecedor.setBairro(this.getResultSet().getString(4));
                modelFornecedor.setCidade(this.getResultSet().getString(5));
                modelFornecedor.setUf(this.getResultSet().getString(6));
                modelFornecedor.setCep(this.getResultSet().getString(7));
                modelFornecedor.setTelefone(this.getResultSet().getString(8));
                listamodelFornecedor.add(modelFornecedor);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelFornecedor;
    }

    
    public boolean atualizarFornecedorDAO(Fornecedor pModelFornecedor){
        try {
            this.conectar();
            this.executarUpdateSQL(
                    "UPDATE fornecedores SET "
                    + "codigo = '" + pModelFornecedor.getCodigo() + "',"
                    + "nome = '" + pModelFornecedor.getNome() + "',"
                    + "endereco = '" + pModelFornecedor.getEndereco() + "',"
                    + "bairro = '" + pModelFornecedor.getBairro() + "',"
                    + "cidade = '" + pModelFornecedor.getCidade() + "',"
                    + "uf = '" + pModelFornecedor.getUf() + "',"
                    + "cep = '" + pModelFornecedor.getCep() + "',"
                    + "telefone = '" + pModelFornecedor.getTelefone() + "'"
                + " WHERE "
                    + "codigo = '" + pModelFornecedor.getCodigo() + "'"
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

    
    public boolean excluirFornecedorDAO(int pCodigo){
        try {
            this.conectar();
            this.executarUpdateSQL(
                "DELETE FROM fornecedores "
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