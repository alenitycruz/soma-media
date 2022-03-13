package com.revisao.exercicio;

import java.util.Scanner;

/*
Faça um programa que leia 5 números e informe a soma e a média dos números.
 */
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numero;
        int i = 0;
        int soma = 0;
        int media;
        do {
            System.out.println("Escolha um número: ");
            numero = scan.nextInt();
            soma = soma + numero;
            i = i+1;
        }while (i < 5);

        media = soma/5;

        System.out.println("Soma: " + soma + " Média: " + media);

    }
}
