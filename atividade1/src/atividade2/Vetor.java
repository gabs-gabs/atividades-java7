package atividade2;

import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {

        int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
        boolean encontrado = false;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número para pesquisar no vetor: ");
        int pesquisarNumero = ler.nextInt();

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == pesquisarNumero) {
                System.out.println("O número " + pesquisarNumero + " está localizado na posição " + i);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Não foi encontrado!");
            ler.close();
        }
    }
}
