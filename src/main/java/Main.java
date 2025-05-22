import ArthurKetler.List.NewList;
import ArthurKetler.Menu.Menu;
import ArthurKetler.Order.DrinkOrderItem;
import ArthurKetler.Order.OrderItem;
import ArthurKetler.Order.PlateOrderItem;
import ArthurKetler.Order.SideOrderItem;

import java.net.IDN;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Menu menu = new Menu(); // instancia o menu como objeto de referência
        
        // instância de ordem de pedido
        NewList orderList = new NewList();
        //orderList.add(new PlateOrderItem(0, menu));
        
        while (true) {
            System.out.println("Press 1 to exit, 2 do add items and 3 to remove");
            
            // entry and validation
            String entryString = sc.nextLine();
            if (entryString.length() != 1) {
                System.out.println("Invalid, try again.");
                continue;
            }
            char entry =  entryString.charAt(0);
            
            entryString = null;
            
            // in case exit
            if (entry == '1') break;
            
            // in case add
            if (entry == '2') {
                while (true) {
                    System.out.println("What kind of? 'P' for plates, 'D' for drinks and 'S' for sides");
                    entryString = sc.nextLine();
                    char typeChar = entryString.length() == 1 ? entryString.charAt(0) : 'O';
                    entryString = null;
                    
                    // validate entry
                    if (!(typeChar == 'P' || typeChar == 'D' || typeChar == 'S')) {
                        System.out.println("Invalid");
                        continue;
                    }
                    
                    // save the type of class
                    Class<? extends OrderItem> typeClass = switch (typeChar) {
                        case 'P' -> PlateOrderItem.class;
                        case 'D' -> DrinkOrderItem.class;
                        case 'S' -> SideOrderItem.class;
                        default -> OrderItem.class;
                    };
                    
                    // list items
                    menu.list(typeClass);
                    
                    // recebe a entrada do item
                    System.out.print("Enter the item you want:");
                    byte ID = sc.nextByte();
                    sc.nextLine();
                    
                    // confere se o item existe
                    if (!menu.contains(typeClass, ID)) {
                        System.out.println("Invalid");
                        continue;
                    }
                    
                    // se existe instancia item
                    OrderItem item = switch (typeChar) {
                        case 'P' -> new PlateOrderItem(ID, menu);
                        case 'D' -> new DrinkOrderItem(ID, menu);
                        case 'S' -> new SideOrderItem(ID, menu);
                        default -> new OrderItem();
                    };
                    
                    orderList.add(item);
                    item = null;
                    
                }
            }
            
            
            System.out.println();
        }
        
        
        
        
        
        
        
    }
    
    public void line() {
        System.out.println("------------------------------------------");
    }
}
