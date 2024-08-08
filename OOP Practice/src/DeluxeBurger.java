public class DeluxeBurger extends Burger{
    Order deluxe1;
    Order deluxe2;
    public DeluxeBurger(String name, double price) {
        super(name, price);
    }


    public void addToppings(String extra1, String extra2, String extra3, String extra4, String extra5) {
        super.addToppings(extra1, extra2, extra3);
        deluxe1 = new Order("Topping",extra4, 0);
        deluxe2 = new Order("Topping",extra5, 0);
    }

    @Override
    public void printToppings() {
        super.printItem();
        if (deluxe1 != null){
            deluxe1.printItem();
        }if(deluxe2 != null){
            deluxe2.printItem();
        }
    }

    @Override
    public double getExtraPrice(String toppingName) {
        return 0;
    }
}
