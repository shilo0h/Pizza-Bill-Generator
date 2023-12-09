public class Main {
    public static void main(String[] args) {
       /* Pizza basePizza=new Pizza(true);
        basePizza.addExtraToppings();
        basePizza.addExtraCheese();
        basePizza.getBill();*/
        DeluxPizza dp=new DeluxPizza(true);
        dp.addExtraCheese();
        dp.addExtraToppings();
        dp.getBill();
    }
}