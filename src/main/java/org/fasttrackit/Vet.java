package org.fasttrackit;

public class Vet extends Person {

    private String specialization;

    public Vet(String name, String specializare){
        super(name);
        this.specialization = specializare;
    }
    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void afisare(){
        System.out.println("Nume veterinar: "+getName()+" cu specializarea: "+getSpecialization());
    }

}
