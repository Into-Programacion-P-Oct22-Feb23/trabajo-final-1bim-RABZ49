/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.problema07;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author roberto
 */
public class Problema07 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
    int dato1 ;
    int contador = 0;
    int total;
    String mensaje2 = "Error";
    String mensaje1 = "El numero ingresado es impar";
    System.out.println("ingrese un numero entero mayor o igual a 2:");
    dato1 = entrada.nextInt();
    if (dato1 >= 2){
        if (dato1 % 2 == 1){
            System.out.println(mensaje1);
        }else{
            while (contador <= dato1){
                contador = contador + 1;
                if (contador % 2 == 0){
                    System.out.printf("\n->%s",contador);
                }
            }
        }
    }else{
        System.out.println(mensaje2);
    }
        }
    }
    


