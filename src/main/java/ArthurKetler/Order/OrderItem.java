package ArthurKetler.Order;

import ArthurKetler.Menu.Menu;

public class OrderItem {
    private int ID;
    private int ammount;
    private Menu menu;
    
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
        return this.getClass() == item.getClass() && this.ID == item.ID;
    }
    
    public String toString() {
        
        
        return String.format("Tipo: %s, nome:%s, ID:%d, quantidade:%d, preco:%f, total:%f",
                this.getClass().getSimpleName(),
                this.menu.getItem(this, this.ID).getName(),
                this.menu.getItem(this, this.ID).getID(),
                this.ammount,
                this.menu.getItem(this, this.ID).getPrice(),
                this.getTotal());
    }
    
    public double getTotal() {
        return this.ammount * this.menu.getItem(this, this.ID).getPrice();
    }
}

