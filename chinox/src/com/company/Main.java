package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     	Scanner teclado = new Scanner(System.in);
        
        System.out.print("escriba el primer numero");        
        int numero = teclado.nextInt();

        System.out.print("escriba el segundo numero");        
        int dijito = teclado.nextInt();

        System.out.print("la suma de los numeros es:");
        System.out.print(numero + dijito);

    }
}
