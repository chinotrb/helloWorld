package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     	System.out.print("escriba el primer numero");
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();

        System.out.print("escriba el segundo numero");
        Scanner teclado2 = new Scanner(System.in);
        int dijito = teclado2.nextInt();

        System.out.print("la suma de los numeros es:");
        System.out.print(numero + dijito);

    }
}
