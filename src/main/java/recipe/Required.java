package recipe;

import general.Ingredient;
import general.Item;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * レシピにおける必要アイテム類。
 */
public class Required {
    /**
     * 加工に必要なアイテムのリスト。
     */
    public final List<Ingredient> ingredients = new ArrayList<>();

    public Required() {}

    /**
     * アイテムを追加する。
     * @param item 追加するアイテム
     * @return このオブジェクト自身
     */
    public Required add(Item item) {
        return this.add(item, 1);
    }
    /**
     * アイテムを追加する。
     * @param item 追加するアイテム
     * @param quantity 必要な個数
     * @return このオブジェクト自身
     */
    public Required add(Item item, int quantity) {
        return this.add(new Ingredient(item, quantity));
    }

    /**
     * Ingredientを追加する。
     * @param ingredient 追加するIngredient
     */
    public Required add(Ingredient ingredient) {
        ingredients.add(ingredient);
        return this;
    }

    /**
     * このオブジェクトのIngredientsの中の、指定されたアイテムを持つかどうかを返す。
     * @param item 検索するアイテム
     * @return 持つならtrue
     */
    public boolean has(Item item) {
        return ingredients.stream().anyMatch(ingredient -> ingredient.equals(item));
    }

    /**
     * このRequiredオブジェクトの中身を表示する。
     */
    public void print() {
        ingredients.forEach(ingredient ->
                System.out.println("|- " + ingredient.quantity + "x " + ingredient.name)
        );
    }

    /**
     * 指定されたアイテムのRequiredを取得する。
     * @param map Requiredが格納されたマップ
     * @param item 取得するアイテム
     * @return Required
     */
    public static Required getFromMap(LinkedHashMap<Item, Required> map, Item item) {
        return map.entrySet().stream()
                .filter(entry -> entry.getKey().name.equals(item.name))
                .map(Map.Entry::getValue)
                .findFirst()
                .orElse(null);
    }
}
