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
        this.name = nume;
        this.price = pret;
        this.amount = cantitate;
        this.availability = stoc;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getAmount() {
        return amount;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void afisare(){
        System.out.println("Nume mancare ["+getName()+"], pret["+getPrice()+"], cantitate["+getAmount()+" kg], stoc["+isAvailability()+"]");
    }
}
