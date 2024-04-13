package general;

public class Item {
    public final String name;

    public Item(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        Item other = (Item) obj;
        return this.name.equals(other.name);
    }
}
