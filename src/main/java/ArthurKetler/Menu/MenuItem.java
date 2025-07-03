package ArthurKetler.Menu;

public class MenuItem {
    private int ID;
    private String name;
    private double price;
    
    private static int printSize = 35;
    
    public static int getPrintSize() {
        return printSize;
    }
    
    
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
    
    @Override
    public String toString() {
        int line = printSize - String.format("#%d//%s$%5.2f", this.ID + 1, this.name, this.price).length();
        
        return String.format("#%d//%s%s$%5.2f", this.ID + 1, this.name, "-".repeat(line), this.price);
    }
}
