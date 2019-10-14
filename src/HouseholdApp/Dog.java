package HouseholdApp;

public class Dog extends Pet {


    @Override
    public void feedPet(){
        System.out.println("Dog just ate its food." );
    }

    @Override
    public void groomPet(){
        System.out.println("Dog so clean now!");
    }

    @Override
    public void playWithPet(){
        System.out.println("Dog just played fetch.");
    }
}
