package MultilevelInheritance.Interface;

// Define an interface for ordering a drink
interface OrderDrink {
    void availableMenu();
    void placeOrder(String choice);
}

// Class for ordering coffee
class CoffeeOrder implements OrderDrink {
    public void availableMenu() {
        System.out.println("Coffee Menu available:");
        System.out.println("1. Espresso");
        System.out.println("2. Latte");
        System.out.println("3. Cappuccino");
    }

    public void placeOrder(String choice) {
        System.out.println("You have placed an order for " + choice);
    }
}

// Class for ordering tea
class TeaOrder extends CoffeeOrder {
    public void teaAvailableMenu() {
        System.out.println("Tea Menu available:");
        System.out.println("1. African Tea");
        System.out.println("2. Black Tea");
        System.out.println("3. American Tea");
    }

    public void placeOrder(String choice) {
        System.out.println("You have placed an order for " + choice);
    }
}

// Class for ordering soft drinks
class SoftDrinkOrder extends TeaOrder {
    public void softAvailableMenu() {
        System.out.println("Soft Drink Menu available:");
        System.out.println("1. Coca-Cola");
        System.out.println("2. Lemon-Lime Soda");
        System.out.println("3. Orange Soda");
    }

    public void placeOrder(String choice) {
        System.out.println("You have placed an order for " + choice);
    }
}

// Class for ordering smoothies 
class SmoothieOrder extends SoftDrinkOrder {
    public void smoothieAvailableMenu() {
        System.out.println("Smoothie Menu available:");
        System. out.println("1. Strawberry Banana Smoothie");
        System.out.println("2. Mango Pineapple Smoothie");
        System.out.println("3. Berry Blast Smoothie");
    }

    public void placeOrder(String choice) {
        System.out.println("You have placed an order for " + choice);
    }
}

class WebsiteTest {
    public static void main(String[] args) {
        // Create an object for CoffeeOrder
        CoffeeOrder MyCoffee = new CoffeeOrder();
        MyCoffee.availableMenu();
        MyCoffee.placeOrder("Cappuccino");

        System.out.println("***************************");

        // Create an object for TeaOrder
        TeaOrder MyTea = new TeaOrder();
        MyTea.teaAvailableMenu();
        MyTea.placeOrder("African Tea");

        System.out.println("***************************");

        // Create an object for SoftDrinkOrder
        SoftDrinkOrder MySoftDrink = new SoftDrinkOrder();
        MySoftDrink.softAvailableMenu();
        MySoftDrink.placeOrder("Coca-Cola");

        System.out.println("***************************");

        // Create an object for SmoothieOrder
        SmoothieOrder MySmoothie = new SmoothieOrder();
        MySmoothie.smoothieAvailableMenu();
        MySmoothie.placeOrder("Strawberry Banana Smoothie");

    }
}
