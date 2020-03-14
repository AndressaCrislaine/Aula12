package br.com.wcc.aulas;

import java.util.Scanner;

public class NumeroFloat implements SomeNumeros {

    public Float somaNumeros(Float num1, Float num2){
        Float numTotal;
        numTotal = num1 + num2;
        return numTotal;
    }

    public Float leiaNumero(){
        Scanner scannerF = new Scanner(System.in);
        Float float1 = scannerF.nextFloat();
        return float1;
    }
}
