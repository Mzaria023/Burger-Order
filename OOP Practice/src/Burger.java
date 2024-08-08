public class Burger extends Order{
    private Order extra1;
    private Order extra2;
    private Order extra3;

    public Burger( String name, double price) {
        super("Burger", name, price);
    }

    @Override
    public String getName() {
        return super.getName() + "Burger";
    }

    @Override
    public double getAdjustedPrice() {
        return super.getAdjustedPrice() +
                ((extra1 == null) ? 0 : extra1.getAdjustedPrice())+
                ((extra2 == null) ? 0 : extra2.getAdjustedPrice())+
                ((extra3 == null) ? 0 : extra3.getAdjustedPrice());
    }

    public double getExtraPrice(String toppingName){
        return switch (toppingName.toUpperCase()){
            case "AVOCADO", "CHEESE" -> 1.0;
            case "BACON", "HAM", "SALAMI" ->1.6;
            default -> 0.0;
        };
    }
    public void addToppings(String extra1, String extra2, String extra3){
        this.extra1 = new Order("TOPPING", extra1,getExtraPrice(extra1));
        this.extra2 = new Order("TOPPING", extra2,getExtraPrice(extra2));
        this.extra3 = new Order("TOPPING", extra3,getExtraPrice(extra3));
    }
    public void printToppings(){
     printItem("Base Burger", getBasePrice());
     if(extra1 != null){
         extra1.printItem();
     }if(extra2 != null){
            extra2.printItem();
     }if(extra3 != null){
            extra3 .printItem();
     }
    }

    @Override
    public void printItem() {
        printToppings();
        System.out.println("_".repeat(30));
        super.printItem();
    }
}

