package TrabalhoDePeoo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;

class Agenda {

    Agenda() {

    }

    public void getEmail() {
    }

    public void getEmail(ArrayList<String> emails) {
        Scanner ler = new Scanner(System.in);
        String email;
        System.out.println("Insira um email:");
        email = ler.nextLine();

        emails.add(email);
    }

    //Funcao para adicionar os contatros
    public void adicionarContato(ArrayList<Contato> contatos) throws ParseException {
        Scanner ler = new Scanner(System.in);
        Endereco endereco = new Endereco();
        System.out.println("Insira o grupo do contato:");
        System.out.println("1 - Familia, 2 - Amigos, 3 - Trabalho");
        int grupo = ler.nextInt();
        ler = new Scanner(System.in);
        System.out.println("Digite o nome:");
        String nome = ler.nextLine();
        String opcao = "s";
        //Criado uma array list de telefones
        ArrayList<Telefone> lt = new ArrayList();
        do {
            Telefone telefone = new Telefone();
            System.out.println("Digite o numero:");
            telefone.setNumero(ler.nextLine());
            System.out.println("Digite o codigo:");
            telefone.setCodArea(ler.nextLine());
            System.out.println("Digite a operadora:");
            telefone.setOperadora(ler.nextLine());

            lt.add(telefone);
            System.out.println("Deseja adicionar outro telefone?(S/N)");
            opcao = ler.nextLine();
            if ((!"s".equals(opcao)) && (!"n".equals(opcao))) {
                System.out.println("Opcao Invalida");
                System.out.println("Digite novamente a sua opcao");
                opcao = ler.nextLine();
            }
        } while (opcao.equals("s"));
        // Tratamento de opção INVÁLIDA 
        
        System.out.println("Digite o ano do nascimento(dd/mm/aaaa)");
        System.out.println("Entre com o dia:");
        int dia = ler.nextInt();
        System.out.println("Entre com o mes:");
        int mes = ler.nextInt();
        System.out.println("Entre com o ano:");
        int ano = ler.nextInt();
        ler.nextLine();
        Data data = new Data(dia, mes, ano);

        System.out.println("Deseja inserir informações adicionais?(S/N)");
        String escolha;
        escolha = ler.nextLine();

        if (escolha.equals("s")) {
            System.out.println("Digite rua");
            String rua = ler.nextLine();
            System.out.println("Digite o numero");
            String numero = ler.nextLine();
            System.out.println("Digite o complemento");
            String complemento = ler.nextLine();
            System.out.println("Digite o bairro");
            String bairro = ler.nextLine();
            System.out.println("Digite a cidade");
            String cidade = ler.nextLine();
            System.out.println("Digite o cep");
            String cep = ler.nextLine();
            System.out.println("Digite o pais");
            String pais = ler.nextLine();
            System.out.println("Digite o estado");
            String estado = ler.nextLine();

            endereco.setBairro(bairro);
            endereco.setCep(cep);
            endereco.setCidade(cidade);
            endereco.setComplemento(complemento);
            endereco.setEstado(estado);
            endereco.setNumero(numero);
            endereco.setPais(pais);
            endereco.setRua(rua);

            if ((!escolha.equals("s")) && (!escolha.equals("n"))) {
                System.out.println("Opcao Invalida");
                System.out.println("Digite novamente a sua opcao");
                escolha = ler.nextLine();
            }
        }

        //Criado uma array list de emails
        ArrayList<String> email = new ArrayList();
        //Email
        opcao="";
        while ((!"s".equals(opcao)) || (!"n".equals(opcao))) {
            System.out.println("Deseja adicionar algum Email?(S/N)");
            opcao = ler.nextLine();
            if (opcao.equalsIgnoreCase("s")) {
                System.out.println("Digite o email");
                email.add(ler.nextLine());
            } else if (opcao.equalsIgnoreCase("n")) {
                break;
            } else {
                System.out.println("Opcao Invalida");
                System.out.println("Digite novamente a sua opcao");
                opcao = ler.nextLine();
            }
            
        }
        if (grupo == 1) {
            Familia familia = new Familia();
            System.out.println("Digite o parentesco");
            String parentesco = ler.nextLine();
            familia.setNome(nome);
            familia.setGrupo("Familia");
            familia.setDataNascimento(data);
            familia.setEndereço(endereco);
            familia.setEmails(email);
            familia.setTelefones(lt);
            familia.setParentesco(parentesco);
            contatos.add(familia);
        }
        if (grupo == 2) {
            Amigos amigo = new Amigos();
            ArrayList<Reuniao> lr = new ArrayList();
            amigo.setNome(nome);
            amigo.setGrupo("Amigos");
            amigo.setDataNascimento(data);
            amigo.setEndereço(endereco);
            amigo.setEmails(email);
            amigo.setTelefones(lt);
            
            opcao = "";
            while (!(opcao.equalsIgnoreCase("s")) || !(opcao.equalsIgnoreCase("n"))) {
                System.out.println("Voce quer adicionar uma reuniao?(S/N)");
                opcao = ler.nextLine();
                if (opcao.equals("s")) {
                    System.out.println("Digite o dia");
                    dia = ler.nextInt();
                    System.out.println("Digite o mes");
                    mes = ler.nextInt();
                    System.out.println("Digite o ano");
                    ano = ler.nextInt();
                    Data data1 = new Data(dia, mes, ano);
                    System.out.println("Digite o titulo da reuniao");
                    ler.reset();
                    Scanner ler2 = new Scanner(System.in);        
                    Reuniao reuniao = new Reuniao();
                    reuniao.setData(data1);
                    reuniao.setTitulo(ler2.nextLine());
                    
                    
                    lr.add(reuniao);
                } else if (opcao.equals("n")) {
                    break;
                } else if ((!escolha.equals("s")) && (!escolha.equals("n"))) {
                    System.out.println("Opcao Invalida");
                    System.out.println("Digite novamente a sua opcao");
                    
                }
                opcao = ler.nextLine();
            }
            amigo.setListDeReunioes(lr);
            contatos.add(amigo);
        }
        if (grupo == 3) {
            Trabalho trab = new Trabalho();
            ArrayList<Reuniao> lr_trab = new ArrayList();
            trab.setNome(nome);
            System.out.println("Digite a empresa");
            trab.setEmpresa(ler.nextLine());
            System.out.println("Digite o setor");
            trab.setSetor(ler.nextLine());
            trab.setGrupo("Trabalho");
            trab.setDataNascimento(data);
            trab.setEndereço(endereco);
            trab.setEmails(email);
            trab.setTelefones(lt);

            
            opcao = "";
            while (!(opcao.equalsIgnoreCase("s")) || !(opcao.equalsIgnoreCase("n"))) {
                System.out.println("Voce quer adicionar uma reuniao?(S/N)");
                opcao = ler.nextLine();
                if (opcao.equalsIgnoreCase("s")) {
                    System.out.println("Digite o dia");
                    dia = ler.nextInt();
                    System.out.println("Digite o mes");
                    mes = ler.nextInt();
                    System.out.println("Digite o ano");
                    ano = ler.nextInt();
                    Data data1 = new Data(dia, mes, ano);
                    System.out.println("Digite o titulo da reuniao");
                    ler.reset();
                    Scanner ler1 = new Scanner(System.in);        
                    Reuniao reuniao = new Reuniao();
                    reuniao.setData(data1);
                    reuniao.setTitulo(ler1.nextLine());
                    lr_trab.add(reuniao);
                } else if (opcao.equalsIgnoreCase("n")) {

                    break;

                } else if ((!escolha.equals("s")) && (!escolha.equals("n"))) {
                    System.out.println("Opcao Invalida");
                    System.out.println("Digite novamente a sua opcao");
                    
                }
                opcao = ler.nextLine();
            }
            trab.setListDeReunioes(lr_trab);
            contatos.add(trab);
        }

    }

    public void exibirContatos(ArrayList<Contato> contatos) {
        for (int i = 0; i < contatos.size(); i++) {
            Contato contato = contatos.get(i);
            exibirContato(contato);
        }
    }
    
    public void exibirContato(Contato contato) {
            if (contato instanceof Amigos) {
                Amigos amigo = (Amigos) contato;
                System.out.println("-----------------------------------------");
                System.out.println(amigo.getNome());
                System.out.println(amigo.getGrupo());
                System.out.println(amigo.getDataNascimento().ToString());
                for (int j = 0; j < amigo.telefones.size(); j++) {
                    System.out.println(amigo.telefones.get(j).ToString());
                }
                for (int j = 0; j < amigo.emails.size(); j++) {

                    System.out.println(amigo.emails.get(j));
                }
                for (int j = 0; j < amigo.reunioes.size(); j++) {
                    System.out.println(amigo.reunioes.get(j).ToString());
                }
                System.out.println("-----------------------------------------");

            }
            if (contato instanceof Trabalho) {
                Trabalho trabalho = (Trabalho) contato;
                System.out.println("-----------------------------------------");
                System.out.println(trabalho.getNome());
                System.out.println(trabalho.getGrupo());
                System.out.println(trabalho.getDataNascimento().ToString());
                for (int j = 0; j < trabalho.telefones.size(); j++) {
                    System.out.println(trabalho.telefones.get(j).ToString());
                }
                for (int j = 0; j < trabalho.emails.size(); j++) {
                    System.out.println(trabalho.emails.get(j));
                }
                for (int j = 0; j < trabalho.getListDeReunioes().size(); j++) {
                    System.out.println(trabalho.getListDeReunioes().get(j));
                }
                System.out.println("-----------------------------------------");

            }
            if (contato instanceof Familia) 
            {
                Familia familia = (Familia) contato;
                System.out.println("-----------------------------------------");
                System.out.println(familia.getNome());
                System.out.println(familia.getParentesco());
                System.out.println(familia.getGrupo());
                System.out.println(familia.getDataNascimento().ToString());
                for (int j = 0; j < familia.telefones.size(); j++) 
            {
                    System.out.println(familia.telefones.get(j).ToString());
            }
                for (int j = 0; j < familia.emails.size(); j++) 
            {

                    System.out.println(familia.emails.get(j));
            }
                System.out.println("-----------------------------------------");
            }
    }

    //Função para editar os contatos
    
    public void editarContato(ArrayList<Contato> contatos) {
        Scanner ler = new Scanner(System.in);
        for (int i = 0; i < contatos.size(); i++) {
            System.out.println(i + " - " + contatos.get(i).getNome());
        }
        System.out.print("Digite o indice do contato que deseja editar: ");
        int pessoaSelecionada = ler.nextInt();
        Contato contato = contatos.get(pessoaSelecionada);
        exibirContato(contato);
        System.out.println("\n");
        System.out.println("Escolha o que voce quer editar.");
        System.out.print("1 - Nome, 2 - Grupo, 3 - Endereco, 4 - Nascimento, 5 - Email, 6 - Telefone ");
        if (contato instanceof Amigos) {System.out.print(",7 - Reuniao");}     
        if (contato instanceof Trabalho) {System.out.print(",7 - Reuniao, 8 - Empresa, 9 - Setor");}
        if (contato instanceof Familia) {System.out.print(",7 - Parentesco");}
        int opcao = ler.nextInt();
        if(opcao == 1){
            System.out.println("Digite o novo Nome do contato");
            contato.setNome(ler.nextLine());
        }
        if(opcao == 2){
            System.out.println("Escolha o novo Grupo contato: 1 - Familia, 2 - Amigo e 3 - Trabalho");
            int op = 0;
            String grupo ="";
            
            while(op != 1 || op!= 2 || op!=3){
            op = ler.nextInt();
            if (op ==1){
                grupo = "Familia";
                contatos.remove(pessoaSelecionada);
                try {
                    adicionarContato(contatos);
                } catch (ParseException ex) {
                    Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else
            if (op ==2){
                grupo = "Amigo";
                contatos.remove(pessoaSelecionada);
                try {
                    adicionarContato(contatos);
                } catch (ParseException ex) {
                    Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else
            if (op ==3){
                grupo = "Trabalho";
                contatos.remove(pessoaSelecionada);
                try {
                    adicionarContato(contatos);
                } catch (ParseException ex) {
                    Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
            System.out.println("Opcao Invalida");
            }
           } 
            contato.setGrupo(grupo);
        }
        
        if (opcao == 3) {
            System.out.println("Digite o novo Endereco do contato");
            Endereco endereco = new Endereco();
            System.out.println("Digite a rua");
            endereco.setRua(ler.nextLine());
            System.out.println("Digite o numero");
            endereco.setNumero(ler.nextLine());
            System.out.println("Digite o bairro");
            endereco.setBairro(ler.nextLine());
            System.out.println("Digite o cidade");
            endereco.setCidade(ler.nextLine());
            System.out.println("Digite o cep");
            endereco.setCep(ler.nextLine());
            System.out.println("Digite o pais");
            endereco.setPais(ler.nextLine());
            System.out.println("Digite o estado");
            endereco.setEstado(ler.nextLine());
            contato.setEndereço(endereco);
        }
        if (opcao == 4) {
            System.out.println("Digite a nova Data de Nascimento do contato");
            Data data = new Data();
            System.out.println("Digite o dia");
            data.setDia(ler.nextInt());
            System.out.println("Digite o mes");
            data.setMes(ler.nextInt());
            System.out.println("Digite o ano");
            data.setAno(ler.nextInt());
            contato.setDataNascimento(data);
            
        }
        if (opcao == 5) {      
            for (int i=0; i<contato.getEmails().size(); i++){
                System.out.println(i+" "+contato.getEmails().get(i));
            }
            System.out.println("Qual o email voce quer editar?");
            int escolha = ler.nextInt();
            String novo_email;
            contato.getEmails().remove(escolha);
            System.out.println("Digite o novo email");
            novo_email = ler.nextLine();
            contato.getEmails().add(novo_email);
            contato.setEmails(contato.getEmails());
        }

        if (opcao == 6) {
            for (int i=0; i<contato.getTelefones().size(); i++){
                System.out.println(i+" "+contato.getTelefones().get(i).getNumero());
            }
            System.out.println("Qual o telefone voce quer editar?");
            int escolha = ler.nextInt();
            Telefone novo_tel = new Telefone();
            contato.getTelefones().remove(escolha);
            System.out.println("Digite o numero do telefone");
            novo_tel.setNumero(ler.nextLine());
            System.out.println("Digite o Codigo da Area");
            novo_tel.setCodArea(ler.nextLine());
            System.out.println("Digite a Operadora");
            novo_tel.setOperadora(ler.nextLine());
            contato.getTelefones().add(novo_tel);
            contato.setTelefones(contato.getTelefones());
            
        }
                                                
        if (contato instanceof Amigos) {
            Amigos ctta = (Amigos)contato;
            if(opcao ==7){
               for (int i=0; i<ctta.getListDeReunioes().size(); i++){
                System.out.println(i+" - ("+ctta.reunioes.get(i).ToString()+")"+ctta.reunioes.get(i).titulo);
               }
                System.out.println("Qual a reuniao que voce quer modificar?");
                opcao = ler.nextInt();
                ctta.getListDeReunioes().remove(opcao);
                Reuniao nova_reuniao = new Reuniao();
                Data data = new Data();
                System.out.println("Digite o dia da reuniao");
                data.setDia(ler.nextInt());
                System.out.println("Digite o mes da reuniao");
                data.setMes(ler.nextInt());
                System.out.println("Digite o ano da reuniao");
                data.setAno(ler.nextInt());
                System.out.println("Digite o titulo da reuniao");
                nova_reuniao.setTitulo(ler.nextLine());
                nova_reuniao.setData(data);
                ctta.getListDeReunioes().add(nova_reuniao);
                ctta.setListDeReunioes(ctta.getListDeReunioes());
            }
            contatos.remove(pessoaSelecionada);
            contatos.add(ctta);
            
            
        }     
        if (contato instanceof Trabalho) {
            Trabalho cttt = (Trabalho)contato;
            if(opcao ==7){
               for (int i=0; i<cttt.getListDeReunioes().size(); i++){
                System.out.println(i+" - ("+cttt.reunioes.get(i).data.ToString()+")"+
                        cttt.reunioes.get(i).titulo);
               }
                System.out.println("Qual a reuniao que voce quer modificar?");
                opcao = ler.nextInt();
                cttt.getListDeReunioes().remove(opcao);
                Reuniao nova_reuniao = new Reuniao();
                Data data = new Data();
                System.out.println("Digite o dia da reuniao");
                data.setDia(ler.nextInt());
                System.out.println("Digite o mes da reuniao");
                data.setMes(ler.nextInt());
                System.out.println("Digite o ano da reuniao");
                data.setAno(ler.nextInt());
                System.out.println("Digite o titulo da reuniao");
                nova_reuniao.setTitulo(ler.nextLine());
                nova_reuniao.setData(data);
                cttt.getListDeReunioes().add(nova_reuniao);
                cttt.setListDeReunioes(cttt.getListDeReunioes());
                
                
            }
            if(opcao ==8){
                System.out.println("Digite a empresa");
                cttt.setEmpresa(ler.nextLine());
                
            }
            
            if (opcao==9){
                System.out.println("Digite o setor");
                cttt.setSetor(ler.nextLine());
            }
            contatos.remove(pessoaSelecionada);
            contatos.add(cttt);
        }
        
        if (contato instanceof Familia) {
            Familia cttf = (Familia)contato;
        if (opcao==7){
                System.out.println("Digite o parentesco");
                cttf.setParentesco(ler.nextLine());
            }
        contatos.remove(pessoaSelecionada);
        contatos.add(cttf);
        }
    
    }
        
    public void excluirContato(ArrayList<Contato> contatos) {
        int i;
        Scanner ler = new Scanner(System.in);

        for (i = 0; i < contatos.size(); i++) {
            System.out.println(i + "." + " " + contatos.get(i).nome);
        }

        System.out.println("Qual contato deseja excluir?:");
        int escolha = ler.nextInt();

        try {
            contatos.remove(escolha);
        } catch (IndexOutOfBoundsException e) {
            // excecao lancada para indicar que um Ã­ndice (i)
            // estÃ¡ fora do intervalo vÃ¡lido (de 0 atÃ© contatos.size()-1)
            System.out.printf("\nErro: Posição Invalida.\n\n",
                    e.getMessage());
        }
    }

    //Função para exportar os contatos
    public void exportarContatos(ArrayList<Contato> contatos) throws JSONException {
        try {

            File file = new File("contatos.txt");
            FileWriter arquivo = new FileWriter(file);
            for (int i = 0; i < contatos.size(); i++) {
                JSONObject contato = new JSONObject();

                contato.put("nome", contatos.get(i).nome);
                contato.put("grupo", contatos.get(i).grupo);
                contato.put("data", contatos.get(i).dataNascimento.ToString());

                JSONArray telefones = new JSONArray();
                for (int j = 0; j < contatos.get(i).telefones.size(); j++) {
                    JSONObject telefone = new JSONObject();
                    telefone.put("numero", contatos.get(i).telefones.get(j).getNumero());
                    telefone.put("operadora", contatos.get(i).telefones.get(j).getOperadora());
                    telefone.put("codArea", contatos.get(i).telefones.get(j).getCodArea());
                    telefones.put(telefone);
                }

                JSONArray emails = new JSONArray();
                for (int k = 0; k < contatos.get(i).emails.size(); k++) {
                    JSONObject email = new JSONObject();
                    email.put("emails", contatos.get(i).emails.get(k));
                    emails.put(email);
                }

                JSONObject endereco = new JSONObject();
                endereco.put("rua", contatos.get(i).endereco.getRua());
                endereco.put("complemento", contatos.get(i).endereco.getComplemento());
                endereco.put("numero", contatos.get(i).endereco.getNumero());
                endereco.put("bairo", contatos.get(i).endereco.getBairro());
                endereco.put("cep", contatos.get(i).endereco.getCep());
                endereco.put("cidade", contatos.get(i).endereco.getCidade());
                endereco.put("estado", contatos.get(i).endereco.getEstado());
                endereco.put("pais", contatos.get(i).endereco.getPais());

                contato.put("endereco", endereco);

                contato.put("telefones", telefones);
                contato.put("emails", emails);

                arquivo.write(contato.toString() + "\n");
            }
            arquivo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void importarContatos(ArrayList<Contato> contatos) throws JSONException {
        /*
  if(grupo.equals("Familia")){
      Familia contFamilia = new Familia();
      contFamilia.setNome(nome);
      contFamilia.setGrupo(grupo);
      JSONParser parser = new JSONParser();
      JSONObject infoGrupo = (JSONObject) parser.parse(res.getString(3));
      contatoF.setParentesco(inforGrupo).get("Parentesco").toString;
  }

                    
          
        
            
            try {
            File file = new File("contatos.txt");
            FileReader arquivo = new FileReader(file);
            for (int i = 0; i < contatos.size(); i++) {
                JSONObject contato = new JSONObject();

                contatos.get(i).setNome(contato.getString("nome"));
                contato.put("grupo", contatos.get(i).grupo);

                JSONArray telefones = new JSONArray();
                
                for (int j = 0; j < contatos.get(i).telefones.size(); j++) {
                    JSONObject telefone = new JSONObject();
                    telefone.put("numero", contatos.get(i).telefones.get(j).getNumero());
                    telefone.put("operadora", contatos.get(i).telefones.get(j).getOperadora());
                    telefone.put("codArea", contatos.get(i).telefones.get(j).getCodArea());
                    telefones.put(telefone);
                }
                contato.put("telefones", telefones);
                
                JSONObject endereco = new JSONObject();
                endereco.put("rua", contatos.get(i).endereco.getRua());
                endereco.put("complemento", contatos.get(i).endereco.getComplemento());
                endereco.put("numero", contatos.get(i).endereco.getNumero());
                contato.put("endereco", endereco);
                
                arquivo.write(contato.toString()+"\n");

            }
            arquivo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        */
    }
}
