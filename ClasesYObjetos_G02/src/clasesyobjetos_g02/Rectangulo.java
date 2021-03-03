/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesyobjetos_g02;

/**
 *
 * @author jairo
 */
public class Rectangulo {
    
    // atributos
    private double base;
    private double altura;
    
    // constructor
    public Rectangulo(){
       this.base=5;
       this.altura=10;
    }
    
    //getters y setters
    public double getBase(){
        return this.base;
    }
    
    public double getAltura(){
        return this.altura;
    }
    
    public void setBase(double b){
        this.base = b;
    }
    
    public void setAltura(double altura){
        this.altura=altura;
    }
    
    // metodos miembros
    
    public double calcularArea(){
        return this.base * this.altura;
    }
    public double calcularPerimetro(){
        return 2*(this.base+this.altura);
    }
    
}
