/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.scp.interfac;

import br.com.scp.model.Cliente;
import br.com.scp.model.Fornecedor;
import br.com.scp.model.Pedidos;
import br.com.scp.model.Produtos;

/**
 *
 * @author Leonardo
 */
public interface Ifachada {
    
    void salvarClienteDAO (Cliente pmodelCliente)throws Exception;
    void getClienteDAO (int pCodigo) throws Exception;
    void getClienteDAO (String pNome) throws Exception;
    void getListaClienteDAO () throws Exception;
    void atualizarClienteDAO(Cliente pModelCliente) throws Exception;
    void excluirClienteDAO(int pCodigo) throws Exception;
    
    void salvarFornecedorDAO(Fornecedor pModelFornecedor) throws Exception;
    void getFornecedorDAO(int pCodigo) throws Exception;
    void getFornecedorDAO(String pNome) throws Exception;
    void getListaFornecedorDAO() throws Exception;
    void atualizarFornecedorDAO(Fornecedor pModelFornecedor) throws Exception;
    void excluirFornecedorDAO(int pCodigo) throws Exception;
    
    void salvarVendasDAO(Pedidos pModelVendas) throws Exception;
    void salvarProdutosVendasDAO(Pedidos pModelVendas) throws Exception;
    void getVendasDAO(int pCodigo) throws Exception;
    void getListaVendasDAO() throws Exception;
    void getListaVendasDAO(int pCodigo) throws Exception;
    void atualizarVendasDAO(Pedidos pModelVendas) throws Exception;
    void excluirVendasDAO(int pCodigo) throws Exception;
    
    void salvarProdutosDAO(Produtos pModelProdutos) throws Exception;
    void getProdutosDAO(int pCodigo) throws Exception;
    void getProdutosDAO(String pNome) throws Exception;
    void getListaProdutosDAO() throws Exception;
    void atualizarProdutosDAO(Produtos pModelProdutos) throws Exception;
    void atualizarProdutosQuantidadeDAO(Produtos pModelProdutos) throws Exception;
    void excluirProdutosDAO(int pCodigo) throws Exception;
    
}
