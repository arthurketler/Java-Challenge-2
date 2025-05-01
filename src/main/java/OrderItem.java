public class OrderItem {
    private String ID;
    private int ammount;
    
    public OrderItem(String ID, int ammount) {
        this.ID = ID;
        this.ammount = ammount;
    }
    
}

class PlateItem extends OrderItem {
    
    
    public PlateItem(String ID, int ammount) {
        super(ID, ammount);
    }
}

class DrinkItem extends OrderItem {
    private char size;
    
    public DrinkItem(String ID, int ammount) {
        super(ID, ammount);
    }
}


class SideItem extends OrderItem {
    
    
    public SideItem(String ID, int ammount) {
        super(ID, ammount);
    }
}