import general.Ingredient;
import general.Item;
import recipe.RecipeGroup;

public class Main {
    public static void main(String[] args) {
        final var COPPER = new Item("Copper");
        final var COPPER_LIQUID = new Item("Copper Liquid");
        final var BATTERY = new Item("Battery");
        final var HEATER_PLATE = new Item("Heater Plate");
        final var IRON_LIQUID = new Item("Iron Liquid");
        final var LASER = new Item("Laser");

        final var group = new RecipeGroup()
                .add(COPPER_LIQUID, r -> r
                        .add(COPPER, 1)
                ).add(BATTERY, r -> r
                        .add(COPPER, 1)
                        .add(COPPER_LIQUID, 1)
                ).add(LASER, r -> r
                        .add(BATTERY, 5)
                        .add(HEATER_PLATE, 5)
                        .add(IRON_LIQUID, 5)
                );

        group.print();

        group.getRecipeTree(LASER, 1).print();
    }
}
