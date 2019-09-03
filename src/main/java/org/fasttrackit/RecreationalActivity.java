package org.fasttrackit;

public class RecreationalActivity {
    private String name;

    public RecreationalActivity(String nume){

        setName(nume);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void afisare(){
        System.out.println("Nume activitate de recreere ["+getName()+"]");
    }
}
