public class Item {
    private String type;
    private String name;
    private double price;
    private String size = "MEDIUM";

    public Item(String type, String name, double price) {
        this.type = type.toUpperCase();
        this.name = name.toUpperCase();
        this.price = price;
    }

    public String getName() {
        if (type.equals("DRINK") || type.equals("SIDE")) {
            return size + " " + name;
        }
        return name;
    }

    public double getBasePrice() {
        return price;
    }
}
