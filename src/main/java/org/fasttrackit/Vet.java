package org.fasttrackit;

public class Vet {
    private String name;
    private String specialization;

    public Vet(String nume, String specializare){
        this.name = nume;
        this.specialization = specializare;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }
}
