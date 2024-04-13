import general.Item;
import recipe.RecipeGroup;

public class Main {
    public static void main(String[] args) {
        // Ore
        final var ALUMINIUM = new Item("[!] Aluminium");
        final var COPPER = new Item("[!] Copper");
        final var DIAMOND = new Item("[!] Diamond");
        final var GOLD = new Item("[!] Gold");
        final var IRON = new Item("[!] Iron");
        final var PLUTONIUM = new Item("[!] Plutonium");
        final var URANIUM = new Item("[!] Uranium");

        // Wire
        final var ALUMINIUM_WIRE = new Item("[T.0] Aluminium Wire");
        final var COPPER_WIRE = new Item("[T.0] Copper Wire");
        final var DIAMOND_WIRE = new Item("[T.0] Diamond Wire");
        final var GOLD_WIRE = new Item("[T.0] Gold Wire");
        final var IRON_WIRE = new Item("[T.0] Iron Wire");
        final var PLUTONIUM_WIRE = new Item("[T.0] Plutonium Wire");
        final var URANIUM_WIRE = new Item("[T.0] Uranium Wire");

        // Gear
        final var ALUMINIUM_GEAR = new Item("[T.0] Aluminium Gear");
        final var COPPER_GEAR = new Item("[T.0] Copper Gear");
        final var DIAMOND_GEAR = new Item("[T.0] Diamond Gear");
        final var GOLD_GEAR = new Item("[T.0] Gold Gear");
        final var IRON_GEAR = new Item("[T.0] Iron Gear");

        // Liquid
        final var ALUMINIUM_LIQUID = new Item("[T.0] Aluminium Liquid");
        final var COPPER_LIQUID = new Item("[T.0] Copper Liquid");
        final var DIAMOND_LIQUID = new Item("[T.0] Diamond Liquid");
        final var GOLD_LIQUID = new Item("[T.0] Gold Liquid");
        final var IRON_LIQUID = new Item("[T.0] Iron Liquid");

        // Plate
        final var ALUMINIUM_PLATE = new Item("[T.0] Aluminium Plate");
        final var COPPER_PLATE = new Item("[T.0] Copper Plate");
        final var DIAMOND_PLATE = new Item("[T.0] Diamond Plate");
        final var GOLD_PLATE = new Item("[T.0] Gold Plate");
        final var IRON_PLATE = new Item("[T.0] Iron Plate");

        // Cable
        final var ALUMINIUM_CABLE = new Item("[T.0] Aluminium Cable");
        final var COPPER_CABLE = new Item("[T.0] Copper Cable");
        final var DIAMOND_CABLE = new Item("[T.0] Diamond Cable");
        final var GOLD_CABLE = new Item("[T.0] Gold Cable");
        final var IRON_CABLE = new Item("[T.0] Iron Cable");
        final var PLUTONIUM_CABLE = new Item("[T.0] Plutonium Cable");
        final var URANIUM_CABLE = new Item("[T.0] Uranium Cable");

        // Refined
        final var PLUTONIUM_REFINED = new Item("[T.0] Plutonium Refined");
        final var URANIUM_REFINED = new Item("[T.0] Uranium Refined");

        // Tier 1
        final var SERVER_RACK = new Item("[T.1] Server Rack");
        final var CIRCUIT = new Item("[T.1] Circuit");
        final var ELECTRIC_BOARD = new Item("[T.1] Electric Board");
        final var HEATER_PLATE = new Item("[T.1] Heater Plate");
        final var BATTERY = new Item("[T.1] Battery");
        final var ENGINE = new Item("[T.1] Engine");
        final var SOLAR_CELL = new Item("[T.1] Solar Cell");

        // Tier 2
        final var PROCESSOR = new Item("[T.2] Processor");
        final var FAN = new Item("[T.2] Fan");
        final var POWER_SUPPLY = new Item("[T.2] Power Supply");
        final var SOLAR_PANEL = new Item("[T.2] Solar Panel");

        // Tier 3
        final var ADVANCED_ENGINE = new Item("[T.3] Advanced Engine");
        final var LASER = new Item("[T.3] Laser");
        final var COMPUTER = new Item("[T.3] Computer");

        // Tier 4
        final var ELECTRIC_ENGINE = new Item("[T.4] Electric Engine");
        final var AI_ROBOT_ARMS = new Item("[T.4] AI Robot Arms");
        final var SUPER_COMPUTER = new Item("[T.4] Super Computer");

        // Tier 5
        final var AI_ROBOT_BODY = new Item("[T.5] AI Robot Body");
        final var AI_PROCESSOR = new Item("[T.5] AI Processor");
        final var AI_ROBOT_HEAD = new Item("[T.5] AI Robot Head");

        // Tier 6
        final var AI_ROBOT = new Item("[T.6] AI Robot");

        // Tier 7
        final var TRIGGER = new Item("[T.7] Trigger");
        final var EXPLOSIVE = new Item("[T.7] Explosive");
        final var PLUTONIUM_CELL = new Item("[T.7] Plutonium Cell");
        final var URANIUM_CELL = new Item("[T.7] Uranium Cell");
        final var PLUTONIUM_CIRCUIT = new Item("[T.7] Plutonium Circuit");
        final var URANIUM_CIRCUIT = new Item("[T.7] Uranium Circuit");

        // Tier 8+
        final var NUCLEAR_CELL = new Item("[T.8+] Nuclear Cell");
        final var NUCLEAR_CIRCUIT = new Item("[T.8+] Nuclear Circuit");
        final var NUCLEAR_CORE = new Item("[T.8+] Nuclear Core");
        final var IGNITION_SYSTEM = new Item("[T.8+] Ignition System");
        final var NUCLEAR_PROCESSOR = new Item("[T.8+] Nuclear Processor");
        final var ATOMIC_BOMB = new Item("[T.8+] Atomic Bomb");
        final var AI_ROBOT_BOMBER = new Item("[T.8+] AI Robot Bomber");


        final var group = new RecipeGroup()
                .add(ALUMINIUM_WIRE, r -> r
                        .add(ALUMINIUM))
                .add(COPPER_WIRE, r -> r
                        .add(COPPER))
                .add(DIAMOND_WIRE, r -> r
                        .add(DIAMOND))
                .add(GOLD_WIRE, r -> r
                        .add(GOLD))
                .add(IRON_WIRE, r -> r
                        .add(IRON))

                .add(ALUMINIUM_GEAR, r -> r
                        .add(ALUMINIUM))
                .add(COPPER_GEAR, r -> r
                        .add(COPPER))
                .add(DIAMOND_GEAR, r -> r
                        .add(DIAMOND))
                .add(GOLD_GEAR, r -> r
                        .add(GOLD))
                .add(IRON_GEAR, r -> r
                        .add(IRON))

                .add(ALUMINIUM_LIQUID, r -> r
                        .add(ALUMINIUM))
                .add(COPPER_LIQUID, r -> r
                        .add(COPPER))
                .add(DIAMOND_LIQUID, r -> r
                        .add(DIAMOND))
                .add(GOLD_LIQUID, r -> r
                        .add(GOLD))
                .add(IRON_LIQUID, r -> r
                        .add(IRON))

                .add(ALUMINIUM_PLATE, r -> r
                        .add(ALUMINIUM))
                .add(COPPER_PLATE, r -> r
                        .add(COPPER))
                .add(DIAMOND_PLATE, r -> r
                        .add(DIAMOND))
                .add(GOLD_PLATE, r -> r
                        .add(GOLD))
                .add(IRON_PLATE, r -> r
                        .add(IRON))

                .add(ALUMINIUM_CABLE, r -> r
                        .add(ALUMINIUM_WIRE, 3))
                .add(COPPER_CABLE, r -> r
                        .add(COPPER_WIRE, 3))
                .add(DIAMOND_CABLE, r -> r
                        .add(DIAMOND_WIRE, 3))
                .add(GOLD_CABLE, r -> r
                        .add(GOLD_WIRE, 3))
                .add(IRON_CABLE, r -> r
                        .add(IRON_WIRE, 3))
                .add(PLUTONIUM_CABLE, r -> r
                        .add(PLUTONIUM_WIRE, 3))
                .add(URANIUM_CABLE, r -> r
                        .add(URANIUM_WIRE, 3))

                .add(PLUTONIUM_REFINED, r -> r
                        .add(PLUTONIUM))
                .add(URANIUM_REFINED, r -> r
                        .add(URANIUM))

                .add(CIRCUIT, r -> r
                        .add(COPPER_WIRE)
                        .add(GOLD))
                .add(SERVER_RACK, r -> r
                        .add(ALUMINIUM)
                        .add(IRON))
                .add(BATTERY, r -> r
                        .add(COPPER)
                        .add(COPPER_LIQUID))
                .add(ENGINE, r -> r
                        .add(IRON_GEAR)
                        .add(IRON))
                .add(SOLAR_CELL, r -> r
                        .add(DIAMOND_LIQUID)
                        .add(GOLD))
                .add(ELECTRIC_BOARD, r -> r
                        .add(COPPER_WIRE)
                        .add(ALUMINIUM))
                .add(HEATER_PLATE, r -> r
                        .add(IRON_WIRE)
                        .add(ALUMINIUM))
                .add(FAN, r -> r
                        .add(CIRCUIT)
                        .add(DIAMOND_GEAR, 3)
                        .add(ALUMINIUM, 6))
                .add(POWER_SUPPLY, r -> r
                        .add(CIRCUIT)
                        .add(DIAMOND, 6)
                        .add(ALUMINIUM_LIQUID, 3))
                .add(PROCESSOR, r -> r
                        .add(CIRCUIT)
                        .add(GOLD_LIQUID, 3)
                        .add(DIAMOND_WIRE, 3))
                .add(SOLAR_PANEL, r -> r
                        .add(SOLAR_CELL, 2)
                        .add(CIRCUIT)
                        .add(ELECTRIC_BOARD, 2))
                .add(COMPUTER, r -> r
                        .add(FAN)
                        .add(POWER_SUPPLY)
                        .add(PROCESSOR))
                .add(ADVANCED_ENGINE, r -> r
                        .add(ENGINE, 5)
                        .add(CIRCUIT, 5)
                        .add(DIAMOND, 10))
                .add(LASER, r -> r
                        .add(BATTERY, 5)
                        .add(HEATER_PLATE, 5)
                        .add(IRON_LIQUID, 5))
                .add(SUPER_COMPUTER, r -> r
                        .add(COMPUTER, 2)
                        .add(SERVER_RACK)
                        .add(CIRCUIT, 3)
                        .add(GOLD_CABLE, 3))
                .add(ELECTRIC_ENGINE, r -> r
                        .add(BATTERY, 2)
                        .add(ADVANCED_ENGINE, 2)
                        .add(ELECTRIC_BOARD, 2)
                        .add(IRON_PLATE, 5))
                .add(AI_ROBOT_ARMS, r -> r
                        .add(LASER, 2)
                        .add(ALUMINIUM_PLATE, 2)
                        .add(ALUMINIUM_CABLE, 3)
                        .add(IRON, 8))
                .add(AI_PROCESSOR, r -> r
                        .add(CIRCUIT, 10)
                        .add(SUPER_COMPUTER)
                        .add(COPPER_PLATE, 6)
                        .add(COPPER_WIRE, 4))
                .add(AI_ROBOT_HEAD, r -> r
                        .add(AI_PROCESSOR)
                        .add(GOLD_PLATE, 5)
                        .add(DIAMOND_CABLE, 10)
                        .add(CIRCUIT, 10))
                .add(AI_ROBOT_BODY, r -> r
                        .add(ELECTRIC_ENGINE)
                        .add(SOLAR_PANEL, 2)
                        .add(AI_ROBOT_ARMS)
                        .add(ELECTRIC_BOARD, 5))
                .add(AI_ROBOT, r -> r
                        .add(AI_ROBOT_BODY)
                        .add(AI_ROBOT_HEAD)
                        .add(IRON_PLATE, 10)
                        .add(DIAMOND_CABLE, 5))
                .add(PLUTONIUM_CELL, r -> r
                        .add(PLUTONIUM, 2)
                        .add(SOLAR_CELL, 2)
                        .add(DIAMOND_LIQUID, 2)
                        .add(GOLD_CABLE, 2)
                        .add(COPPER_CABLE, 2))
                .add(URANIUM_CELL, r -> r
                        .add(URANIUM, 2)
                        .add(SOLAR_CELL, 2)
                        .add(DIAMOND_LIQUID, 2)
                        .add(GOLD_CABLE, 2)
                        .add(COPPER_CABLE, 2))
                .add(PLUTONIUM_CIRCUIT, r -> r
                        .add(PLUTONIUM, 4)
                        .add(CIRCUIT, 5)
                        .add(COPPER, 5)
                        .add(GOLD_CABLE)
                        .add(DIAMOND_WIRE, 2))
                .add(URANIUM_CIRCUIT, r -> r
                        .add(URANIUM, 4)
                        .add(CIRCUIT, 5)
                        .add(COPPER, 5)
                        .add(GOLD_CABLE)
                        .add(DIAMOND_WIRE, 2))
                .add(EXPLOSIVE, r -> r
                        .add(CIRCUIT, 5)
                        .add(DIAMOND_WIRE, 10)
                        .add(COPPER_WIRE, 10)
                        .add(HEATER_PLATE, 10))
                .add(TRIGGER, r -> r
                        .add(IRON, 40)
                        .add(DIAMOND_WIRE, 10)
                        .add(CIRCUIT, 5)
                        .add(ELECTRIC_BOARD, 5))

                .add(NUCLEAR_CELL, r -> r
                        .add(URANIUM_CELL)
                        .add(PLUTONIUM_CELL)
                        .add(SOLAR_CELL, 3)
                        .add(ELECTRIC_BOARD, 3)
                        .add(HEATER_PLATE, 3))
                .add(NUCLEAR_CIRCUIT, r -> r
                        .add(URANIUM_CIRCUIT)
                        .add(PLUTONIUM_CIRCUIT)
                        .add(CIRCUIT, 3)
                        .add(GOLD_CABLE, 3)
                        .add(PROCESSOR, 3))
                .add(IGNITION_SYSTEM, r -> r
                        .add(TRIGGER, 2)
                        .add(EXPLOSIVE, 5)
                        .add(AI_PROCESSOR, 2)
                        .add(BATTERY, 5))
                .add(NUCLEAR_CORE, r -> r
                        .add(NUCLEAR_CELL)
                        .add(URANIUM_CELL)
                        .add(PLUTONIUM_CELL)
                        .add(PROCESSOR, 10)
                        .add(DIAMOND_CABLE, 4)
                        .add(GOLD_CABLE, 4))
                .add(NUCLEAR_PROCESSOR, r -> r
                        .add(NUCLEAR_CIRCUIT)
                        .add(URANIUM_CIRCUIT)
                        .add(PLUTONIUM_CIRCUIT)
                        .add(AI_PROCESSOR)
                        .add(PROCESSOR, 5)
                        .add(DIAMOND_PLATE, 10))
                .add(ATOMIC_BOMB, r -> r
                        .add(NUCLEAR_PROCESSOR)
                        .add(NUCLEAR_CORE)
                        .add(IGNITION_SYSTEM)
                        .add(NUCLEAR_CELL)
                        .add(URANIUM, 15)
                        .add(PLUTONIUM, 15))
                .add(AI_ROBOT_BOMBER, r -> r
                        .add(ATOMIC_BOMB)
                        .add(AI_ROBOT)
                        .add(AI_PROCESSOR,  2)
                        .add(NUCLEAR_CELL, 3)
                        .add(NUCLEAR_PROCESSOR)
                        .add(NUCLEAR_CIRCUIT, 3));

        final var tree = group.getRecipeTree(ATOMIC_BOMB, 1);

        tree.print();
        System.out.println();
        tree.printTotal(false);
        System.out.println();
        tree.printTotal(true);
    }
}
