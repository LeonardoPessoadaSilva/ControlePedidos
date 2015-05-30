package br.com.scp.model;

import java.sql.Date;
import java.util.ArrayList;


public class Pedidos {

    private int codigo;
    private int produtosCodigo;
    private int clientesCodigo;
    private Date dataPedido;
    private int quantidade;
    private Double valor;
    private Float valorTotal;
    private Float desconto;
    private ArrayList<Pedidos> listamModelPedidoses;

    
    public Pedidos(){}

    
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

    
    public void setDataPedido(Date pDataPedido){
        this.dataPedido = pDataPedido;
    }
    
    public Date getDataPedido(){
        return this.dataPedido;
    }

    
    public void setQuantidade(int pQuantidade){
        this.quantidade = pQuantidade;
    }
    
    public int getQuantidade(){
        return this.quantidade;
    }

    @Override
    public String toString(){
        return "ModelPedidos {" + "::codigo = " + this.codigo + "::produtosCodigo = " + this.produtosCodigo + "::clientesCodigo = " + this.clientesCodigo + "::dataPedido = " + this.dataPedido + "::quantidade = " + this.quantidade +  "}";
    }

    
    public Double getValor() {
        return valor;
    }

    
    public void setValor(Double valor) {
        this.valor = valor;
    }

   
    public ArrayList<Pedidos> getListamModelPedidoses() {
        return listamModelPedidoses;
    }

    
    public void setListamModelVendases(ArrayList<Pedidos> listamModelPedidoses) {
        this.listamModelPedidoses = listamModelPedidoses;
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