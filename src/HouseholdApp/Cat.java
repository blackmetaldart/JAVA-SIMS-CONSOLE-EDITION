package HouseholdApp;

public class Cat extends Pet {

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
