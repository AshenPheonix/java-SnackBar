package snackBar;

public class Snack{
    static private int maxID=0;
    private int id, quantity, vendingID;
    private String name;
    private double cost;


    public Snack() {
    }

    public Snack(int id, int quantity, int vendingID, String name, double cost) {
        this.id = id;
        this.quantity = quantity;
        this.vendingID = vendingID;
        this.name = name;
        this.cost = cost;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Snack id(int id) {
        this.id = id;
        return this;
    }

    public Snack quantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public Snack vendingID(int vendingID) {
        this.vendingID = vendingID;
        return this;
    }

    public Snack name(String name) {
        this.name = name;
        return this;
    }

    public Snack cost(double cost) {
        this.cost = cost;
        return this;
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

}