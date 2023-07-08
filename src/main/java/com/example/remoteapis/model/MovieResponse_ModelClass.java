package com.example.remoteapis.model;

public class MovieResponse_ModelClass {
    private int budget;
    private String imdb_id;
    private String original_title;
    private String random;  // we will get null for the attribute ,,becoz the response which we are getting, doesn't have random in it.

    public MovieResponse_ModelClass() {
    }

    public MovieResponse_ModelClass(int budget, String imdb_id, String original_title, String random) {
        this.budget = budget;
        this.imdb_id = imdb_id;
        this.original_title = original_title;
        this.random = random;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public String getImdb_id() {
        return imdb_id;
    }

    public void setImdb_id(String imdb_id) {
        this.imdb_id = imdb_id;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public String getRandom() {
        return random;
    }

    public void setRandom(String random) {
        this.random = random;
    }
}
