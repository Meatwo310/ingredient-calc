import general.Item;
import recipe.RecipeGroup;

public class Main {
    public static void main(String[] args) {
        // Ore
        final var ALUMINUM = new Item("Aluminum");
        final var COPPER = new Item("Copper");
        final var IRON = new Item("Iron");

        // Wire
        final var IRON_WIRE = new Item("Iron Wire");

        // Gear

        // Liquid
        final var COPPER_LIQUID = new Item("Copper Liquid");
        final var IRON_LIQUID = new Item("Iron Liquid");

        // Plate

        // Cable

        // Tier 1
        final var HEATER_PLATE = new Item("Heater Plate");
        final var BATTERY = new Item("Battery");

        // Tier 2

        // Tier 3
        final var LASER = new Item("Laser");

        final var group = new RecipeGroup()
                .add(IRON_WIRE, r -> r
                        .add(IRON, 1))
                .add(COPPER_LIQUID, r -> r
                        .add(COPPER, 1))
                .add(IRON_LIQUID, r -> r
                        .add(IRON, 1))
                .add(HEATER_PLATE, r -> r
                        .add(IRON_WIRE, 1)
                        .add(ALUMINUM, 1))
                .add(BATTERY, r -> r
                        .add(COPPER, 1)
                        .add(COPPER_LIQUID, 1))
                .add(LASER, r -> r
                        .add(BATTERY, 5)
                        .add(HEATER_PLATE, 5)
                        .add(IRON_LIQUID, 5));

        final var tree = group.getRecipeTree(LASER, 1);

        tree.print();
        System.out.println();
        tree.printTotal(false);
        System.out.println();
        tree.printTotal(true);
    }
}
