package atividade1;

import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {

        int numeros[] = new int[10];
        Scanner ler = new Scanner(System.in);
        int soma = 0;
        float media = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um numero");
            numeros[i] = ler.nextInt();
            soma = soma + numeros[i];
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println("Numeros pares: " + numeros[i]);
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.println("Numeros impares: " + numeros[i]);
            }
        }

        media = (float) soma / 10;

        System.out.println("Média: " + media);
        System.out.println("Soma: " + soma);

        ler.close();
    }
}
