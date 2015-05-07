package br.com.scp.controller;

import br.com.scp.model.ModelPedidos;
import br.com.scp.DAO.DAOPedidos;
import java.util.ArrayList;



public class ControllerPedidos {

    private DAOPedidos daoVendas = new DAOPedidos();
    

    
    public int salvarVendasController(ModelPedidos pModelVendas){
        return this.daoVendas.salvarVendasDAO(pModelVendas);
    }

    
    public ModelPedidos getVendasController(int pCodigo){
        return this.daoVendas.getVendasDAO(pCodigo);
    }

   
    public ArrayList<ModelPedidos> getListaVendasController(){
        return this.daoVendas.getListaVendasDAO();
    }

    
    public ArrayList<ModelPedidos> getListaVendasController(int pCodigo){
        return this.daoVendas.getListaVendasDAO(pCodigo);
    }
    
    
    public boolean atualizarVendasController(ModelPedidos pModelVendas){
        return this.daoVendas.atualizarVendasDAO(pModelVendas);
    }

    
    public boolean excluirVendasController(int pCodigo){
        return this.daoVendas.excluirVendasDAO(pCodigo);
    }

    public boolean salvarVendasProdutosController(ModelPedidos modelVendas) {
        return this.daoVendas.salvarProdutosVendasDAO(modelVendas);
    }

   
}