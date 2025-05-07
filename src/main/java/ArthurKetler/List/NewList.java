package ArthurKetler.List;

import ArthurKetler.Order.OrderItem;
import java.util.ArrayList;

// especificidade no generic pois tem uso específico
public class NewList extends ArrayList<OrderItem> {
    
    @Override
    public boolean add(OrderItem item) {
        int index = this.newListContains(item);
        
        if (index != -1) {
            this.get(index).addAmmount();
            return true;
        }
        
        return super.add(item);
    }
    
    
    public int newListContains(OrderItem item) {
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).isEqual(item)) {
                return i;
            };
        }
        
        return -1;
    }
    
    
}
