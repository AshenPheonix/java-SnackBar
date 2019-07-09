package snackBar;

public class VendingMachine{
    private int id;
    private String name;
    private static int maxID=0;

    public VendingMachine(String name){
        this.name=name;
        maxID++;
        id=maxID;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}