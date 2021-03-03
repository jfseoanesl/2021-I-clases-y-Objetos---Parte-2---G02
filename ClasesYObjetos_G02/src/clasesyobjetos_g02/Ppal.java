/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesyobjetos_g02;

import java.util.Scanner;

/**
 *
 * @author jairo
 */
public class Ppal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        Rectangulo r = new Rectangulo();
        
        System.out.print("Lea Base: ");
        double base= entrada.nextDouble();
        r.setBase(base);
        
        r.setAltura(12);
        System.out.println("Base: " + r.getBase());
        System.out.println("Altura: " + r.getAltura());
        System.out.println("Area: " + r.calcularArea());
        System.out.println("Perimetro: "+r.calcularPerimetro());
       
        
    }
    
}
