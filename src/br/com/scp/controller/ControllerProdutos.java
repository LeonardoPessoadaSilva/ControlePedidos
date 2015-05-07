package br.com.scp.controller;

import br.com.scp.model.ModelProdutos;
import br.com.scp.DAO.DAOProdutos;
import java.util.ArrayList;



public class ControllerProdutos {

    private DAOProdutos daoProdutos = new DAOProdutos();
   
    
    public int salvarProdutosController(ModelProdutos pModelProdutos){
        return this.daoProdutos.salvarProdutosDAO(pModelProdutos);
    }

    
    public ModelProdutos getProdutosController(int pCodigo){
        return this.daoProdutos.getProdutosDAO(pCodigo);
    }
    
   
    public ModelProdutos getProdutosController(String pNome){
        return this.daoProdutos.getProdutosDAO(pNome);
    }

    
    public ArrayList<ModelProdutos> getListaProdutosController(){
        return this.daoProdutos.getListaProdutosDAO();
    }

    
    public boolean atualizarProdutosController(ModelProdutos pModelProdutos){
        return this.daoProdutos.atualizarProdutosDAO(pModelProdutos);
    }

   
    public boolean excluirProdutosController(int pCodigo){
        return this.daoProdutos.excluirProdutosDAO(pCodigo);
    }

   
    public boolean atualizarProdutosQuantidadeController(ModelProdutos pModelProdutos){
        return this.daoProdutos.atualizarProdutosQuantidadeDAO(pModelProdutos);
    }

 
    
}