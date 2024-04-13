package general;

import recipe.Required;

import java.util.LinkedHashMap;

public class Item {
    public final String name;

    public Item(String name) {
        this.name = name;
    }

    public static boolean mapHasItem(LinkedHashMap<Item, Required> map, Item item) {
        return map.keySet().stream().anyMatch(key -> key.name.equals(item.name));
    }
}
