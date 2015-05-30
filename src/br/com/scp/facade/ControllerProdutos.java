package br.com.scp.facade;

import br.com.scp.model.Produtos;
import br.com.scp.DAO.DAOProdutos;
import br.com.scp.relatorios.DAORelatorios;
import java.util.ArrayList;



public class ControllerProdutos {

    private DAOProdutos daoProdutos = new DAOProdutos();
     private DAORelatorios dAORelatorios = new DAORelatorios();
   
    
    public int salvarProdutosController(Produtos pModelProdutos){
        return this.daoProdutos.salvarProdutosDAO(pModelProdutos);
    }

    
    public Produtos getProdutosController(int pCodigo){
        return this.daoProdutos.getProdutosDAO(pCodigo);
    }
    
   
    public Produtos getProdutosController(String pNome){
        return this.daoProdutos.getProdutosDAO(pNome);
    }

    
    public ArrayList<Produtos> getListaProdutosController(){
        return this.daoProdutos.getListaProdutosDAO();
    }

    
    public boolean atualizarProdutosController(Produtos pModelProdutos){
        return this.daoProdutos.atualizarProdutosDAO(pModelProdutos);
    }

   
    public boolean excluirProdutosController(int pCodigo){
        return this.daoProdutos.excluirProdutosDAO(pCodigo);
    }

   
    public boolean atualizarProdutosQuantidadeController(Produtos pModelProdutos){
        return this.daoProdutos.atualizarProdutosQuantidadeDAO(pModelProdutos);
    }

    public boolean gerarRelatorioProdutos() {
        return this.dAORelatorios.gerarRelatorioProdutos();
    }
    
}