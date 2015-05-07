package br.com.scp.model;

import java.sql.Date;
import java.util.ArrayList;


public class ModelPedidos {

    private int codigo;
    private int produtosCodigo;
    private int clientesCodigo;
    private Date dataVenda;
    private int quantidade;
    private Double valor;
    private Float valorTotal;
    private Float desconto;
    private ArrayList<ModelPedidos> listamModelVendases;

    
    public ModelPedidos(){}

    
    public void setCodigo(int pCodigo){
        this.codigo = pCodigo;
    }
   
    public int getCodigo(){
        return this.codigo;
    }

    
    public void setProdutosCodigo(int pProdutosCodigo){
        this.produtosCodigo = pProdutosCodigo;
    }
    
    public int getProdutosCodigo(){
        return this.produtosCodigo;
    }

   
    public void setClientesCodigo(int pClientesCodigo){
        this.clientesCodigo = pClientesCodigo;
    }
    
    public int getClientesCodigo(){
        return this.clientesCodigo;
    }

    
    public void setDataVenda(Date pDataVenda){
        this.dataVenda = pDataVenda;
    }
    
    public Date getDataVenda(){
        return this.dataVenda;
    }

    
    public void setQuantidade(int pQuantidade){
        this.quantidade = pQuantidade;
    }
    
    public int getQuantidade(){
        return this.quantidade;
    }

    @Override
    public String toString(){
        return "ModelVendas {" + "::codigo = " + this.codigo + "::produtosCodigo = " + this.produtosCodigo + "::clientesCodigo = " + this.clientesCodigo + "::dataVenda = " + this.dataVenda + "::quantidade = " + this.quantidade +  "}";
    }

    
    public Double getValor() {
        return valor;
    }

    
    public void setValor(Double valor) {
        this.valor = valor;
    }

   
    public ArrayList<ModelPedidos> getListamModelVendases() {
        return listamModelVendases;
    }

    
    public void setListamModelVendases(ArrayList<ModelPedidos> listamModelVendases) {
        this.listamModelVendases = listamModelVendases;
    }

    
    public Float getValorTotal() {
        return valorTotal;
    }

    
    public void setValorTotal(Float valorTotal) {
        this.valorTotal = valorTotal;
    }

    
    public Float getDesconto() {
        return desconto;
    }

    
    public void setDesconto(Float desconto) {
        this.desconto = desconto;
    }
}