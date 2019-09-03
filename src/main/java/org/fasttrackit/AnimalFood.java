package org.fasttrackit;
import javax.swing.*;
import java.util.Date;

import java.util.Date;

public class AnimalFood {
    private String name;
    private double price;
    private double amount;
    private boolean availability;

    public AnimalFood(String nume, double pret, double cantitate, boolean stoc){
        setName(nume);
        setPrice(pret);
        setAmount(cantitate);
        setAvailability(stoc);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public void afisare(){
        System.out.println("Nume mancare ["+getName()+"], pret["+getPrice()+"], cantitate["+getAmount()+" kg], stoc["+isAvailability()+"]");
    }
}
