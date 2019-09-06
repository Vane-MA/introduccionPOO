/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeccionArchivosSerializablesVanessayCelio;

import java.io.Serializable;

/**
 *
 * @author ITSLOJA
 */
public class Direccion implements Serializable {
    private String ciudad;
    private String calle;
    private int numCasa;

    public Direccion() {
    }

    public Direccion(String ciudad, String calle, int numCasa) {
        this.ciudad = ciudad;
        this.calle = calle;
        this.numCasa = numCasa;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumCasa() {
        return numCasa;
    }

    public void setNumCasa(int numCasa) {
        this.numCasa = numCasa;
    }

}
