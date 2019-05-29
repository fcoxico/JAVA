
package TrabalhoDePeoo;

public class Endereco {
    private String rua, complemento, numero, bairro, cidade, cep, pais, estado;
        
    public String getRua(){
        return rua;
    }
    
    public void setRua(String r){
        rua = r;
    }
    
    public String getComplemento(){
        return complemento;
    }
    
    public void setComplemento(String comp){
        complemento = comp;
    }
    
    public String getNumero(){
        return numero;
    }
    
    public void setNumero(String n){
        numero = n;
    }
    
    public String getBairro(){
        return bairro;
    }
    
    public void setBairro(String b){
        bairro = b;
    }
    
    public String getCidade(){
        return cidade;
    }
    
    public void setCidade(String cid){
        cidade=cid;
    }
    
    public String getCep(){
        return cep;
    }
    
    public void setCep (String c){
        cep=c;
    }
    
    public String getPais(){
        return pais;
    }
    
    public void setPais(String p){
        pais = p;
    }
    
    public String getEstado(){
        return estado;
    }
    
    public void setEstado(String e){
        estado = e;
    }
}


