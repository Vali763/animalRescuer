package org.fasttrackit;

public class Animal {

    private String name;
    private int age;
    private int healthLevel;
    private int hungerLevel;
    private int moodLevel;
    private String prefFood;
    private String prefActivity;

    public Animal(String unNume, int oVarsta, int nivelSanatate, int nivelMancare, int nivelStare, String mancarePref,String activitateaPref )
    {
        this.name = unNume;
        this.age = oVarsta;
        this.healthLevel = nivelSanatate;
        this.hungerLevel = nivelMancare;
        this.moodLevel = nivelStare;
        this.prefFood = mancarePref;
        this.prefActivity = activitateaPref;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public int getMoodLevel() {
        return moodLevel;
    }

    public String getPrefFood() {
        return prefFood;
    }

    public String getPrefActivity() {
        return prefActivity;
    }

    public void afisare(){
        System.out.println("Nume animal ["+getName()+"], varsta ["+getAge()+"], nivel sanatate ["+getHealthLevel()+"], nivel mancare ["+getHungerLevel()+"], nivel stare ["+getMoodLevel()+"], mancare preferata ["+getPrefFood()+"], activitate preferata ["+getPrefActivity()+"]");
    }
}
