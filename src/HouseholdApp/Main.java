package HouseholdApp;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Sims : Console Edition!");
        System.out.println("We're going to create two households.");
        Scanner userInput = new Scanner(System.in);

        //THESE ARE THE ATTRIBUTES USED IN THE APPLICATION
        int income = 0;
        String name;
        Dog dog = new Dog();
        Cat cat = new Cat();

        //THIS ARRAY LIST INSTANTIATES THE HOUSEHOLDS AND ADDS THEM TO THE PLAZA
        ArrayList<Household> Plaza = new ArrayList<>();
        Household house1 = new Household(income, dog);
        Household house2 = new Household(income, cat);
        Plaza.add(house1);
        Plaza.add(house2);



        //THIS IS AN ENHANCED FOR LOOP TO RUN THROUGH THE HOUSEHOLDS
        for (Household counter: Plaza) {
            System.out.println("Please enter the income for the household.");
            counter.income = userInput.nextInt();
            System.out.println("You had to pay your taxes!");
            counter.income = counter.payTaxes(counter.income);
            System.out.println("Your new income is " + counter.income + ".");
            System.out.println("Oop! Your pet is sick! Time to cake care of it.");
            counter.pet.feedPet();
            counter.pet.groomPet();
            counter.pet.playWithPet();
            System.out.println("Now the family can live happily ever after!");

        }

        System.out.println("That's all folks!!");
    }

}

