public class mealOrder {
    private Burger burger;
    private Order drink;
    private Order side;

    public mealOrder() {
        this("regular","coke","fries");
    }

    public mealOrder(String burger, String drink, String side) {
        if(burger.equalsIgnoreCase("Deluxe")){
            this.burger = new DeluxeBurger(burger,3.6);
        }else{
            this.burger = new Burger(burger,4.5);
        }
        this.burger = new Burger(burger, 4.0);
        this.drink = new Order("drink", drink,1.00);
        this.side = new Order("side", side,1.50);
    }
    public double getTotalPrice(){
        if(burger instanceof DeluxeBurger){
            return burger.getAdjustedPrice();
        }
        return side.getAdjustedPrice() + drink.getAdjustedPrice() + burger.getAdjustedPrice();
    }
    public void printOrder(){
        burger.printItem();
        if(burger instanceof DeluxeBurger){
            Order.printItem(drink.getName(), 0);
            Order.printItem(side.getName(), 0);
        }
        drink.printItem();
        side.printItem();
        System.out.println("_".repeat(30));
        Order.printItem("Total Price: ",getTotalPrice());
    }
    public void addToppings(String extra1, String extra2, String extra3){
      burger.addToppings(extra1,extra2,extra3);
    }
    public void addToppings(String extra1, String extra2, String extra3, String extra4, String extra5){
        if(burger instanceof DeluxeBurger db){
            db.addToppings(extra1,extra2,extra3,extra4,extra5);
        }else {
            burger.addToppings(extra1, extra2, extra3);
        }
    }

    public void setSize(String size) {
       drink.setSize(size);
    }
}
