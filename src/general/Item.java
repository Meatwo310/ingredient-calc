package general;

import recipe.Required;

import java.util.LinkedHashMap;

/**
 * アイテム。個数の情報を持たず、単に名前での区別に使用される。
 */
public class Item {
    /**
     * このアイテムの名前
     */
    public final String name;

    public Item(String name) {
        this.name = name;
    }

    /**
     * mapがitemを含むならtrue。
     */
    public static boolean mapHasItem(LinkedHashMap<Item, Required> map, Item item) {
        return map.keySet().stream().anyMatch(key -> key.name.equals(item.name));
    }
}
