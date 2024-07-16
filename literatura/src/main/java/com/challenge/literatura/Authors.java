package com.challenge.literatura;

// Clase Author para representar los autores

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Authors {
    private String name;
    private Long birth_year;
    private Long death_year; // Long para permitir null


    // Getters y setters

    public long getBirthYear() {
        return birth_year;
    }

    public void setBirthYear(Long birth_year) {
        this.birth_year = birth_year;
    }

    public Long getDeath_year() {
        return death_year;
    }

    public void setDeathYear(Long death_year) {
        this.death_year = death_year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Constructor, etc.
    @JsonCreator
    public Authors(@JsonProperty("birth_year") Long birth_year,
                   @JsonProperty("death_year") Long death_year,
                   @JsonProperty("name") String name) {

        this.birth_year = birth_year;
        this.death_year = death_year;
        this.name = name;

    }

    @Override
    public String toString() {
        return "Authors{" +
                "name='" + name + '\'' +
                ", birth_year=" + birth_year +
                ", death_year=" + death_year +
                '}';
    }

    public Authors() {
    }
}