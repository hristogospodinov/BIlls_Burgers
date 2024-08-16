public class Main {
    public static void main(String[] args) {

//        Item coke = new Item("drink", "coke", 1.50);
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();
//
//        Item avocado = new Item("Topping", "avocado", 1.50);
//        avocado.printItem();

//        Burger burger = new Burger("regular", 5.00);
//        burger.addToppings("BACON","CHEESE","MAYO");
//        burger.printItem();

//        MealOrder meal = new MealOrder();
//        meal.printItemizedList();

//        MealOrder regularMeal = new MealOrder();
//        regularMeal.addBurgerToppings("BACON","CHEESE","MAYO");
//        regularMeal.setDrinkSize("LARGE");
//        regularMeal.setSideSize("SMALL");
//        regularMeal.printItemizedList();

        MealOrder meal2 = new MealOrder("turkey", "7-up", "chili");
        meal2.addBurgerToppings("LETTUCE","TOMATO","KETCHUP");
        meal2.setDrinkSize("SMALL");
        meal2.printItemizedList();
    }
}
