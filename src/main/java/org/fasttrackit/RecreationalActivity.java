package org.fasttrackit;

public class RecreationalActivity {
    private String name;

    public RecreationalActivity(String nume){
        this.name = nume;
    }

    public String getName() {
        return name;
    }
    public void afisare(){
        System.out.println("Nume activitate de recreere ["+getName()+"]");
    }
}
