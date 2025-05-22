package ArthurKetler.Menu;

import java.util.ArrayList;
import java.util.List;

public class API {

    
    private static ArrayList<PlateMenuItem> plateTable = new ArrayList<>(List.of(
            new PlateMenuItem(0, "Roscovo", 7.0),
            new PlateMenuItem(1, "Pasta", 10.0),
            new PlateMenuItem(2, "Hamburguer", 20.0),
            new PlateMenuItem(3, "Strogonoff", 15.0),
            new PlateMenuItem(4, "Arroz carreteiro", 12.0),
            new PlateMenuItem(5, "Miojo", 45.0),
            new PlateMenuItem(6, "PF", 9.0)
    ));
    
    private static ArrayList<DrinkMenuItem> drinkTable = new ArrayList<>(List.of(
            new DrinkMenuItem(0, "Agua", 2.0),
            new DrinkMenuItem(1, "Coca", 6.0),
            new DrinkMenuItem(2, "Guarana", 5.0),
            new DrinkMenuItem(3, "Suco", 3.0),
            new DrinkMenuItem(4, "Redbull", 10.0)
    ));
    
    private static ArrayList<SideMenuItem> sideTable = new ArrayList<>(List.of(
            new SideMenuItem(0, "Salada", 1.50),
            new SideMenuItem(1, "Fritas", 1.50),
            new SideMenuItem(2, "Onion Rings", 1.50)
    ));
    
    public static int getTable(Class<?> type) {
        return switch (type.getSimpleName()) {
            case "PlateMenuItem" -> API.plateTable.size();
            case "DrinkMenuItem" -> API.drinkTable.size();
            case "SideMenuItem" -> API.sideTable.size();
            
            default -> -1;
        };
    }
    
    public static <T extends MenuItem> T getTable(Class<T> type, int index) {
        if (type == PlateMenuItem.class) {
            return (T) API.plateTable.get(index);
        } else if (type == DrinkMenuItem.class) {
            return (T) API.drinkTable.get(index);
        } else if (type == SideMenuItem.class) {
            return (T) API.sideTable.get(index);
        }
        
        return (T) new MenuItem();
    }
    
    
}
