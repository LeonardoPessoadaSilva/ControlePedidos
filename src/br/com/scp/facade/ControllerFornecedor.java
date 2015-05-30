package br.com.scp.facade;

import br.com.scp.model.Fornecedor;
import br.com.scp.DAO.DAOFornecedor;
import br.com.scp.relatorios.DAORelatorios;
import java.util.ArrayList;



public class ControllerFornecedor {

    private DAOFornecedor daoFornecedor = new DAOFornecedor();
    private DAORelatorios dAORelatorios = new DAORelatorios();

    
    public int salvarFornecedorController(Fornecedor pModelFornecedor){
        return this.daoFornecedor.salvarFornecedorDAO(pModelFornecedor);
    }

    
    public Fornecedor getFornecedorController(int pCodigo){
        return this.daoFornecedor.getFornecedorDAO(pCodigo);
    }
    
    
    public Fornecedor getFornecedorController(String pNome){
        return this.daoFornecedor.getFornecedorDAO(pNome);
    }

    
    public ArrayList<Fornecedor> getListaFornecedorController(){
        return this.daoFornecedor.getListaFornecedorDAO();
    }

    
    public boolean atualizarFornecedorController(Fornecedor pModelFornecedor){
        return this.daoFornecedor.atualizarFornecedorDAO(pModelFornecedor);
    }

    
    public boolean excluirFornecedorController(int pCodigo){
        return this.daoFornecedor.excluirFornecedorDAO(pCodigo);
    }

    public boolean gerarRelatorioFornecedor() {
        return this.dAORelatorios.gerarRelatorioFornecedores();
    }
}