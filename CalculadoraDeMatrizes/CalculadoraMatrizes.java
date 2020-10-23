package com.company;
import javax.swing.*;



public class CalculadoraMatrizes {

        public static void main(String args[])
        {

            //Variáveis

            int i, j; // Indice dos elementos da Matriz
            int L_AB, C_AB, L_AB2, C_AB2; // Linhas e Colunas das Matrizes


            String resp="", resp2="", resp3="";
            String opc = (String)JOptionPane.showInputDialog(
                    null,
                    "(Escolha uma das opções)\n"+
                    "1 - Determinante \n" +
                    "2 - Determinante de matriz maior que 3 "+
                    "3 - Soma de Matrizes\n"+
                    "4 - Subtração de Matrizes\n"+
                    "5 - Multiplicação de Matrizes\n"+
                    "6 - Multiplicação de um número por uma matriz"+
                    "7 - SAIR",
                    "CALCULADORA DE MATRIZES \n",
                    JOptionPane.PLAIN_MESSAGE);

           switch(Integer.parseInt(opc))
            {

                case 1:

                    L_AB = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o nº de LINHAS para a Matriz A e B"));
                    C_AB = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o nº de COLUNAS para a Matriz A e B"));


                    int[][] matriz_A = new int[L_AB][C_AB];
                    int[][] matriz_B = new int[L_AB][C_AB];
                    int[][] soma = new int[L_AB][C_AB];



                    for(i=0; i<L_AB; i++)
                    {
                        for(j=0; j<C_AB; j++)
                        {
                            matriz_A[i][j]=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a A"));
                            resp = resp + matriz_A[i][j] + "-";
                        }
                    }

                    for(i=0; i<L_AB; i++)
                    {
                        for(j=0; j<C_AB; j++)
                        {
                            matriz_B[i][j]=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a B"));
                            resp2 = resp2 + matriz_B[i][j] + "-";
                        }
                    }

                    for(i=0; i<L_AB; i++)
                    {
                        for(j=0; j<C_AB; j++)
                        {
                            soma[i][j] = matriz_A[i][j] + matriz_B[i][j];
                            resp3 = resp3 + soma[i][j] + "-";
                        }
                    }

                    break;



                case 2:

                    L_AB2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o nº de LINHAS para a Matriz A e B"));
                    C_AB2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o nº de COLUNAS para a Matriz A e B"));


                    int[][] matriz_A2 = new int[L_AB2][C_AB2];
                    int[][] matriz_B2 = new int[L_AB2][C_AB2];
                    int[][] sub = new int[L_AB2][C_AB2];



                    for(i=0; i<L_AB2; i++)
                    {
                        for(j=0; j<C_AB2; j++)
                        {
                            matriz_A2[i][j]=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a A"));
                            resp = resp + matriz_A2[i][j] + "-";
                        }
                    }

                    for(i=0; i<L_AB2; i++)
                    {
                        for(j=0; j<C_AB2; j++)
                        {
                            matriz_B2[i][j]=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a B"));
                            resp2 = resp2 + matriz_B2[i][j] + "-";
                        }
                    }

                    for(i=0; i<L_AB2; i++)
                    {
                        for(j=0; j<C_AB2; j++)
                        {
                            sub[i][j] = matriz_A2[i][j] - matriz_B2[i][j];
                            resp3 = resp3 + sub[i][j] + "-";
                        }
                    }

                    break;
            }

            JOptionPane.showMessageDialog(null, resp + "n" + resp2 + "n" + resp3);
        }
    }



