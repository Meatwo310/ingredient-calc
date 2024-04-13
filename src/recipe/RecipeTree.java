package recipe;

import general.Ingredient;
import general.Item;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

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
    public boolean calculateChildrenRecursive(LinkedHashMap<Item, Required> map) {
        // このアイテムのレシピが存在しない場合
        if (!map.containsKey(this.item)) {
            return false;
        }

        // このアイテムのレシピ
        Required required = map.get(this.item);

        // このアイテムのレシピの材料を再帰的に設定
        for (Ingredient ingredient : required.ingredients) {
            RecipeTree child = new RecipeTree(ingredient, ingredient.quantity * this.quantity);
            child.calculateChildrenRecursive(map);
            this.children.add(child);
        }

        return true;
    }

    public void print() {
        System.out.println("[Recipe Tree]");
        this.printRecursive(0);
    }

    public void printRecursive(int depth) {
        for (int i = 0; i < depth - 1; i++) {
            System.out.print("  ");
        }
        if (depth > 0) {
            System.out.print("|- ");
        }
        System.out.println(this.quantity + "x " + this.item.name);
        for (RecipeTree child : this.children) {
            child.printRecursive(depth + 1);
        }
    }
}
