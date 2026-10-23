package com.example;

import java.io.File;
import java.util.List;
import java.util.Map;

import com.example.model.Usuario;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) {
        /*
         * Persona persona1 = new Persona(null, null, 0);
         * Persona persona2 = new Persona(null, null, 0);
         * 
         * File file = new File("Personas.json");
         * List<Persona> lista = List.of(persona1, persona2);
         * 
         * File fichero = new
         * File("src\\main\\java\\com\\example\\data\\personas.json");
         * File fichero2 = new
         * File("src\\main\\java\\com\\example\\data\\personas2.json");
         * 
         * ObjectMapper mapper = new ObjectMapper();
         * 
         * try {
         * mapper.writerWithDefaultPrettyPrinter().writeValue(fichero, lista);
         * mapper.writeValue(fichero2, lista);
         * String s = mapper.writeValueAsString(lista);
         * System.out.println(s);
         * } catch (Exception e) {
         * e.printStackTrace();
         * }
         * 
         * try {
         * Persona [] array = mapper.readValue(fichero2, Persona[].class);
         * List<Persona> aList = List.of(array);
         * for (Persona p : aList) {
         * System.out.println(p.getNombre());
         * }
         * List<Persona> lista2 = mapper.readValue(fichero2, new
         * TypeReference<List<Persona>>() {});
         * for (Persona p : aList) {
         * System.out.println(p.getNombre());
         * }
         * } catch (Exception e) {
         * e.printStackTrace();
         * }
         */

        guardarJSON();
        leerJSON();
    }

    public static void guardarJSON() {
        Usuario user1 = new Usuario(1234, "Claudia", "password");
        Usuario user2 = new Usuario(4321, "Claudia", "password");

        List<Usuario> listaUsers = List.of(user1, user2);
        Map<Integer, Usuario> mapaUsers = Map.of(
                user1.getId(), user1,
                user2.getId(), user2);

        File fileUser = new File("user1.json");
        File fileListaUsers = new File("listaUsers.json");
        File fileMapa = new File("mapaUsers.json");

        ObjectMapper mapper = new ObjectMapper();

        try {
            // String s = mapper.writeValueAsString(listaUsers);

            // Escribe Usurario 1 en User1.json
            mapper.writerWithDefaultPrettyPrinter().writeValue(fileUser, user1);

            // Escribe la lista de usuarios en listaUsers.json
            mapper.writerWithDefaultPrettyPrinter().writeValue(fileListaUsers, listaUsers);

            // Escribe el mapa en mapaUsers.json
            mapper.writerWithDefaultPrettyPrinter().writeValue(fileMapa, mapaUsers);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void leerJSON(){
        File fileUser = new File("user1.json");
        File fileListaUsers = new File("listaUsers.json");
        File fileMapa = new File("mapaUsers.json");

        ObjectMapper mapper = new ObjectMapper();

        try {
            // Lee el archivo1
            //mapper.readValue(fileUser, Usuario.class);

            // Lee el archivoLista
            //mapper.readValue(fileListaUsers, Usuario.class);

            //mapper.readValue(fileMapa, Usuario.class);

            Usuario userr = mapper.readValue(fileUser, Usuario.class);
            System.out.println("Id: " + userr.getId());
            System.out.println("Nombre: " + userr.getNombre());
            System.out.println("Password: " + userr.getPasswd());

            Usuario[] listaU = mapper.readValue(fileListaUsers, Usuario[].class);
            System.out.println("Id: " + userr.getId());
            System.out.println("Nombre: " + userr.getNombre());
            System.out.println("Password: " + userr.getPasswd());

            Map<Integer, Usuario> mapa2 = mapper.readValue(fileMapa, new TypeReference<Map<Integer, Usuario>>(){});
            for (Entry<Integer, Usuario> entry : mapa2.entrySet()){

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}