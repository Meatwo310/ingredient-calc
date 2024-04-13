package recipe;

import general.Ingredient;
import general.Item;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Required {
    public final List<Ingredient> ingredients = new ArrayList<>();

    public Required() {}

    public Required add(Item item) {
        return this.add(item, 1);
    }
    public Required add(Item item, int quantity) {
        return this.add(new Ingredient(item, quantity));
    }
    public Required add(Ingredient ingredient) {
        ingredients.add(ingredient);
        return this;
    }

    public boolean has(Item item) {
        return ingredients.stream().anyMatch(ingredient -> ingredient.equals(item));
    }

    public void print() {
        ingredients.forEach(ingredient ->
                System.out.println("|- " + ingredient.quantity + "x " + ingredient.name)
        );
    }

    public static Required getFromMap(LinkedHashMap<Item, Required> map, Item item) {
        return map.entrySet().stream()
                .filter(entry -> entry.getKey().name.equals(item.name))
                .map(entry -> entry.getValue())
                .findFirst()
                .orElse(null);
    }
}
