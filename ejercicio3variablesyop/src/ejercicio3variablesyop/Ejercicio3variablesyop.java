/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3variablesyop;

/**
 *@version 1.0
 * @author Dairo Estiben Beltran Martinez
 * Este programa permite hallar el area de un circulo con una variable preestablecida
 */
class AreaCirculo{
    double pi = 3.1416;
    double area;
    //Funcion que permite hallar el area del circulo, la 
    //cual recibe parámetros
    void hallarArea(int r){
        area = pi*(r*r);
    }
}
public class Ejercicio3variablesyop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int r = 18;
        AreaCirculo circulo = new AreaCirculo();
        System.out.println("El radio del circulo es: "+r);
        circulo.hallarArea(r);
        System.out.println("El Area del circulo es: "+circulo.area);
    }
    
}
