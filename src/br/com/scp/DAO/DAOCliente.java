package br.com.scp.DAO;

import br.com.scp.conexoes.ConnectionFactory;
import br.com.scp.model.ModelCliente;
import java.util.ArrayList;

public class DAOCliente extends ConnectionFactory {

   
    public int salvarClienteDAO(ModelCliente pModelCliente){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO clientes ("
                    + "nome,"
                    + "endereco,"
                    + "bairro,"
                    + "cidade,"
                    + "uf,"
                    + "cep,"
                    + "telefone"
                + ") VALUES ("
                    + "'" + pModelCliente.getNome() + "',"
                    + "'" + pModelCliente.getEndereco() + "',"
                    + "'" + pModelCliente.getBairro() + "',"
                    + "'" + pModelCliente.getCidade() + "',"
                    + "'" + pModelCliente.getUf() + "',"
                    + "'" + pModelCliente.getCep() + "',"
                    + "'" + pModelCliente.getTelefone() + "'"
                + ") RETURNING codigo;"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }

    
    public ModelCliente getClienteDAO(int pCodigo){
        ModelCliente modelCliente = new ModelCliente();
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
                     + " clientes"
                 + " WHERE"
                     + " codigo = '" + pCodigo + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCliente.setCodigo(this.getResultSet().getInt(1));
                modelCliente.setNome(this.getResultSet().getString(2));
                modelCliente.setEndereco(this.getResultSet().getString(3));
                modelCliente.setBairro(this.getResultSet().getString(4));
                modelCliente.setCidade(this.getResultSet().getString(5));
                modelCliente.setUf(this.getResultSet().getString(6));
                modelCliente.setCep(this.getResultSet().getString(7));
                modelCliente.setTelefone(this.getResultSet().getString(8));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelCliente;
    }
    
   
    public ModelCliente getClienteDAO(String pNome){
        ModelCliente modelCliente = new ModelCliente();
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
                     + " clientes"
                 + " WHERE"
                     + " nome = '" + pNome + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCliente.setCodigo(this.getResultSet().getInt(1));
                modelCliente.setNome(this.getResultSet().getString(2));
                modelCliente.setEndereco(this.getResultSet().getString(3));
                modelCliente.setBairro(this.getResultSet().getString(4));
                modelCliente.setCidade(this.getResultSet().getString(5));
                modelCliente.setUf(this.getResultSet().getString(6));
                modelCliente.setCep(this.getResultSet().getString(7));
                modelCliente.setTelefone(this.getResultSet().getString(8));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelCliente;
    }


   
    public ArrayList<ModelCliente> getListaClienteDAO(){
        ArrayList<ModelCliente> listamodelCliente = new ArrayList();
        ModelCliente modelCliente = new ModelCliente();
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
                     + " clientes"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCliente = new ModelCliente();
                modelCliente.setCodigo(this.getResultSet().getInt(1));
                modelCliente.setNome(this.getResultSet().getString(2));
                modelCliente.setEndereco(this.getResultSet().getString(3));
                modelCliente.setBairro(this.getResultSet().getString(4));
                modelCliente.setCidade(this.getResultSet().getString(5));
                modelCliente.setUf(this.getResultSet().getString(6));
                modelCliente.setCep(this.getResultSet().getString(7));
                modelCliente.setTelefone(this.getResultSet().getString(8));
                listamodelCliente.add(modelCliente);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelCliente;
    }

    
    public boolean atualizarClienteDAO(ModelCliente pModelCliente){
        try {
            this.conectar();
            this.executarUpdateSQL(
                "UPDATE clientes SET "
                    + "codigo = '" + pModelCliente.getCodigo() + "',"
                    + "nome = '" + pModelCliente.getNome() + "',"
                    + "endereco = '" + pModelCliente.getEndereco() + "',"
                    + "bairro = '" + pModelCliente.getBairro() + "',"
                    + "cidade = '" + pModelCliente.getCidade() + "',"
                    + "uf = '" + pModelCliente.getUf() + "',"
                    + "cep = '" + pModelCliente.getCep() + "',"
                    + "telefone = '" + pModelCliente.getTelefone() + "'"
                + " WHERE "
                    + "codigo = '" + pModelCliente.getCodigo() + "'"
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

   
    public boolean excluirClienteDAO(int pCodigo){
        try {
            this.conectar();
            this.executarUpdateSQL(
                "DELETE FROM clientes "
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