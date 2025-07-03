package ArthurKetler.List;

import ArthurKetler.Menu.MenuItem;
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
    
    public void listItems() {
        String header = "TIPO|NOME????QUAN||PRECO-||TOTAL "; // espaco depois do total obrigatorio pois a contagem da errado sem
        System.out.println(header.replace("????", "-".repeat(OrderItem.getPrintSize() - header.length())));
        
        if (this.size() == 0) System.out.println("Empty list");
        
        for (int i = 0; i < this.size(); i++) {
            System.out.println(this.get(i).toString(i + 1));
        }
        
    }
    
    
}
