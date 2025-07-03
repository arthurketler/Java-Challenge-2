package ArthurKetler.Order;

import ArthurKetler.Menu.Menu;

public class PlateOrderItem extends OrderItem {
    
    
    public PlateOrderItem(int ID, Menu menu) {
        super(ID, menu);
    }
    
    @Override
    public String getTipo() {
        return "Prato";
    }
}
