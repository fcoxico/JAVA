package TrabalhoDePeoo;

public class Data {
    int dia, mes, ano;
    
    Data() {}
    Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    
    public int getDia(){
        return dia;
    }
    
    public void setDia (int d){
        dia = d;
    }
    
    public int getMes(){
        return mes;
    }
    
    public void setMes(int m){
        mes = m;
    }
    
    public int getAno(){
        return ano;
    }
    
    public void setAno(int a){
        ano = a;
    }
    
    public String ToString(){
        return dia+"/"+mes+"/"+ano;
    }
    
    
}
