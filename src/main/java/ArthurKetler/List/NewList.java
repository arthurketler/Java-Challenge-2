package ArthurKetler.List;

import java.util.ArrayList;

public class NewList<OrderItem> extends ArrayList<OrderItem> {
    
    @Override
    public boolean add(OrderItem item) {
        if (this.contains(item)) {
            // adicionar quantidade da classe item
            return true;
        }
        
        return super.add(item);
    }
}
