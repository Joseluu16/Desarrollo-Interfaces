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
  private  String nombre;
  private String Apellido;
  private  int edad;

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


    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", Apellido=" + Apellido + ", edad=" + edad + '}';
    }
    
}
