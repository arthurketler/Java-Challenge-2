package ArthurKetler.Menu;

import java.util.ArrayList;
import java.util.List;

public class API {

    
    private static ArrayList<Plate> plateTable = new ArrayList<>(List.of(
            new Plate(1, "Pasta", 10.0),
            new Plate(2, "Hamburguer", 20.0),
            new Plate(3, "Strogonoff", 15.0),
            new Plate(4, "Arroz carreteiro", 12.0),
            new Plate(5, "Miojo", 45.0),
            new Plate(6, "PF", 9.0),
            new Plate(7, "Roscovo", 7.0)
    ));
    
    private static ArrayList<Drink> drinkTable = new ArrayList<>(List.of(
            new Drink(1, "Coca", 6.0),
            new Drink(2, "Guarana", 5.0),
            new Drink(3, "Suco", 3.0),
            new Drink(4, "Redbull", 10.0),
            new Drink(5, "Agua", 2.0)
    ));
    
    private static ArrayList<Side> sideTable = new ArrayList<>(List.of(
            new Side(1, "Salada", 1.50),
            new Side(1, "Fritas", 1.50),
            new Side(1, "Onion Rings", 1.50)
    ));
    
    public static int getTable(Class<?> type) {
        return switch (type.getSimpleName()) {
            case "Plate" -> API.plateTable.size();
            case "Drink" -> API.drinkTable.size();
            case "Size" -> API.sideTable.size();
            
            default -> -1;
        };
    }
    
    public static <T extends MenuItem> T getTable(Class<T> type, int index) {
        if (type == Plate.class) {
            return (T) API.plateTable.get(index);
        } else if (type == Drink.class) {
            return (T) API.drinkTable.get(index);
        } else if (type == Side.class) {
            return (T) API.sideTable.get(index);
        }
        
        return (T) new MenuItem();
    }
    
    
}
