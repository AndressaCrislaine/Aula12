package br.com.wcc.aulas;

import java.util.Scanner;

public class NumeroDouble implements SomeNumeros {

    public Double somaNumeros(Double num1, Double num2){
        Double numTotal;
        numTotal = num1 + num2;
        return numTotal;
    }

    public Double leiaNumero(){
        Scanner scannerD = new Scanner(System.in);
        Double double1 = scannerD.nextDouble();
        return double1;
    }
}
