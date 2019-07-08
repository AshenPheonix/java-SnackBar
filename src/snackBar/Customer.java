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

    public void buy (Snack snack){
        if(snack.getCost()>cash){
            System.out.println("Can't buy, not enough money");
        }else{
            cash-=snack.getCost();
            System.out.println(name+" use $"+snack.getCost()+" and now has $"+cash);
            snack.decrement();
            System.out.println(snack.getName()+" remaining :"+snack.getQuantity());
        }
    }

    public void buy (Snack snack,int amount){
        if(snack.getCost()*amount>cash){
            System.out.println("Can't buy, not enough money");
        }else{
            cash-=snack.getCost()*amount;
            System.out.println(name+" use $"+snack.getCost()*amount+" and now has $"+cash);
            snack.decrement(amount);
            System.out.println(snack.getName()+" remaining :"+snack.getQuantity());
        }
    }
}