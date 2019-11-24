/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaExercício4;

import java.util.Scanner;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ex35 {

    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        int tl = tam_linha();
        int tc = tam_coluna();
        int[][] m = matriz(tl, tc);
        int[][] popula = popula(m);
        System.out.println("======");
        resultado(m);
        System.out.println("======");
        resultadoSoma(m, tl, tc);
    }
    
    public static int tam_linha() {
        System.out.print("Qual tamanho da Linha? ");
        int tam = input.nextInt();
        return tam;
    }
    
    public static int tam_coluna() {
        System.out.print("Qual tamanho da Coluna? ");
        int tam = input.nextInt();
        return tam;
    }
    
    public static int[][] matriz(int tl, int tc) {
        int[][] m = new int[tl][tc];
        return m;
    }
    
    public static int[][] popula(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print("Matriz[" + (i + 1) + "][" + (j + 1) + "] = ");
                m[i][j] = input.nextInt();
            }
        }
        return m;
    }
    
    public static void resultado(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    public static void resultadoSoma(int[][] m, int tl, int tc) {
        int soma = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] > 0) {
                    soma += m[i][j];
                }
            }
        }
        int media = soma / (tl * tc);
        System.out.println("Média dos positivos: " + media);
    }
}
