package com.example.model;

import java.io.Serializable;

public class Persona implements Serializable {
    private String nombre, apellido;
    private int edad;

    public Persona(){} // hay que tener un constructor vacío
    
    public Persona(String nombre, String apellido, int edad){
    }

    // Getters y Setters para serializar y deserializar objetos
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
    
}
