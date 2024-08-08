//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//    Order item = new Order("Drink","Fanta",1.64);
//    item.printItem();
//    item.setSize("Small");
//    item.printItem();

   mealOrder order = new mealOrder();
    order.addToppings("BACON","AVOCADO","CHEESE");
    order.setSize("MEDIUM");
    order.printOrder();

    mealOrder deluxe = new mealOrder("deluxe", "orange","chips");
    deluxe.addToppings("BACON","AVOCADO","CHEESE","LETTUCE","MAYO");
    deluxe.setSize("SMALL");
    deluxe.printOrder();

    }
}