package TrabalhoDePeoo;

import java.util.ArrayList;

public class Amigos extends Contato{
    protected ArrayList<Reuniao> reunioes;
    Amigos(){
        reunioes = new ArrayList();
    }
    
    public ArrayList getListDeReunioes(){
        return reunioes;
    }
    
    public void setListDeReunioes(ArrayList lr){
        reunioes = lr;
    }
}
