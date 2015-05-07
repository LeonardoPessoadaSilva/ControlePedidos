package br.com.scp.controller;

import br.com.scp.model.ModelCliente;
import br.com.scp.DAO.DAOCliente;
import java.util.ArrayList;



public class ControllerCliente {

    private DAOCliente daoCliente = new DAOCliente();
    

    
    public int salvarClienteController(ModelCliente pModelCliente){
        return this.daoCliente.salvarClienteDAO(pModelCliente);
    }

   
    public ModelCliente getClienteController(int pCodigo){
        return this.daoCliente.getClienteDAO(pCodigo);
    }
    
    
    public ModelCliente getClienteController(String pNome){
        return this.daoCliente.getClienteDAO(pNome);
    }

    
    public ArrayList<ModelCliente> getListaClienteController(){
        return this.daoCliente.getListaClienteDAO();
    }

    
    public boolean atualizarClienteController(ModelCliente pModelCliente){
        return this.daoCliente.atualizarClienteDAO(pModelCliente);
    }

    
    public boolean excluirClienteController(int pCodigo){
        return this.daoCliente.excluirClienteDAO(pCodigo);
    }

   
}