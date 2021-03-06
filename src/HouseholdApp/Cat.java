package HouseholdApp;

public class Cat extends Pet {

    //OVERRIDING THE METHODS FROM THE ABSTRACT CLASS TO DEFINE THEM
    @Override
    public void feedPet(){
        System.out.println("The cat just ate its food." );
    }

    @Override
    public void groomPet(){
        System.out.println("The cat is so clean now!");
    }

    @Override
    public void playWithPet(){
        System.out.println("The cat just played with the laser pointer!");
    }
}
