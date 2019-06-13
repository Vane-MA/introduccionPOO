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
public class Computador {
// decalro atributos
    private int año;
    private String modelo;
    private String marca;
    private double procesador;
    private boolean portatil;
//declaro metodos
    public void guardarInformacion() {
        System.out.println("Hola soy la computadora guardo informacion");

    }
    public void ImprimirInformacion(String Info) {
        System.out.println(Info);
    }

    public void leerInformacion() {
        System.out.println("Hola soy la computadora leo informacion");
    }
    
    public static void main(String[] args) {
        Computador primerobjeto = new Computador();//primer objeto creado
        primerobjeto.guardarInformacion();//llama a un metodo
        primerobjeto.ImprimirInformacion("HOLA");
        primerobjeto.ImprimirInformacion("CHAO");
    }
}
