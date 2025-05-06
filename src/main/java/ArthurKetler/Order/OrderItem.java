package ArthurKetler.Order;

public class OrderItem {
    private int ID;
    private int ammount;
    
    public OrderItem(int ID) {
        this.ID = ID;
        this.ammount = 1;
    }
    
    public int getAmmount() {
        return this.ammount;
    }
    
    public void addAmmount() {
        this.ammount++;
    }
    
    public void subtractAmmount() {
        this.ammount--;
    }
    
    public int getID(){
        return this.ID;
    }
    
    
    
}

