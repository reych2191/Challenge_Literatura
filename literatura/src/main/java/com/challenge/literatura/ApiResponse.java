package com.challenge.literatura;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

// Clase contenedora para la respuesta JSON
public class ApiResponse {
    private int count;
    private String next;
    private String previous;
    private List<Book> results;

    // Getters y setters


    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Book> getResults() {
        return results;
    }

    public void setResults(List<Book> results) {
        this.results = results;
    }

    @JsonCreator
    public ApiResponse(@JsonProperty("count") int count,
                       @JsonProperty("next") String next,
                       @JsonProperty("previous") String previous,
                       @JsonProperty("results") List<Book> results) {
        this.count = count;
        this.next = next;
        this.previous = previous;
        this.results = results;
    }
}