package HouseholdApp;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Sims : Console Edition!");
        System.out.println("We're going to create two households.");
        Scanner userInput = new Scanner(System.in);


        int income = 0;
        String name;
        Dog Sam = new Dog();
        Cat Frank = new Cat();

        ArrayList<Household> Plaza = new ArrayList<>();
        Household house1 = new Household(income, Sam);
        Household house2 = new Household(income, Frank);
        Plaza.add(house1);
        Plaza.add(house2);




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

