package TrabalhoDePeoo;

import java.util.ArrayList;

public class Trabalho extends Contato {
    private String setor;
    private String empresa;
    ArrayList<Reuniao> reunioes;
    
    
    Trabalho () {
        this.reunioes = new ArrayList();
    }
    
    public ArrayList getListDeReunioes(){
        return this.reunioes;
    }
    
    public void setListDeReunioes(ArrayList lr){
        reunioes = lr;
    }
    
    public String getSetor () {
        return setor;
    }
    
    public void setSetor (String s) {
        setor = s;
    }
    
    public String getEmpresa () {
        return empresa;
    }
    
    public void setEmpresa(String e){
        empresa = e;
    }
    
}
