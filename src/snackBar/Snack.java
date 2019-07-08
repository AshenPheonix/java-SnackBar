package snackBar;

public class Snack{
    static private int maxID=0;
    private int id, quantity, vendingID;
    private String name;
    private double cost;


    public Snack() {
    }

    public Snack(int quantity, int vendingID, String name, double cost) {
        this.quantity = quantity;
        this.vendingID = vendingID;
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

    public int getVendingID() {
        return this.vendingID;
    }

    public void setVendingID(int vendingID) {
        this.vendingID = vendingID;
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
        return "{" +
            " id='" + getId() + "'" +
            ", quantity='" + getQuantity() + "'" +
            ", vendingID='" + getVendingID() + "'" +
            ", name='" + getName() + "'" +
            ", cost='" + getCost() + "'" +
            "}";
    }

    public void decrement(){
        quantity--;
    }
    public void decrement(int amount) {
        quantity-=amount;
    }
}