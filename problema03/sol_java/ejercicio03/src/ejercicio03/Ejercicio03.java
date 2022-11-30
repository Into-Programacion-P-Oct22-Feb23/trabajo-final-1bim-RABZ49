/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        int tipoEmpleado;
        int horasTrabajadas;
        double total = 0;
        double costoHora;
        double salario;

        System.out.println("Ingrese su nombre: ");
        nombre = entrada.nextLine();

        System.out.println("Ingrese el tipo de empleado: ");
        tipoEmpleado = entrada.nextInt();

        System.out.println("Ingrese las horas trabajadas: ");
        horasTrabajadas = entrada.nextInt();

        System.out.println("Ingrese la cuota a pagar por hora: ");
        costoHora = entrada.nextDouble();

        salario = costoHora * horasTrabajadas;

        if (tipoEmpleado == 1) {
            total = costoHora * 1.5;
            salario = total * horasTrabajadas;
        } else if (tipoEmpleado == 2) {
            total = costoHora * 2;
            salario = total * horasTrabajadas;
        } else if (tipoEmpleado == 3) {
            total = costoHora * 2.5;
            salario = total * horasTrabajadas;
        } else if (tipoEmpleado == 4) {
            total = costoHora * 3;
            salario = total * horasTrabajadas;
        } else {

        }
        System.out.printf("El empleado %s que es de tipo %d tiene un "
                + "salario final de %.2f dólares\n",
                nombre,
                tipoEmpleado,
                total);
    }

}

    