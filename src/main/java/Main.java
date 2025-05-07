import ArthurKetler.List.NewList;
import ArthurKetler.Menu.Menu;
import ArthurKetler.Order.OrderItem;
import ArthurKetler.Order.PlateOrderItem;
import ArthurKetler.Order.SideOrderItem;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu(); // instancia o menu como objeto de referência
        
        // instância de ordem de pedido
        NewList orderList = new NewList();
        orderList.add(new PlateOrderItem(0, menu));
        orderList.add(new PlateOrderItem(0, menu));
        orderList.add(new SideOrderItem(0, menu));
        
        
        
        
        
        
        
        
        
    }
}
