/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meuprograma;

/**
 *
 * @author Francisco
 */
public class MeuPrograma {
 
    static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
 
    public static void main(String[] args) {   
	
	// teste do programa. Imprime os 30 primeiros termos       
	for (int i = 0; i < 30; i++) {
            System.out.println("(" + i + "):" + MeuPrograma.fibo(i) + "\t");
        }
 
    }
 
}