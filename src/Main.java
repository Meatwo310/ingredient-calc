import games.AssemblyLine2;

public class Main {
    public static void main(String[] args) {
        // 事前に定義されたゲームクラスを使用すると、事前に用意されたItemやRecipeGroupを利用できます
        final var game = new AssemblyLine2();

        // すでにItemが含まれています
//        System.out.println(game.ALUMINIUM.name);

        // 手動でItemを作成することもできます
//        final var HOGE = new Item("[T.0] hoge");
//        final var FUGA = new Item("[T.1] fuga");
//        final var PIYO = new Item("[T.2] piyo");
//        final var HOGERA = new Item("[SPECIAL] hogera");

        // RecipeGroupを作成して、レシピを登録できます
//        final var group = new RecipeGroup()
//                // addメソッドを使用してレシピを追加できます
//                .add(HOGE, FUGA, 2)
//                .add(FUGA, r -> r
//                        .add(PIYO)
//                        .add(HOGERA));

        // すでに登録されているレシピを利用することもできます
        final var group = game.group
                // 既存のRecipeGroupから、レシピの削除もできます
                // これはすべてのアイテムを分解したくない場合に有用です
//                .remove(game.EXPLOSIVE)
//                .remove(game.TRIGGER)
//                .remove(game.URANIUM_CELL)
//                .remove(game.PLUTONIUM_CELL)
//                .remove(game.URANIUM_CIRCUIT)
//                .remove(game.PLUTONIUM_CIRCUIT)
//                .remove(game.AI_ROBOT)
        ;

        // 特定のアイテムについてのレシピツリーを作成するには、getRecipeTreeメソッドを使用します
        final var tree = group.getRecipeTree(game.AI_ROBOT_BOMBER);

        // ツリーの構造を表示するには、printメソッドを使用します
        tree.print();
        System.out.println();

        // ツリーから必要な素材を計算し表示するには、printTotalメソッドを使用します
        tree.printTotal(false);
        System.out.println();

        // 中間素材を含めて表示するには、引数にtrueを渡します
        tree.printTotal(true);
    }
}
