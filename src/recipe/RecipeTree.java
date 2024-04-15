package recipe;

import general.Ingredient;
import general.Item;

import java.util.*;

public class RecipeTree {
    public Item item;
    public int quantity;
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
        if (!Item.mapHasItem(map, this.item)) {
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

    public void print() {
        System.out.println("[Recipe Tree]");
        this.printRecursive(0);
    }

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
    public LinkedHashMap<String, Integer> calculateTotal(boolean includeParents) {
        LinkedHashMap<String, Integer> total = new LinkedHashMap<>();
        this.calculateTotalRecursive(0, total, includeParents);
        return total;
    }

    public void calculateTotalRecursive(int depth, LinkedHashMap<String, Integer> total, boolean includeParents) {
        for (RecipeTree child : this.children) {
            child.calculateTotalRecursive(depth + 1, total, includeParents);
        }
        if (includeParents || this.children.isEmpty()) {
            total.put(this.item.name, total.getOrDefault(this.item.name, 0) + this.quantity);
        }
    }
}
