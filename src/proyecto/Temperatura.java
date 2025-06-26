/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;
import java.util.Scanner;
/**
 *
 * @author brito
 */
public class Temperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        String ciudades[] = new String[5];
        Double minimas[] = new Double[5];
        Double maximas[] = new Double[5];
        Double maxima = Double.MIN_NORMAL;
        String ciudadMasCaliente = "";
        Double minima = Double.MAX_VALUE;
        String ciudadMasFria = "";
        int posMin = -1;
        
        for (int v1 = 0; v1 < ciudades.length; v1++) {
            System.out.println("Ingresa la ciudad numero " + (v1+1));
            ciudades[v1] = sc.nextLine();
            System.out.println("Ingresa la temperatura Minima de " + ciudades[v1]);
            minimas[v1] = sc.nextDouble();
            System.out.println("Ingresa la temperatura Maxima de " + ciudades[v1]);
            maximas[v1] = sc.nextDouble();
            System.out.println("------------------------------------------------------");
            sc.nextLine();
            
            //determinar la minima
            if (minimas[v1] < minima) {
                minima = minimas[v1];
                ciudadMasFria = ciudades[v1];
            }
            
            //dewterminar la maxima
            if (maximas[v1] > maxima) {
                maxima = maximas[v1];
                ciudadMasCaliente = ciudades[v1];
            }
            
        }
        
        // mostrar datos
        System.out.println("\nDatos de las temperaturas");
        for (int i = 0; i < ciudades.length; i++) {
            System.out.println("Ciudad: " + ciudades[i] + "\nTemperaturas Minimas " + minimas[i] + "°C" + "\nTemperaturas Maximas " + maximas[i]+ "°C");
            System.out.println("-----------------------------------");
        }
        
        // Ciudad mas caliente y mas fria
        System.out.println("------Resumen de temperaturas------");
        System.out.println("\nCiudad mas Caliente " + ciudadMasCaliente + " con la temperatura maxima de " + maxima +"°C");
        System.out.println("\nCiudad mas Fria " + ciudadMasFria + " con la temperatura minima de " + minima + "°C");
    }
    
}
