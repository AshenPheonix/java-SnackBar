package snackBar;

public class Customer{
    private int id;
    private String name;
    private double cash;
    static private int maxID=0;

    public Customer(String name, double cash) {
        this.name = name;
        this.cash = cash;

        maxID++;
        this.id=maxID;
    }
    
    public String name(){
        return name;
    }
    public void name(String name){
        this.name=name;
    }
    
    public double cash(){
        return cash;
    }
    public void cash(double add){
        cash+=add;
    }
    
    public void buy(double cost){
        if(cost>cash){
            System.out.println("Could not buy, not enough money");
        }else{
            cash-=cost;
            System.out.println(name+" used $"+cost+" and now has "+cash);
        }
    }
}