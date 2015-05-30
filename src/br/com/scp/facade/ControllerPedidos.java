package br.com.scp.facade;

import br.com.scp.model.Pedidos;
import br.com.scp.DAO.DAOPedidos;
import java.util.ArrayList;
import br.com.scp.relatorios.DAORelatorios;



public class ControllerPedidos {

    private DAOPedidos daoPedidos = new DAOPedidos();
    private DAORelatorios dAORelatorios = new DAORelatorios();
    

    
    public int salvarPedidosController(Pedidos pModelvendas){
        return this.daoPedidos.salvarPedidosDAO(pModelvendas);
    }

    
    public Pedidos getPedidosController(int pCodigo){
        return this.daoPedidos.getPedidosDAO(pCodigo);
    }

   
    public ArrayList<Pedidos> getListaPedidosController(){
        return this.daoPedidos.getListaPedidosDAO();
    }

    
    public ArrayList<Pedidos> getListaPedidosController(int pCodigo){
        return this.daoPedidos.getListaPedidosDAO(pCodigo);
    }
    
    
    public boolean atualizarPedidosController(Pedidos pModelVendas){
        return this.daoPedidos.atualizarPedidosDAO(pModelVendas);
    }

    
    public boolean excluirPedidosController(int pCodigo){
        return this.daoPedidos.excluirPedidosDAO(pCodigo);
    }

    public boolean salvarPedidosProdutosController(Pedidos modelPedidos) {
        return this.daoPedidos.salvarProdutosPedidosDAO(modelPedidos);
     
    }
    public boolean gerarRelatorioPedido(int pCodigo) {
        return this.dAORelatorios.gerarRelatorioPedido(pCodigo);
    }

   
}