package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     	Scanner teclado = new Scanner(System.in);
        
        System.out.print("escriba el primer numero");        
        int primerNumero = teclado.nextInt();

        System.out.print("escriba el segundo numero");        
        int segundoNumero = teclado.nextInt();

        System.out.print("la suma de los numeros es:");
        System.out.print(primerNumero + segundoNumero);
    }
}
