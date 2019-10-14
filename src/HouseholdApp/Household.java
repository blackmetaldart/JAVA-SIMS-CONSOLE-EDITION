package HouseholdApp;

public class Household {

    //THE ATTRIBUTES FOR THE HOUSEHOLD
    public int income;
    Pet pet;

    //THE CONSTRUCTOR FOR THE APPLICATION
    Household(int income,  Pet pet){
        this.income = income;
        this.pet = pet;
    }

    //ONLY USING SETTERS FOR THE PURPOSE OF THE APPLICATOIN
    public void setIncome(int income){
        this.income = income;
    }
    public void setAnimal(Pet pet){
        this.pet = pet;
    }

    //THIS IS THE METHOD THAT CALCULATES THE INCOME AFTER TAXES
    public int payTaxes(int income){
        int taxes = income/5;
        income = income-taxes;
        return income;
    }
}
