package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Animal animal = new Animal("Felix",2,10,5,7,"Crochete de peste","Dormitul");
        System.out.println("Nume animal ["+animal.getName()+"], varsta ["+animal.getAge()+"], nivel sanatate ["+animal.getHealthLevel()+"], nivel mancare ["+animal.getHungerLevel()+"], nivel stare ["+animal.getMoodLevel()+"], mancare preferata ["+animal.getPrefFood()+"], activitate preferata ["+animal.getPrefActivity()+"]");
        Adopter adop = new Adopter("Andrei",120.5);
        System.out.println("Nume adoptator: "+adop.getName()+", avand bugetul de: "+adop.getMoney()+" RON");
        AnimalFood af = new AnimalFood("Crochete de peste",56.7,120,true);
        System.out.println("Nume mancare ["+af.getName()+"], pret["+af.getPrice()+"], cantitate["+af.getAmount()+" kg], stoc["+af.isAvailability()+"]");
        RecreationalActivity ra = new RecreationalActivity("Plimbare prin parc");
        System.out.println("Nume activitate de recreere ["+ra.getName()+"]");
        Vet veterinar = new Vet("Pisti","Chirurg");
        System.out.println("Nume veterinar: "+veterinar.getName()+" cu specializarea: "+veterinar.getSpecialization());


    }
}
