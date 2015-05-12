package br.com.scp.facade;

import br.com.scp.model.Pedidos;
import br.com.scp.DAO.DAOPedidos;
import java.util.ArrayList;



public class ControllerPedidos {

    private DAOPedidos daoVendas = new DAOPedidos();
    

    
    public int salvarVendasController(Pedidos pModelVendas){
        return this.daoVendas.salvarVendasDAO(pModelVendas);
    }

    
    public Pedidos getVendasController(int pCodigo){
        return this.daoVendas.getVendasDAO(pCodigo);
    }

   
    public ArrayList<Pedidos> getListaVendasController(){
        return this.daoVendas.getListaVendasDAO();
    }

    
    public ArrayList<Pedidos> getListaVendasController(int pCodigo){
        return this.daoVendas.getListaVendasDAO(pCodigo);
    }
    
    
    public boolean atualizarVendasController(Pedidos pModelVendas){
        return this.daoVendas.atualizarVendasDAO(pModelVendas);
    }

    
    public boolean excluirVendasController(int pCodigo){
        return this.daoVendas.excluirVendasDAO(pCodigo);
    }

    public boolean salvarVendasProdutosController(Pedidos modelVendas) {
        return this.daoVendas.salvarProdutosVendasDAO(modelVendas);
    }

   
}