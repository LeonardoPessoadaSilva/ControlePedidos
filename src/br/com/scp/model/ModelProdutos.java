package br.com.scp.model;

import java.util.ArrayList;


public class ModelProdutos {

    private int codigo;
    private int fornecedoresCodigo;
    private String nome;
    private Double valor;
    private int estoque;
    private ArrayList<ModelProdutos> listaModelProdutoses;

   
    public ModelProdutos(){}

   
    public void setCodigo(int pCodigo){
        this.codigo = pCodigo;
    }
    
    public int getCodigo(){
        return this.codigo;
    }

    
    public void setFornecedoresCodigo(int pFornecedores_codigo){
        this.fornecedoresCodigo = pFornecedores_codigo;
    }
    
    public int getFornecedoresCodigo(){
        return this.fornecedoresCodigo;
    }

   
    public void setNome(String pNome){
        this.nome = pNome;
    }
   
    public String getNome(){
        return this.nome;
    }

   
    public void setValor(Double pValor){
        this.valor = pValor;
    }
   
    public Double getValor(){
        return this.valor;
    }

   
    public void setEstoque(int pEstoque){
        this.estoque = pEstoque;
    }
    
    public int getEstoque(){
        return this.estoque;
    }

    @Override
    public String toString(){
        return "ModelProdutos {" + "::codigo = " + this.codigo + "::fornecedores_codigo = " + this.fornecedoresCodigo + "::nome = " + this.nome + "::valor = " + this.valor + "::estoque = " + this.estoque +  "}";
    }

    
    public ArrayList<ModelProdutos> getListaModelProdutoses() {
        return listaModelProdutoses;
    }

    
    public void setListaModelProdutoses(ArrayList<ModelProdutos> listaModelProdutoses) {
        this.listaModelProdutoses = listaModelProdutoses;
    }
}