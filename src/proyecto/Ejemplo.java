/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author brito
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String vector[] = new String [8];
        
        vector[0] = "Elmer";
        vector[1] = "Ernesto";
        vector[2] = "Brito";
        vector[3] = "Rodriguez";
        vector[4] = "Vanessa";
        vector[5] = "Esmeralda";
        vector[6] = "Ruano";
        vector[7] = "Ceron";
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("----------------------------");
            System.out.println("--                        --");
            System.out.println("--     "+vector[i]);
            System.out.println("--                        --");
            System.out.println("----------------------------");
        }
    }
    
}
