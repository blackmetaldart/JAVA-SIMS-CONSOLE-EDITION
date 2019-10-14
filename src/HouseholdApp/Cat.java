package HouseholdApp;

public class Cat extends Pet {

    @Override
    public void feedPet(){
        System.out.println("Cat just ate its food." );
    }

    @Override
    public void groomPet(){
        System.out.println("Cat is so clean now!");
    }

    @Override
    public void playWithPet(){
        System.out.println("Cat just played with laser pointer!");
    }
}
