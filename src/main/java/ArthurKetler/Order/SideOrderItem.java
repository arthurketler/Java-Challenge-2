package ArthurKetler.Order;

import ArthurKetler.Menu.Menu;

public class SideOrderItem extends OrderItem {
    
    
    public SideOrderItem(int ID, Menu menu) {
        super(ID, menu);
    }
    
    @Override
    public String getTipo() {
        return "Acompanhamento";
    }
}
