/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.problema09;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author roberto
 */
public class Problema09 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int positivos = 0;
        int termino1 = 12;
        int negativos = 0;
        int termino2 = -11;
        int contador = 1;
        int numero;
        String mensaje = "";

        String serie = "S1 = 12-11+24-22+36-33+48-44";
        System.out.print("""
                         Ingrese el numro de terminos a imprimir:
                         """ + serie + "\n--> ");
        numero = entrada.nextInt();

        if (numero <= 8) {
            while (contador <= numero) {
                if (numero == 1) {
                    mensaje = mensaje + termino1;
                } else if (contador % 2 == 1) {
                    positivos = positivos + termino1;
                    mensaje = mensaje + "+" + Integer.toString(positivos);
                } else if (contador % 2 == 0) {
                    negativos = negativos + termino2;
                    mensaje = mensaje + Integer.toString(negativos);
                }
                contador = contador + 1;
            }
        } else {
            System.out.println("El numero ingresado exede el limite de "
                    + "datos de la serie.");
        }
        System.out.println(mensaje);

    }

}
