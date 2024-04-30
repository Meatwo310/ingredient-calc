package recipe;

import general.Ingredient;
import general.Item;

import java.util.Arrays;
import java.util.LinkedHashMap;

/**
 * 複数個のレシピをまとめたグループ。
 */
public class RecipeGroup {
    /**
     * レシピのマップ。キーに成果物を、値に必要なアイテムの情報を持つ。
     */
    public final LinkedHashMap<Item, Required> map = new LinkedHashMap<>();

    // レシピ追加

    /**
     * このグループにレシピを追加する。
     * @param resultItems 成果物
     * @param requiredItems 必要なアイテム
     * @return このRecipeGroupオブジェクト
     */
    public RecipeGroup add(Ingredient[] resultItems, Ingredient... requiredItems) {
        if (resultItems.length < 1)     throw new IllegalArgumentException("resultItems must have at least one element.");
        if (requiredItems.length < 1)   throw new IllegalArgumentException("requiredItems must have at least one element.");

        // TODO: 複数個の成果物に対応
        // 一時的に最初の成果物だけを使用します
        final Item resultItem = resultItems[0].toItem();

        // 重複チェック
        if (map.containsKey(resultItem)) {
            throw new IllegalArgumentException("The result item \"" + resultItem.name + "\" already exists in the map.");
        }

        map.put(resultItems[0].toItem(), new Required(requiredItems));
        return this;
    }

    /**
     * このグループにレシピを追加する。
     * @param resultItem 成果物
     * @param requiredItems 必要なアイテム
     * @return このRecipeGroupオブジェクト
     */
    public RecipeGroup add(Ingredient resultItem, Ingredient... requiredItems) {
        return add(new Ingredient[]{resultItem}, requiredItems);
    }

    /**
     * このグループにレシピを追加する。
     * @param resultItem 成果物
     * @param requiredItems 必要なアイテム
     * @return このRecipeGroupオブジェクト
     */
    public RecipeGroup add(Item resultItem, Ingredient... requiredItems) {
        return add(new Ingredient[] { resultItem.toIngredient() }, requiredItems);
    }

    /**
     * このグループにレシピを追加する。
     * @param resultItem 成果物
     * @param requiredItem 必要なアイテム
     * @return このRecipeGroupオブジェクト
     */
    public RecipeGroup add(Item resultItem, Item... requiredItem) {
        return add(
                new Ingredient[] { resultItem.toIngredient() },
                Arrays.stream(requiredItem).map(Item::toIngredient).toArray(Ingredient[]::new));
    }

    // レシピ削除

    /**
     * このグループから、指定された成果物を持つレシピを削除する。
     * @param resultItem 削除する成果物
     * @return このオブジェクト自身
     */
    public RecipeGroup remove(Item resultItem) {
        map.entrySet().removeIf(entry -> entry.getKey().equals(resultItem));
        return this;
    }

    // その他

    /**
     * 指定されたアイテムのレシピについて、レシピツリーを取得する。
     * @param item レシピを取得するアイテム
     * @return レシピツリー
     */
    public RecipeTree getRecipeTree(Item item) {
        return getRecipeTree(item, 1);
    }

    /**
     * 指定されたアイテムのレシピについて、レシピツリーを取得する。
     * @param item レシピを取得するアイテム
     * @param quantity 必要なアイテムの個数
     * @return レシピツリー
     */
    public RecipeTree getRecipeTree(Item item, int quantity) {
        RecipeTree recipeTree = new RecipeTree(item, quantity);
        return recipeTree.calculateChildrenRecursive(map);
    }

    /**
     * このレシピグループの内容を表示する。
     */
    public void print() {
        System.out.println("[Recipe Group]");
        map.forEach((item, required) -> {
            System.out.println(item.name);
            required.print();
        });
        System.out.println();
    }
}
