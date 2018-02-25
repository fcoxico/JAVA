package TrabalhoDePeoo;

public class Telefone {

    private String numero;
    private String operadora;
    private String codArea;

    public Telefone() {}
    public Telefone(String numero, String operadora, String codArea) {
        this.numero = numero;
        this.operadora = operadora;
        this.codArea = codArea;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    public String getCodArea() {
        return codArea;
    }

    public void setCodArea(String codArea) {
        this.codArea = codArea;
    }
    
    public String ToString(){
        return operadora+" - ("+codArea+")"+numero;
    }
}
