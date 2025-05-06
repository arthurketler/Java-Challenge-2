package ArthurKetler.List;

import ArthurKetler.Order.OrderItem;
import java.util.ArrayList;

// especificidade no generic pois tem uso específico
public class NewList extends ArrayList<OrderItem> {
    
    @Override
    public boolean add(OrderItem item) {
        if (this.contains(item)) {
            item.addAmmount();
            return true;
        }
        
        return super.add(item);
    }
    
    
    public boolean newListContains(OrderItem item) {
        for (OrderItem existingItem : this) {
            //if (existingItem.getID() == item.getID() || existingItem.getClass() == item.getClass()) return true;
            if (existingItem.getID() == item.getID()) return true;
        }
        
        return false;
    }
    
    
}
