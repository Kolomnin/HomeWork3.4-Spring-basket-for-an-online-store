package com.homework.onlinestore.springonlinestorebasket.model;

public class Sample {

    private final int id;

    public Sample(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Sample{" +
                "id=" + id +
                '}';
    }
}



