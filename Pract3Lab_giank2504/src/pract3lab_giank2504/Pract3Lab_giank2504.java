/*
 25/04/2016
Ingridt Rodríguez
Laboratorio N°1         Problema 3
 */
package pract3lab_giank2504;

import java.util.Scanner;

public class Pract3Lab_giank2504 {

    public static void main(String[] args) {
        String nom;
        int edad, hora, horastr, horaext;
        float xhora,salbr, salne, deduc;
        
        Scanner en = new Scanner(System.in);

        System.out.print("Introduzca nombre del empleado: ");
        nom=en.nextLine();
        
        System.out.print("Introduzca edad del empleado: ");
        edad=en.nextInt();
        
        System.out.print("Tarifa por hora: ");
        xhora=en.nextFloat();
        
        System.out.print("Horas trabajadas: ");
        horastr=en.nextInt();
        
        System.out.print("Horas extra: ");
        horaext=en.nextInt();
        
        salbr=(float) ((horastr+(1.5*horaext))*xhora);
        deduc=(float) (salbr*0.089);
        salne=(float) (salbr-deduc);
        
        System.out.print("\nEmpleado: "+nom+"        Edad: " + edad+ "\nSalario bruto= "+salbr+"\nDeducciones="+deduc+ "\nSalario Neto= "+ salne);
        
    }   
}
