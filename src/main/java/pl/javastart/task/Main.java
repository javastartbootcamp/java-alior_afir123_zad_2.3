package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Drink drink1 = new Drink();
        drink1.name = "Mojito";
        drink1.price = 13.0;
        drink1.isAlcohol = true;
        drink1.ingredient1 = new Ingredient();
        drink1.ingredient1.name = "Woda";
        drink1.ingredient1.amount = 150;
        drink1.ingredient2 = new Ingredient();
        drink1.ingredient2.name = "Sok cytrynowy";
        drink1.ingredient2.amount = 10;
        drink1.ingredient3 = new Ingredient();
        drink1.ingredient3.name = "Wódka";
        drink1.ingredient3.amount = 50;

        int drinkAmount = drink1.ingredient1.amount + drink1.ingredient2.amount + drink1.ingredient3.amount;

        System.out.println("Drink: " + drink1.name);
        System.out.println("Cena: " + drink1.price + "zł");
        System.out.println("Czy zawiera alkohol? " + drink1.isAlcohol);
        System.out.println("Składniki:");
        System.out.println(drink1.ingredient1.name);
        System.out.println(drink1.ingredient2.name);
        System.out.println(drink1.ingredient3.name);
        System.out.println("Pojemność: " + drinkAmount + "ml");

    }
}
