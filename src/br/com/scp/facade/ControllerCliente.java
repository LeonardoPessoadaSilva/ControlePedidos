package br.com.scp.facade;

import br.com.scp.model.Cliente;
import br.com.scp.DAO.DAOCliente;
import br.com.scp.relatorios.DAORelatorios;
import java.util.ArrayList;



public class ControllerCliente {

    private DAOCliente daoCliente = new DAOCliente();
    private DAORelatorios dAORelatorios = new DAORelatorios();
    
    
    public int salvarClienteController(Cliente pModelCliente){
        return this.daoCliente.salvarClienteDAO(pModelCliente);
    }

   
    public Cliente getClienteController(int pCodigo){
        return this.daoCliente.getClienteDAO(pCodigo);
    }
    
    
    public Cliente getClienteController(String pNome){
        return this.daoCliente.getClienteDAO(pNome);
    }

    
    public ArrayList<Cliente> getListaClienteController(){
        return this.daoCliente.getListaClienteDAO();
    }

    
    public boolean atualizarClienteController(Cliente pModelCliente){
        return this.daoCliente.atualizarClienteDAO(pModelCliente);
    }

    
    public boolean excluirClienteController(int pCodigo){
        return this.daoCliente.excluirClienteDAO(pCodigo);
    }
     public boolean gerarRelatorioCliente() {
        return this.dAORelatorios.gerarRelatorioCliente();
    }

 }