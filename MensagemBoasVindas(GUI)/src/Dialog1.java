import javax.swing.*;
import javax.swing.JFrame;

public class Dialog1 {

    public static void main(String[] args) {

        // pede para o usuário inserir seu nome
        String name = JOptionPane.showInputDialog("What is your name?");

        // cria a mensagem
        String message = String.format("Welcome, %s, to Java Programming!", name);

        JFrame frame = new JFrame("JOptionPane showMessageDialog example");

        // exibe um diálogo com uma mensagemÿ
        JOptionPane.showMessageDialog(frame, message);
    }
}
