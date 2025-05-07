package ArthurKetler.Menu;

public class MenuItem {
    int ID;
    String name;
    double price;
    
    
    MenuItem(int ID, String name, double price) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        
    }
    
    public MenuItem() {
        this(-1, "invalid", 0);
    }
    
    public int getID() {
        return this.ID;
    }
    
    public String getName() {
        return this.name;
    }
    
    public double getPrice() {
        return this.price;
    }
    
    
}
