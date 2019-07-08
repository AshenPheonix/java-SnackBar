package snackBar;

public class Main {

    public static void main(String[] args) {
        Customer Jane=new Customer("Jane", 45.25);
        Customer Bob=new Customer("Bob", 33.14);

        VendingMachine  Food=new VendingMachine("Food"),
                        Drink=new VendingMachine("Drink"),
                        Office=new VendingMachine("Office");
        
        Snack   Chips=new Snack(36, Food, "Chips", 1.75),
                ChocoBar=new Snack(36, Food,"Chocolate Bar", 1),
                Pretzel=new Snack(30, Food, "Pretzel", 2);
        
        Snack   Soda=new Snack(24, Drink,"Soda",2.50),
                Water=new Snack(20, Drink, "Water", 2.75);

        
        Jane.buy(Soda.getCost()*3);
        Soda.decrement(3);
        System.out.println("Soda :"+Soda.getQuantity());

        Jane.buy(Pretzel.getCost());
        Pretzel.decrement();
        System.out.println("Pretzel :"+Pretzel.getQuantity());

        Bob.buy(Soda,2);
        Jane.cash(10);
        Jane.buy(ChocoBar);
        
        Pretzel.setQuantity(Pretzel.getQuantity()+12);
        System.out.println(Pretzel.getName()+" remaining: "+Pretzel.getQuantity());

        Bob.buy(Pretzel,3);
    }


}