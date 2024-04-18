import games.AssemblyLine2;
import general.Item;
import recipe.RecipeGroup;
import recipe.RecipeTree;

public class Main {
    public static void main(String[] args) {
        // originalSample();
        assemblyLine2Sample();
    }

    public static void originalSample() {
        // Itemを作成します。
        final Item COPPER       = new Item("[Ore] Copper");
        final Item GOLD         = new Item("[Ore] Gold");
        final Item COPPER_WIRE  = new Item("[T.0] Copper Wire");
        final Item CIRCUIT      = new Item("[T.1] Circuit");
        System.out.println("COPPER.name: " + COPPER.name + "\n");

        // RecipeGroupを作成して、レシピを登録します。
        final RecipeGroup group = new RecipeGroup()
                .add(COPPER_WIRE, COPPER)
                .add(CIRCUIT, r -> r
                        .add(COPPER_WIRE) // quantityは1個の場合省略可能
                        .add(GOLD));

        // RecipeGroupの構造を表示します。
        group.print();
        System.out.println();

        // 特定のItemについてのRecipeTreeを作成します。
        final RecipeTree tree = group.getRecipeTree(CIRCUIT);

        // RecipeTreeの構造を表示します。
        tree.print();
        System.out.println();

        // RecipeTreeから必要な素材を計算し表示します。
        tree.printTotal();
        System.out.println();

        // 中間素材を含めて表示するには、引数にtrueを渡します。
        tree.printTotal(true);
    }

    public static void assemblyLine2Sample() {
        // 事前に定義されたゲームクラスを使用することで、
        // 簡単にItemやRecipeGroupを利用できます。
        final var game = new AssemblyLine2();
        System.out.println("game.ALUMINIUM.name: " + game.ALUMINIUM.name + "\n");
        // game.group.print();

        // 既存のRecipeGroupを利用します。
        final RecipeGroup group = game.group
                // removeメソッドを使用してレシピを削除できます。
                // これはすべてのアイテムを分解したくない場合に有用です。
                        // .remove(game.EXPLOSIVE)
                        // .remove(game.AI_ROBOT)
        ;

        // 特定のアイテムについてのRecipeTreeを作成します。
        final RecipeTree tree = group.getRecipeTree(game.AI_ROBOT_BOMBER);

        // RecipeTreeから必要な素材を計算し表示します。
        tree.printTotal();
        System.out.println();

        // 中間素材を含めて表示するには、引数にtrueを渡します。
        tree.printTotal(true);
    }
}
