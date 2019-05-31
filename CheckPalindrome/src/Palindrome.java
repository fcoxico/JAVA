import java.util.*;

class Palindrome
{
    public static void main(String args[])
    {
        // Inicializa os objetos do tipo String com uma String Vazia para
        // não pegar valores residuais.

        String original, reverse = "";
        Scanner word = new Scanner(System.in);

        System.out.println("Please insert the word you want to " +
                "check if it is a Palindrome");
        original = word.nextLine().toLowerCase();

        int length = original.length();

        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + original.charAt(i);

        if (original.equals(reverse)) {
            System.out.println("The original word was: " + original);
            System.out.println("The word reversed is: " + reverse);
            System.out.println("The word are equal. The word is a palindrome");
        } else {
            System.out.println("The string isn't a palindrome.");
        }
    }
}