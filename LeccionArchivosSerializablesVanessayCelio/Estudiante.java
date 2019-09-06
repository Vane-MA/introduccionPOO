/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeccionArchivosSerializablesVanessayCelio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ITSLOJA
 */
public class Estudiante implements Serializable {

    private String nombre;
    private String apellido;
    private int edad;
    private double promedio;
    private Direccion direccion;
    private Curso curso;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, int edad, double promedio, Direccion direccion, Curso curso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.promedio = promedio;
        this.direccion = direccion;
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;

    }

    public void escribirEstudiante(String ruta, List<Estudiante> lista) {
        try {
            ObjectOutputStream ejemplo = new ObjectOutputStream(new FileOutputStream(ruta));
            ejemplo.writeObject(lista);
            ejemplo.close();
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }

    public List<Estudiante> leerEstudiante(String ruta) {
        List<Estudiante> lista = new ArrayList<>();
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(ruta));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Estudiante estudiante = (Estudiante) auxiliar;
                lista.add(estudiante);
                auxiliar = lector.readObject();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return lista;
    }

    public Estudiante Edadmenor(List<Estudiante> lista) {
        Estudiante edadmenor = lista.get(0);
        for (Estudiante estudiante : lista) {
            if (estudiante.getEdad() > edadmenor.getEdad()) {
                edadmenor = estudiante;
            }
        }
        return edadmenor;
    }

    public Estudiante mayorPromedio(List<Estudiante> lista) {
        Estudiante mayorpromedio = lista.get(0);
        for (Estudiante estudiante : lista) {
            if (estudiante.getPromedio() > mayorpromedio.getPromedio()) {
                mayorpromedio = estudiante;

            }
        }
        return mayorpromedio;
    }

    public Estudiante numeroEstudiante(List<Estudiante> lista) {
        Estudiante masEstudiantes = lista.get(0);
        for (Estudiante estudiante : lista) {
            if (estudiante.getCurso().getNumEstudiantes() > masEstudiantes.getCurso().getNumEstudiantes()) {
                masEstudiantes = estudiante;
            }

        }

        return masEstudiantes;
    }
//public Estudiante recorrerCiudad(List<Estudiante> lista){
//    HashMap<String, Integer>mapa = new HashMap<String,Integer>
//            for(Estudiante estudiante: lista){
//                mapa.put(estudiante.getDireccion().getCiudad(), mapa.getOrDefault(estudiante.getDireccion().getCiudad(),0)+)
//            }


    public static void main(String[] args) {
        Estudiante objeto = new Estudiante();
        Estudiante estudiante1 = new Estudiante("Carlos", "Valdez", 21, 8.5, new Direccion("Loja", "Venezuela y Pio Jaramillo", 10), new Curso("Software", "Programacion", 5, 16));
        Estudiante estudiante2 = new Estudiante("Ana", "Carrion", 17, 9.5, new Direccion("Zamora", "Francia y Sucre", 23), new Curso("Medicina", "Anatomia", 12, 22));
        Estudiante estudiante3 = new Estudiante("Maria", "Torres", 19, 7, new Direccion("Loja", "Bolivar y Azuay", 30), new Curso("Contabilidad", "Legislacion", 5, 26));
        Estudiante estudiante4 = new Estudiante("Felipe", "Dias", 17, 7.5, new Direccion("Machala", "Juan y Rocafuerte", 5), new Curso("Derecho", "Leyes Internacionales", 8, 34));
        Estudiante estudiante5 = new Estudiante("Jose", "Capa", 20, 8.5, new Direccion("Cuenca", "Panama y  Jaramillo", 8), new Curso("Sistemas", "Hadware", 8, 25));
        Estudiante estudiante6 = new Estudiante("Andres", "Cortez", 19, 9, new Direccion("Manabi", "Las Palmas y Macas", 21), new Curso("Comunicacion", "Lenguaje y Comunicacion", 9, 15));
        Estudiante estudiante7 = new Estudiante("Victor", "Maldonado", 23, 8.5, new Direccion("Zamora", "Diego Vaca y Chile", 52), new Curso("Psicologia", "Psicopedagogia", 9, 20));
        Estudiante estudiante8 = new Estudiante("Viviana", "Jaramillo", 22, 6, new Direccion("Loja", "Venezuela y Pio Jaramillo", 65), new Curso("Idiomas", "Frances", 10, 23));
        Estudiante estudiante9 = new Estudiante("Rosa", "Peres", 17, 8, new Direccion("Loja", "Mercadillo y 18 de Noviembre", 23), new Curso("Enfermeria", "Inyectologia", 6, 26));
        Estudiante estudiante10 = new Estudiante("Juan", "Jimenez", 18, 8.5, new Direccion("Loja", "10 de Agosto y Sucre", 36), new Curso("Arquitectura", "Diseño", 10, 28));
        List<Estudiante> lista = new ArrayList<>();
        lista.add(estudiante1);
        lista.add(estudiante2);
        lista.add(estudiante3);
        lista.add(estudiante4);
        lista.add(estudiante5);
        lista.add(estudiante6);
        lista.add(estudiante7);
        lista.add(estudiante8);
        lista.add(estudiante9);
        lista.add(estudiante10);
        List<Estudiante> l = objeto.leerEstudiante("C:\\Users\\ITSLOJA\\Desktop\\Estudiante.txt");

        objeto.escribirEstudiante("C:\\Users\\ITSLOJA\\Desktop\\Estudiante.txt", lista);
        objeto.leerEstudiante("C:\\Users\\ITSLOJA\\Desktop\\Estudiante.txt");
        System.out.println("El estudiante con menor edad es " + objeto.Edadmenor(lista).getEdad());
        System.out.println("El estudiante con mayor promedio es" + objeto.mayorPromedio(lista).getNombre());
        System.out.println("El curso con mayor numero de estudiantes es" + objeto.numeroEstudiante(lista).getCurso().getNumEstudiantes());
    }

}
