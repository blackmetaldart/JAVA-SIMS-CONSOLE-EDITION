package HouseholdApp;

public class Dog extends Pet {

    //OVERRIDING THE METHODS FROM THE ABSTRACT CLASS TO DEFINE THEM
    @Override
    public void feedPet(){
        System.out.println("The dog just ate its food." );
    }

    @Override
    public void groomPet(){
        System.out.println("The dog is so clean now!");
    }

    @Override
    public void playWithPet(){
        System.out.println("The dog just played fetch.");
    }
}
