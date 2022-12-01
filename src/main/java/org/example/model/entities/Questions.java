package org.example.model.entities;

public class Questions {
    private int id;
    private String text;

    public Questions(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }
}
