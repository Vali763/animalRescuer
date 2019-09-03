package org.fasttrackit;

public class Adopter extends Person {
    private double money;

    public Adopter(String name, double money) {
        super(name);
        this.money = money;
    }
    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void afisare(){
        System.out.println("Nume adoptator: "+getName()+", avand bugetul de: "+getMoney()+" RON");
    }


}
