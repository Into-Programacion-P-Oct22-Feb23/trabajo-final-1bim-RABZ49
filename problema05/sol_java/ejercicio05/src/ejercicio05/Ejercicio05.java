/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double x;
        double y;
        
        System.out.println("Ingrese el valor de X: ");
        x = entrada.nextDouble();
        System.out.println("Ingrese el valor de Y: ");
        y = entrada.nextDouble();
        
        if (x >= 0 && y >= 0){
            System.out.print("El valor pertenece al cuadrante 1.\n");
        }else if(x < 0 && y >= 0){
            System.out.print("El valor pertenece al cuadrante 2.\n");
        }else if(x < 0 && y < 0){
            System.out.print("El valor pertenece al cuadrante 3.\n");
        }else{
            System.out.print("El valor pertenece al cuadrante 4.\n");
        }
    }
    
}