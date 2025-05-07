package ArthurKetler.Menu;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Menu {
    ArrayList<Plate> plates;
    ArrayList<Drink> drinks;
    ArrayList<Side> sides;
    
    
    public Menu() {
        // 3 funcoes de ArrayList de Plates Drinks e Sides
        this.plates = MenuItems(API.class, Plate.class);
        this.drinks = MenuItems(API.class, Drink.class);
        this.sides = MenuItems(API.class, Side.class);
        
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
    
    public MenuItem getItem(int index) {
        return this.plates.get(index);
    }
    
    
}