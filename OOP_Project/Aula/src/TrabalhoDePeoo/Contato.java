package TrabalhoDePeoo;

import java.util.ArrayList;

public abstract class Contato {
    protected String grupo;
    protected String nome;
    protected ArrayList<Telefone> telefones;
    protected Endereco endereco;
    protected Data dataNascimento;
    protected ArrayList<String> emails;
//Getters e Setters

    protected  String getGrupo(){
        return grupo;
    }
    
    protected  void setGrupo(String g){
        grupo = g;
    }
    
    protected  String getNome() {
        return nome;
    }

    protected  void setNome(String nome) {
        this.nome = nome;
    }

    protected  ArrayList<Telefone> getTelefones() {
        return telefones;
    }

    protected  void setTelefones(ArrayList<Telefone> telefones) {
        this.telefones = telefones;
    }

    protected  Endereco getEndereço() {
        return endereco;
    }

    protected  void setEndereço(Endereco endereco) {
        this.endereco = endereco;
    }

    protected  Data getDataNascimento() {
        return dataNascimento;
    }

    protected  void setDataNascimento(Data dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    protected  ArrayList<String> getEmails() {
        return emails;
    }

    protected  void setEmails(ArrayList<String> emails) {
        this.emails = emails;
    } 
}
