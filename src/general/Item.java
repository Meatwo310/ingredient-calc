package general;

import recipe.Required;

import java.util.LinkedHashMap;

public class Item {
    public final String name;

    public Item(String name) {
        this.name = name;
    }

    public static boolean mapHasItem(LinkedHashMap<Item, Required> map, Item item) {
        return map.keySet().stream().anyMatch(key -> {
            if (key.name.equals(item.name)) {
//                System.out.println("this is " + item.name);
                return true;
            } else {
//                System.out.println("this isn't " + item.name);
                return false;
            }
        });
    }
}
