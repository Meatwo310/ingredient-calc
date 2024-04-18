package recipe;

import general.Item;

import java.util.LinkedHashMap;
import java.util.function.Consumer;

/**
 * 複数個のレシピをまとめたグループ。
 */
public class RecipeGroup {
    /**
     * レシピのマップ。キーに成果物を、値に必要なアイテムの情報を持つ。
     */
    public final LinkedHashMap<Item, Required> map = new LinkedHashMap<>();

    /**
     * このグループにレシピを追加する。
     * @param resultItem 成果物
     * @param requiredConsumer 必要なアイテムを追加する処理
     * @return このオブジェクト自身
     */
    public RecipeGroup add(Item resultItem, Consumer<Required> requiredConsumer) {
        Required required = new Required();
        requiredConsumer.accept(required);

        map.put(resultItem, required);

        return this;
    }

    /**
     * このグループにレシピを追加する。
     * @param resultItem 成果物
     * @param ingredientItem 必要なアイテム
     * @return このオブジェクト自身
     */
    public RecipeGroup add(Item resultItem, Item ingredientItem) {
        return add(resultItem, required -> required.add(ingredientItem));
    }

    /**
     * このグループにレシピを追加する。
     * @param resultItem 成果物
     * @param ingredientItem 必要なアイテム
     * @param quantity 必要なアイテムの個数
     * @return このオブジェクト自身
     */
    public RecipeGroup add(Item resultItem, Item ingredientItem, int quantity) {
        return add(resultItem, required -> required.add(ingredientItem, quantity));
    }

    /**
     * このグループから、指定された成果物を持つレシピを削除する。
     * @param resultItem 削除する成果物
     * @return このオブジェクト自身
     */
    public RecipeGroup remove(Item resultItem) {
        map.entrySet().removeIf(entry -> entry.getKey().name.equals(resultItem.name));
        return this;
    }

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
