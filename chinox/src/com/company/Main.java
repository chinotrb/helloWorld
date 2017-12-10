package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        SumaDeNumeros();



    }

    public static void SumaDeNumeros(){
        Scanner teclado = new Scanner(System.in);

        System.out.print("escriba el primer numero: ");
        int primerNumero = teclado.nextInt();

        System.out.print("escriba el segundo numero: ");
        int segundoNumero = teclado.nextInt();

        System.out.print("la suma de los numeros es: ");
        System.out.println(primerNumero + segundoNumero);

        System.out.print("Escriba un numero: ");
        int terserNumero = teclado.nextInt();

        System.out.print("escriba un numero: ");
        int cuartoNumero = teclado.nextInt();

        System.out.print("la multiplicasion del terser y cuarto numero es: ");
        System.out.print(terserNumero * cuartoNumero);



    }}







