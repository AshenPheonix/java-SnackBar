package snackBar;

public class Snack{
    static private int maxID=0;
    private int id, quantity;
    private String name;
    private double cost;
    VendingMachine vendingMachine;

    public Snack() {
    }

    public Snack(int quantity, VendingMachine vendingMachine, String name, double cost) {
        this.quantity = quantity;
        this.vendingMachine = vendingMachine;
        this.name = name;
        this.cost = cost;

        maxID++;
        this.id = maxID;
    }

    public int getId() {
        return this.id;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public VendingMachine getVendingMachine() {
        return this.vendingMachine;
    }

    public void setVendingMachine(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return this.cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return  "Snack: "+name+"\n"+
                "Located in: "+vendingMachine.getName()+"\n"+
                "With "+quantity+" remaining\n"+
                "And a total value of: $"+quantity*cost+"\n";
    }

    public void decrement(){
        quantity--;
    }
    public void decrement(int amount) {
        quantity-=amount;
    }
}