package recipe;

import general.Item;

import java.util.LinkedHashMap;
import java.util.function.Consumer;

public class RecipeGroup {
    public final LinkedHashMap<Item, Required> map = new LinkedHashMap<>();

    public RecipeGroup add(Item resultItem, Consumer<Required> requiredConsumer) {
        Required required = new Required();
        requiredConsumer.accept(required);

        map.put(resultItem, required);

        return this;
    }
    public RecipeGroup add(Item resultItem, Item ingredientItem) {
        return add(resultItem, required -> required.add(ingredientItem));
    }
    public RecipeGroup add(Item resultItem, Item ingredientItem, int quantity) {
        return add(resultItem, required -> required.add(ingredientItem, quantity));
    }

    public RecipeGroup remove(Item resultItem) {
        map.entrySet().removeIf(entry -> entry.getKey().name.equals(resultItem.name));
        return this;
    }

    public RecipeTree getRecipeTree(Item item) {
        return getRecipeTree(item, 1);
    }
    public RecipeTree getRecipeTree(Item item, int quantity) {
        RecipeTree recipeTree = new RecipeTree(item, quantity);
        return recipeTree.calculateChildrenRecursive(map);
    }

    public void print() {
        System.out.println("[Recipe Group]");
        map.forEach((item, required) -> {
            System.out.println(item.name);
            required.print();
        });
        System.out.println();
    }
}
