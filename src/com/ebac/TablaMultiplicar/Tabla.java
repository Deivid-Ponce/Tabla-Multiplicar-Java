package com.ebac.TablaMultiplicar;

import java.util.Scanner;

public class Tabla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero para la tabla de multiplicar");
        int numero = scanner.nextInt();
        System.out.println("La tabla de multiplicar es del numero: "+numero);
        for (int i = 0; i <=10 ; i++) {
            System.out.println(numero + " * "+i + " = "+(numero*i));
        }
        
}}
