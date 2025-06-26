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
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner sc = new Scanner(System.in);
      
      Double matriz[][] = new Double[4][4];
      Double promedio = 0.0;
      
      
      for (int f = 0; f < (matriz.length); f++) {
          for (int c = 0; c < (matriz.length-1); c++) {
              System.out.println("Ingrese la nota " + (c+1) + " del alumno " + (f+1));
              matriz[f][c] =  sc.nextDouble();
              promedio = promedio + (matriz[f][c]);
          }          
          matriz[f][3] = promedio / 3;
          promedio = 0.0;
      }
      
      for (int i = 0; i < (matriz.length); i++) {
          System.out.println("La nota del promedio  " + (i+1) + " es: " );
          for (int c = 0; c < (matriz.length-1); c++) {
           System.out.println("Nota " + (c+1) + " son " + matriz[i][c]);   
          }
          System.out.println("El promedio de la nota es: " + matriz[i][3]);
          System.out.println("------------------------------------------");
      }
      
    }
    
    
}
