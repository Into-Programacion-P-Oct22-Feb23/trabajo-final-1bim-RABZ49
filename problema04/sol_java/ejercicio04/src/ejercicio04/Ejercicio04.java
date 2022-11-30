/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int numero1;
        int numero2;
        int numero3;
        int Mayor;

        
        System.out.println("Ingrese un número");
        numero1 = entrada.nextInt();
        System.out.println("Ingrese un número");
        numero2 = entrada.nextInt();
        System.out.println("Ingrese un número");
        numero3 = entrada.nextInt();
        
        if (numero1 == numero2){
            System.out.println("Error. hay numeros iguales");
            System.out.println("Ingrese un número");
            numero1 = entrada.nextInt();
            }else{
               if (numero2 == numero3){
                System.out.println("Error. hay numeros iguales");
                System.out.println("Ingrese un número");
                numero2 = entrada.nextInt(); 
               }else{
                   if (numero1 == numero3){
                       System.out.println("Error. hay numeros iguales");
                       System.out.println("Ingrese un número");
                       numero3 = entrada.nextInt(); 
                       
                   }
               }
            
        }
   
        if(numero1 > numero2){
            Mayor = numero1;
        }else{ 
            Mayor = numero2;
        }
        if (Mayor > numero3){
            Mayor = Mayor;
            }else{
            Mayor = numero3;
        }
         System.out.printf("El número mayor es: %d\n", Mayor);
             
    }
    
}
