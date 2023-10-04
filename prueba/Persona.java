/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema1.prueba;

/**
 *
 * @author jolun
 */
public class Persona {
    String nombre;
    String Apellido;
    int edad;

    public Persona(String nombre, String Apellido, int edad) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }  
}
