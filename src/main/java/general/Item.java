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
     * このItemをIngredientに変換する。
     * @return 1個のIngredient
     */
    public Ingredient toIngredient() {
        return this.toIngredient(1);
    }
    /**
     * このItemをIngredientに変換する。
     * @param quantity 個数
     * @return quantity個のIngredient
     */
    public Ingredient toIngredient(int quantity) {
        return new Ingredient(this, quantity);
    }
    /**
     * toIngredient() のエイリアス。
     * @param quantity 個数
     * @return quantity個のIngredient
     */
    public Ingredient x(int quantity) {
        return this.toIngredient(quantity);
    }

    /**
     * mapがitemを含むならtrue。
     */
    public static boolean mapHasItem(LinkedHashMap<Item, Required> map, Item item) {
        return map.keySet().stream().anyMatch(key -> key.name.equals(item.name));
    }
}
