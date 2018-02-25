package TrabalhoDePeoo;


public class Reuniao {
    Data data;
    String titulo;
    
    public Data getData(){
        return data;
    }
    public void setData(Data d){
        data = d;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String t){
        titulo = t;
    }
    
    public String ToString(){
        return data.dia+"/"+data.mes+"/"+data.ano+"-"+titulo;
    }
}
