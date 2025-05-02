package ArthurKetler.Menu;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Menu {
    ArrayList<Plate> plates;
    ArrayList<Drink> drinks;
    ArrayList<Side> sides;
    
    
    public Menu(Object object) {
        // 3 funcoes de ArrayList de Plates Drinks e Sides
        this.plates = MenuItems(API.class, Plate.class);
        this.drinks = MenuItems(API.class, Drink.class);
        this.sides = MenuItems(API.class, Side.class);
        
    }
    
    private <A, T extends MenuItem> ArrayList<T> MenuItems(Class<A> reference, Class<T> type) {
        ArrayList<T> list = new ArrayList<>();
        
        int length = 0;
        
        try {
            Class<?> clazz = reference;
            
            Method method = clazz.getMethod("getTable");
            
            length = method.invoke(type);
            
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        
        
        for (int i = 0; i < ; i++) {
            list.add(ArthurKetler.Menu.API.getTable(type, i));
        }
        
        return list;
    }
}