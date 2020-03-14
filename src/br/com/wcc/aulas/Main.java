package br.com.wcc.aulas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Soma números inteiros
        NumeroInteger numeroInteger = new NumeroInteger();
        System.out.println("Digite um número inteiro para somar: ");
        Integer num1 = numeroInteger.leiaNumero();

        System.out.println("Digite um número inteiro para somar: ");
        Integer num2 = numeroInteger.leiaNumero();
        System.out.println("O resultado total é " + numeroInteger.somaNumeros(num1,num2));

        //Soma números doubles
        NumeroDouble numeroDouble = new NumeroDouble();
        System.out.println("Digite um número Double para somar: ");
        Double double1 = numeroDouble.leiaNumero();

        System.out.println("Digite um número Double para somar: ");
        Double double2 = numeroDouble.leiaNumero();
        System.out.println("O resultado total é " + numeroDouble.somaNumeros(double1, double2));

        //Soma números Float
        NumeroFloat numeroFloat = new NumeroFloat();
        System.out.println("Digite um número Float para somar: ");
        Float float1 = numeroFloat.leiaNumero();

        System.out.println("Digite um número Float para somar: ");
        Float float2 = numeroFloat.leiaNumero();
        System.out.println("O resultado total é " + numeroFloat.somaNumeros(float1, float2));

        // Tabuada
        System.out.println("Digite um número para a tabuada: ");
        Scanner scanner3 = new Scanner(System.in);
        int numTabuada = scanner3.nextInt();
        Tabuada tabuada = new Tabuada();
        tabuada.escreverTabuada(numTabuada);

    }
}
