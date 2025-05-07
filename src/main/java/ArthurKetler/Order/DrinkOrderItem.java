package ArthurKetler.Order;

import ArthurKetler.Menu.Menu;

public class DrinkOrderItem extends OrderItem {
    private char size = 'O';
    
    public DrinkOrderItem(int ID, Menu menu) {
        super(ID, menu);
    }
    
    @Override
    public boolean isEqual(OrderItem item) {
        if (!super.isEqual(item)) return false;
        
        try {
            var actualItem = (DrinkOrderItem) item;
            
            return this.size == actualItem.size;
        } catch (ClassCastException e) {
            return false;
        }
    }
    
    public char getSize() {
        return size;
    }
}
