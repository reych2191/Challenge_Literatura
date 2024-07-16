package com.challenge.literatura;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Book {
    private Long id;
    private String title;
    private List<String> subjects;
    private List<Authors> authors;
    //private List<String> translators;
    private List<String> bookshelves;
    private List<String> languages;
    private String mediaType;
    private Long downloadCount;

    // Constructor, getters y setters
    @JsonCreator
    public Book(@JsonProperty("id") Long id,
                @JsonProperty("title") String title,
                @JsonProperty("subjects") List<String> subjects,
                @JsonProperty("authors") List<Authors> authors,
                //@JsonProperty("translators") List<String> translators,
                @JsonProperty("bookshelves") List<String> bookshelves,
                @JsonProperty("languages") List<String> languages,
                @JsonProperty("media_type") String mediaType,
                @JsonProperty("download_count") Long downloadCount) {
        this.id = id;
        this.title = title;
        this.subjects = subjects;
        this.authors = authors;
        //this.translators = translators;
        this.bookshelves = bookshelves;
        this.languages = languages;
        this.mediaType = mediaType;
        this.downloadCount = downloadCount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public List<Authors> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Authors> authors) {
        this.authors = authors;
    }

    //public List<String> getTranslators() {
        //return translators;
    //}

   // public void setTranslators(List<String> translators) {
       // this.translators = translators;
   // }

    public List<String> getBookshelves() {
        return bookshelves;
    }

    public void setBookshelves(List<String> bookshelves) {
        this.bookshelves = bookshelves;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public long getDownloadCount() {
        return downloadCount;
    }

    public void setDownloadCount(Long downloadCount) {
        this.downloadCount = downloadCount;
    }

    // Aquí podrías añadir más métodos según tus necesidades

    public Book() {
    }
}