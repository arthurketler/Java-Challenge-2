package ArthurKetler.Menu;

import ArthurKetler.Order.DrinkOrderItem;
import ArthurKetler.Order.OrderItem;
import ArthurKetler.Order.PlateOrderItem;
import ArthurKetler.Order.SideOrderItem;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Menu {
    ArrayList<PlateMenuItem> plates;
    ArrayList<DrinkMenuItem> drinks;
    ArrayList<SideMenuItem> sides;
    
    
    public Menu() {
        // 3 funcoes de ArrayList de Plates Drinks e Sides
        this.plates = MenuItems(API.class, PlateMenuItem.class);
        this.drinks = MenuItems(API.class, DrinkMenuItem.class);
        this.sides = MenuItems(API.class, SideMenuItem.class);
        
    }
    
    // metodo que preenche o menu a partir da API
    private <A, T extends MenuItem> ArrayList<T> MenuItems(Class<A> apiReference, Class<T> type) {
        ArrayList<T> list = new ArrayList<>();
        
        int length = 0;
        
        try {
            Method method = apiReference.getMethod("getTable", Class.class);
            length = (int) method.invoke(null, type);
            
        } catch (NoSuchMethodException e) {
            System.out.println("Método de API não encontrado.");;
        } catch (IllegalAccessException e) {
            System.out.println("Método de API não acessivel pelo package.");
        } catch (IllegalArgumentException e) {
            System.out.println("Parâmetros de método de API incorretos.");
        } catch (InvocationTargetException e) {
            System.out.println("Método com excessão interna.");
//            Throwable causa = e.getCause(); // exceção original lançada
//            causa.printStackTrace();
        } catch (SecurityException e) {
            System.out.println("Erro com o gerenciador de segurança do Java.");
        }
        
        
        for (int i = 0; i < length; i++) {
            list.add(ArthurKetler.Menu.API.getTable(type, i));
        }
        
        return list;
    }
    
    public MenuItem getItem(OrderItem item, int index) {
        if (item instanceof PlateOrderItem) {
            return this.plates.get(index);
        } else if (item instanceof DrinkOrderItem) {
            return this.drinks.get(index);
        } else if (item instanceof SideOrderItem) {
            return this.sides.get(index);
        }
        
        return new MenuItem();
    }
    
    public void list(Class<?> type) {
        System.out.println("#".repeat(MenuItem.getPrintSize()));
        
        switch (type.getSimpleName()) {
            case "PlateOrderItem":
                for (PlateMenuItem plate : plates) System.out.println(plate.toString());
                break;
            case "DrinkOrderItem":
                for (DrinkMenuItem drink : drinks) System.out.println(drink.toString());
                break;
            case "SideOrderItem":
                for (SideMenuItem side : sides) System.out.println(side.toString());
                break;
        }
        
        System.out.println("#".repeat(MenuItem.getPrintSize()));
    }
    
    public boolean contains(Class<?> type, byte ID) {
        switch (type.getSimpleName()) {
            case "PlateOrderItem":
                for (MenuItem item : plates) {
                    if (item.getID() == ID) return true;
                }
                break;
            case "DrinkOrderItem":
                for (MenuItem item : drinks) {
                    if (item.getID() == ID) return true;
                }
                break;
            case "SideOrderItem":
                for (MenuItem item : sides) {
                    if (item.getID() == ID) return true;
                }
                break;
        }
        
        return false;
    }
    
    
}