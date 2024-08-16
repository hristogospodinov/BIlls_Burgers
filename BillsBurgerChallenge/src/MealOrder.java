public class MealOrder {
    private Burger burger;
    private Item drink;
    private Item side;

    public MealOrder() {
        this("regular","coke","fries");
    }

    public MealOrder(String burgerType, String drinkType, String sideType) {
        if (burgerType.equalsIgnoreCase("deluxe")) {
            this.burger = new DeluxeBurger(burgerType, 8.50);
        } else {
            this.burger = new Burger(burgerType, 4.00);
        }
        this.drink = new Item("drink", drinkType, 1.00);
        this.side = new Item("side", sideType, 1.50);
    }

    public double getTotalPrice() {
        if (burger instanceof DeluxeBurger) {
            return burger.getAdjustedPrice();
        }
        return burger.getAdjustedPrice() + drink.getAdjustedPrice() + side.getAdjustedPrice();
    }

    public void printItemizedList() {
        burger.printItem();
        if (burger instanceof DeluxeBurger) {
            Item.printItem(drink.getName(),0);
            Item.printItem(side.getName(),0);
        } else {
            drink.printItem();
            side.printItem();
        }
        System.out.println("-".repeat(30));
        Item.printItem("TOTAL PRICE", getTotalPrice());
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3) {
        burger.addToppings(extra1,extra2,extra3);
    }

    public void setDrinkSize(String size) {
        drink.setSize(size);
    }

    public void setSideSize(String size) {
        side.setSize(size);
    }
}
