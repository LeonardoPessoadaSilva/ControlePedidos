package br.com.scp.model;

public class Cliente {

    private int codigo;
    private String nome;
    private String endereco;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;
    private String telefone;

    
    public Cliente(){}

    
    public void setCodigo(int pCodigo){
        this.codigo = pCodigo;
    }
    
    public int getCodigo(){
        return this.codigo;
    }

    
    public void setNome(String pNome){
        this.nome = pNome;
    }
    
    public String getNome(){
        return this.nome;
    }

   
    public void setEndereco(String pEndereco){
        this.endereco = pEndereco;
    }
    
    public String getEndereco(){
        return this.endereco;
    }

   
    public void setBairro(String pBairro){
        this.bairro = pBairro;
    }
    
    public String getBairro(){
        return this.bairro;
    }

    
    public void setCidade(String pCidade){
        this.cidade = pCidade;
    }
    
    public String getCidade(){
        return this.cidade;
    }

    
    public void setUf(String pUf){
        this.uf = pUf;
    }
    
    public String getUf(){
        return this.uf;
    }

    
    public void setCep(String pCep){
        this.cep = pCep;
    }
    
    public String getCep(){
        return this.cep;
    }

    
    public void setTelefone(String pTelefone){
        this.telefone = pTelefone;
    }
    
    public String getTelefone(){
        return this.telefone;
    }


    @Override
    public String toString(){
        return "ModelCliente {" + "::codigo = " + this.codigo + "::nome = " + this.nome + "::endereco = " + this.endereco + "::bairro = " + this.bairro + "::cidade = " + this.cidade + "::uf = " + this.uf + "::cep = " + this.cep + "::telefone = " + this.telefone +"}";
    }
}