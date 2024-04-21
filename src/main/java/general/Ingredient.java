package general;

/**
 * 材料。Itemとは異なり、数量を持つ。
 */
public class Ingredient extends Item {
    /**
     * 数量。
     */
    public final int quantity;

    public Ingredient(Item item, int quantity) {
        super(item.name);
        this.quantity = quantity;
    }

    /**
     * このIngredientをItemに変換する。
     * @return Item
     */
    public Item toItem() {
        return new Item(this.name);
    }
}
