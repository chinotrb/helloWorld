package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PerimetroAreaDelCuadrado();
    }

    public static void PerimetroAreaDelCuadrado() {
        Scanner teclado  = new Scanner(System.in);

        System.out.print("Digite la medida del lado: ");
        int medidaLado = teclado.nextInt();

        System.out.print("el perimetro es: ");
        System.out.println(medidaLado * 4);

        System.out.print("EL area es:");
        System.out.print(medidaLado * medidaLado);


    }

    public static void SumaDeNumeros(){
        Scanner teclado = new Scanner(System.in);

        System.out.print("escriba el primer numero");
        int primerNumero = teclado.nextInt();

        System.out.print("escriba el segundo numero");
        int segundoNumero = teclado.nextInt();

        System.out.print("la suma de los numeros es:");
        System.out.print(primerNumero + segundoNumero);

    }
}
