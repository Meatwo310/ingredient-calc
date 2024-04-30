package recipe;

import general.Ingredient;
import general.Item;

import java.util.*;

/**
 * レシピツリー。親となるアイテムが一つと、そのアイテムのレシピを再帰的に持つ。
 */
public class RecipeTree {
    /**
     * このツリーの親となるアイテム。
     */
    public Item item;

    /**
     * このアイテムの個数。
     */
    public int quantity;

    /**
     * このアイテムのレシピを再帰的に持つ。
     */
    public List<RecipeTree> children = new ArrayList<>();

    public RecipeTree() {
    }
    public RecipeTree(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    /**
     * レシピツリーの子を設定します。
     * @param map レシピが格納されたマップ
     * @return 子が設定されたかどうか; これ以上分解できない場合はfalse
     */
    public boolean calculateChildren(LinkedHashMap<Item, Required> map) {
        // このアイテムのレシピが存在しない場合
        if (!map.containsKey(this.item)) {
            return false;
        }

        // このアイテムのレシピ
        Required required = map.get(this.item);

        // このアイテムのレシピの材料を再帰的に設定
        for (Ingredient ingredient : required.ingredients) {
            RecipeTree child = new RecipeTree(ingredient, ingredient.quantity * this.quantity);
            child.calculateChildren(map);
            this.children.add(child);
        }

        return true;
    }

    /**
     * レシピツリーの子を再帰的に設定します。
     * @param map レシピが格納されたマップ
     * @return 子が設定されたかどうか; これ以上分解できない場合はfalse
     */
    public RecipeTree calculateChildrenRecursive(LinkedHashMap<Item, Required> map) {
        // このアイテムのレシピが存在しない場合
        if (!map.containsKey(this.item)) {
            return this;
        }


        // このアイテムのレシピ
        Required required = Required.getFromMap(map, this.item);

        // このアイテムのレシピの材料を再帰的に設定
        for (Ingredient ingredient : required.ingredients) {
            RecipeTree child = new RecipeTree(ingredient, ingredient.quantity * this.quantity);
            child.calculateChildrenRecursive(map);
            this.children.add(child);
        }

        return this;
    }

    /**
     * レシピツリーを出力します。
     */
    public void print() {
        System.out.println("[Recipe Tree]");
        this.printRecursive(0);
    }

    /**
     * レシピツリーを再帰的に出力します。
     * @param depth ツリーの深さ
     */
    public void printRecursive(int depth) {
        for (int i = 0; i < depth - 1; i++) {
            System.out.print("|  ");
        }
        if (depth > 0) {
            System.out.print("|- ");
        }
        System.out.println(this.quantity + "x " + this.item.name.replaceFirst("\\[.+] ", ""));
        for (RecipeTree child : this.children) {
            child.printRecursive(depth + 1);
        }
    }

    /**
     * このレシピツリーにおける必要素材の合計を表示します。
     */
    public void printTotal() {
        this.printTotal(false);
    }

    /**
     * このレシピツリーにおける必要素材の合計を表示します。
     * @param includeParents 加工における結果品だけではなく親も含むかどうか
     */
    public void printTotal(boolean includeParents) {
        System.out.println(includeParents ? "[Total including parents]" : "[Total]");
        // sort by item name
        this.calculateTotal(includeParents)
                .entrySet().stream()
//                // sort by item quantity
//                .sorted(Map.Entry.comparingByValue())
                // sort by name
                .sorted(Map.Entry.comparingByKey())
                .forEach((entry) -> System.out.println((entry.getValue() + "x " + entry.getKey()).replaceFirst("([0-9]+x) (\\[.+]) (.+)", "$2 $1 $3")));
    }

    /**
     * このレシピツリーにおける必要素材の合計を計算します。
     * @return 必要素材の合計
     */
    public LinkedHashMap<String, Integer> calculateTotal(boolean includeParents) {
        LinkedHashMap<String, Integer> total = new LinkedHashMap<>();
        this.calculateTotalRecursive(0, total, includeParents);
        return total;
    }

    /**
     * このレシピツリーにおける必要素材の合計を再帰的に計算し、totalに追加します。
     * @param depth ツリーの深さ
     * @param total 必要素材の合計を格納するマップ
     * @param includeParents 加工における結果品だけではなく親も含むかどうか
     */
    public void calculateTotalRecursive(int depth, LinkedHashMap<String, Integer> total, boolean includeParents) {
        for (RecipeTree child : this.children) {
            child.calculateTotalRecursive(depth + 1, total, includeParents);
        }
        if (includeParents || this.children.isEmpty()) {
            total.put(this.item.name, total.getOrDefault(this.item.name, 0) + this.quantity);
        }
    }
}
