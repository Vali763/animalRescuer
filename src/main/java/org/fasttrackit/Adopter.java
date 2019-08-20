package org.fasttrackit;

public class Adopter {
    private String name;
    private double money;

    public Adopter(String nume, double bani){
        this.name = nume;
        this.money = bani;

    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }
}
