/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computador;

/**
 *
 * @author ITS_LOJA
 */
public class sistBici {
    
   private double costo;
   private String modelo;
   private String marca;
   public String color;
   private boolean tamaño;
   
   public void moverBicicleta(){
            System.out.println("Bienvenido soy la bicleta y me puedo mover");
}
   public void alquilarBicicleta(){
       System.out.println("Bienvenido soy la bicleta y me puedo alquilar");
   }
   public void armarBicicleta(){
       System.out.println("Bienvenido soy la bicleta y me puedo armar");
   }
   public void repararBicicleta(){
       System.out.println("Bienvenido soy la bicleta y me puedo reparar");
   }
   
   public void imprimirInformacion(String Info){
       System.out.println(Info);
   }
    public static void main(String[] args) {
        sistBici primerobjeto = new sistBici();
        primerobjeto.alquilarBicicleta();
        primerobjeto.imprimirInformacion("Gracias por visitarnos");
    }
}

