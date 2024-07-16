package com.challenge.literatura;
import com.fasterxml.jackson.core.JsonProcessingException;
//import com.google.gson.GsonBuilder;
//mport com.google.gson.Gson;
//import com.google.gson.FieldNamingPolicy;
import com.challenge.literatura.service.ConsumoApi;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;
import java.util.List;

public class Logica {


    public List Logica(String busqueda) throws JsonProcessingException {
        // try {
        // Convertir el JSON en una lista de objetos Book
        ConsumoApi consumoapi = new ConsumoApi();
        ObjectMapper objectMapper = new ObjectMapper();
        ApiResponse response = objectMapper.readValue(consumoapi.obtenerDatos(busqueda), ApiResponse.class);
        List<Book> books = response.getResults();

        // Acceder a los libros y sus propiedades
        //for (Book book : books) {
        //System.out.println("Title: " + book.getTitle());
        //System.out.println("Authors: " + book.getAuthors());
        //System.out.println("Subjects: " + book.getSubjects());
        // Aquí puedes continuar accediendo a otros atributos según sea necesario
        //}
        //  } catch (
        // IOException e) {
        //    e.printStackTrace();
        // }

        return books;
    }
}


