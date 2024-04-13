package general;

public class Ingredient extends Item {
    public final int quantity;

    public Ingredient(Item item, int quantity) {
        super(item.name);
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        Ingredient other = (Ingredient) obj;
        return this.name.equals(other.name) && this.quantity == other.quantity;
    }
}
