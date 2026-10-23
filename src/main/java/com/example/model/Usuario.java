package com.example.model;

import java.io.Serializable;

public class Usuario implements Serializable{
    private int id;
    private String nombre, passwd;

    public Usuario(){}

    public Usuario(int id, String nombre, String passwd){
        this.id = id;
        this.nombre =  nombre;
        this.passwd = passwd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
    
}
