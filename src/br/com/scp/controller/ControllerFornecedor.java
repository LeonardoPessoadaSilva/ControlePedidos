package br.com.scp.controller;

import br.com.scp.model.ModelFornecedor;
import br.com.scp.DAO.DAOFornecedor;
import java.util.ArrayList;



public class ControllerFornecedor {

    private DAOFornecedor daoFornecedor = new DAOFornecedor();
    

    
    public int salvarFornecedorController(ModelFornecedor pModelFornecedor){
        return this.daoFornecedor.salvarFornecedorDAO(pModelFornecedor);
    }

    
    public ModelFornecedor getFornecedorController(int pCodigo){
        return this.daoFornecedor.getFornecedorDAO(pCodigo);
    }
    
    
    public ModelFornecedor getFornecedorController(String pNome){
        return this.daoFornecedor.getFornecedorDAO(pNome);
    }

    
    public ArrayList<ModelFornecedor> getListaFornecedorController(){
        return this.daoFornecedor.getListaFornecedorDAO();
    }

    
    public boolean atualizarFornecedorController(ModelFornecedor pModelFornecedor){
        return this.daoFornecedor.atualizarFornecedorDAO(pModelFornecedor);
    }

    
    public boolean excluirFornecedorController(int pCodigo){
        return this.daoFornecedor.excluirFornecedorDAO(pCodigo);
    }

    
}