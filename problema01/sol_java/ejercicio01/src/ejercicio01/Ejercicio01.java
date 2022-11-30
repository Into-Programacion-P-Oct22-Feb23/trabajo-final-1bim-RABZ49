/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author Usuario iTC
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double angulo;
        String acumulador = "";
        int contador = 0;
        
        while (contador < 3 ) {
            System.out.println("Ingrese el tamaño del ángulo:");
            angulo = entrada.nextDouble();
            
            contador = contador + 1;
            
            if (angulo == 90){
               acumulador = acumulador + "El ángulo tiene un tamaño de: " 
                       + angulo  + " por lo tanto es recto" + "\n";
               }else {
                if (angulo > 90 && angulo < 180 ){ 
                acumulador = acumulador + "El ángulo tiene un tamaño de: " 
                       + angulo  + " por lo tanto es obtusángulo" + "\n";  
                    }else { 
                       if (angulo < 90 ){ 
                        acumulador = acumulador + "El ángulo tiene un tamaño de " 
                        + angulo  + " por lo tanto es acutángulo" + "\n";                     
        }   
        }
    }
    }
        System.out.printf("Respuesta:\n%s", acumulador);
}
}