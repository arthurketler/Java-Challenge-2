package ArthurKetler.Order;

import ArthurKetler.Menu.Menu;

public class OrderItem {
    private int ID;
    private int ammount;
    private Menu menu;
    
    private static int printSize = 50;
    
    public static int getPrintSize() {
        return printSize;
    }
    
    public OrderItem(int ID, Menu menu) {
        this.ID = ID;
        this.ammount = 1;
        this.menu = menu;
    }
    
    public OrderItem() {
        this(-1, null);
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
    
    public boolean isEqual(OrderItem item) {
        return this.getClass() == item.getClass() && this.ID == item.ID && this.menu == item.menu;
    }
    
    public String toString(int i) {
        String line = String.format("%02d||%s|%s????%d||$%05.2f||$%05.2f",
                i,
                this.getTipo(),
                this.menu.getItem(this, this.ID).getName(),
                this.ammount,
                this.menu.getItem(this, this.ID).getPrice(),
                this.getTotal());
        
        return line.replace("????", "-".repeat(printSize - line.length()));
    }
    
    public double getTotal() {
        return this.ammount * this.menu.getItem(this, this.ID).getPrice();
    }
    
    public String getTipo() {
        return "";
    }
}

