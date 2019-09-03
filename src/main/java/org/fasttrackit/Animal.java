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
        setName(unNume);
        setAge(oVarsta);
        setHealthLevel(nivelSanatate);
        setHungerLevel(nivelMancare);
        setMoodLevel(nivelStare);
        setPrefFood(mancarePref);
        setPrefActivity(activitateaPref);
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
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public void setMoodLevel(int moodLevel) {
        this.moodLevel = moodLevel;
    }

    public void setPrefFood(String prefFood) {
        this.prefFood = prefFood;
    }

    public void setPrefActivity(String prefActivity) {
        this.prefActivity = prefActivity;
    }

    public void afisare(){
        System.out.println("Nume animal ["+getName()+"], varsta ["+getAge()+"], nivel sanatate ["+getHealthLevel()+"], nivel mancare ["+getHungerLevel()+"], nivel stare ["+getMoodLevel()+"], mancare preferata ["+getPrefFood()+"], activitate preferata ["+getPrefActivity()+"]");
    }
}
