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
        animal.afisare();
        Adopter adop = new Adopter("Andrei",120.5);
        adop.afisare();
        AnimalFood af = new AnimalFood("Crochete de peste",56.7,120,true);
        af.afisare();
        RecreationalActivity ra = new RecreationalActivity("Plimbare prin parc");
        ra.afisare();
        Vet veterinar = new Vet("Pisti","Chirurg");
        veterinar.afisare();


    }
}
