package br.com.wcc.aulas;

import java.util.Scanner;

public class NumeroInteger implements SomeNumeros{

    public Integer somaNumeros(Integer num1, Integer num2){
        Integer numTotal = num1 + num2;
        return numTotal;
    }

    public Integer leiaNumero(){
        Scanner scannerI = new Scanner(System.in);
        Integer int1 = scannerI.nextInt();
        return int1;
    }

}
