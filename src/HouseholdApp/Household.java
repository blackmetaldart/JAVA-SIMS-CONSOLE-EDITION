package HouseholdApp;

public class Household {
    public int income;
    Pet pet;

    Household(int income,  Pet pet){
        this.income = income;
        this.pet = pet;
    }

    public void setIncome(int income){
        this.income = income;
    }

    public void setAnimal(Pet pet){
        this.pet = pet;
    }

    public int payTaxes(int income){
        int taxes = income/5;
        income = income-taxes;
        return income;
    }
}
