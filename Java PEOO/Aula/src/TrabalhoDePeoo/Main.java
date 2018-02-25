package TrabalhoDePeoo;

import static TrabalhoDePeoo.Menus.menuAdicionar;
import static TrabalhoDePeoo.Menus.menuEditar;
import static TrabalhoDePeoo.Menus.menuRemover;
import static TrabalhoDePeoo.Menus.menuListar;
import static TrabalhoDePeoo.Menus.menuPrincipal;
import static TrabalhoDePeoo.Menus.menuExportar;
import java.text.ParseException;

import java.util.ArrayList;
import java.util.Scanner;
import org.json.JSONException;

public class Main {

    public static void main(String[] args) throws ParseException, JSONException {
        ArrayList<Contato> agenda = new ArrayList();

        int escolha;

        do {
            menuPrincipal();
            Scanner escolhaUsuario = new Scanner(System.in);

            escolha = escolhaUsuario.nextInt();

            switch (escolha) {
                case 1:
                    menuAdicionar();
                    new Agenda().adicionarContato(agenda);
                    break;
                case 2:
                    menuRemover();
                    new Agenda().excluirContato(agenda);
                    break;
                case 3:
                    menuEditar();
                    new Agenda().editarContato(agenda);
                    break;
                case 4:
                    menuListar();
                    new Agenda().exibirContatos(agenda);
                    break;
                case 5:
                    menuExportar();
                    new Agenda().exportarContatos(agenda);
                    break;
                    
            }
        } while (escolha != 7);
    }
}
