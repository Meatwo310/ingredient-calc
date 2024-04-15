package games;

import general.Item;
import recipe.RecipeGroup;

public class AssemblyLine2 {
    // Ore
    public final Item ALUMINIUM = new Item("[Ore] Aluminium");
    public final Item COPPER = new Item("[Ore] Copper");
    public final Item DIAMOND = new Item("[Ore] Diamond");
    public final Item GOLD = new Item("[Ore] Gold");
    public final Item IRON = new Item("[Ore] Iron");
    public final Item PLUTONIUM = new Item("[Ore] Plutonium");
    public final Item URANIUM = new Item("[Ore] Uranium");

    // Wire
    public final Item ALUMINIUM_WIRE = new Item("[T.0] Aluminium Wire");
    public final Item COPPER_WIRE = new Item("[T.0] Copper Wire");
    public final Item DIAMOND_WIRE = new Item("[T.0] Diamond Wire");
    public final Item GOLD_WIRE = new Item("[T.0] Gold Wire");
    public final Item IRON_WIRE = new Item("[T.0] Iron Wire");
    public final Item PLUTONIUM_WIRE = new Item("[T.0] Plutonium Wire");
    public final Item URANIUM_WIRE = new Item("[T.0] Uranium Wire");

    // Gear
    public final Item ALUMINIUM_GEAR = new Item("[T.0] Aluminium Gear");
    public final Item COPPER_GEAR = new Item("[T.0] Copper Gear");
    public final Item DIAMOND_GEAR = new Item("[T.0] Diamond Gear");
    public final Item GOLD_GEAR = new Item("[T.0] Gold Gear");
    public final Item IRON_GEAR = new Item("[T.0] Iron Gear");

    // Liquid
    public final Item ALUMINIUM_LIQUID = new Item("[T.0] Aluminium Liquid");
    public final Item COPPER_LIQUID = new Item("[T.0] Copper Liquid");
    public final Item DIAMOND_LIQUID = new Item("[T.0] Diamond Liquid");
    public final Item GOLD_LIQUID = new Item("[T.0] Gold Liquid");
    public final Item IRON_LIQUID = new Item("[T.0] Iron Liquid");

    // Plate
    public final Item ALUMINIUM_PLATE = new Item("[T.0] Aluminium Plate");
    public final Item COPPER_PLATE = new Item("[T.0] Copper Plate");
    public final Item DIAMOND_PLATE = new Item("[T.0] Diamond Plate");
    public final Item GOLD_PLATE = new Item("[T.0] Gold Plate");
    public final Item IRON_PLATE = new Item("[T.0] Iron Plate");

    // Cable
    public final Item ALUMINIUM_CABLE = new Item("[T.0] Aluminium Cable");
    public final Item COPPER_CABLE = new Item("[T.0] Copper Cable");
    public final Item DIAMOND_CABLE = new Item("[T.0] Diamond Cable");
    public final Item GOLD_CABLE = new Item("[T.0] Gold Cable");
    public final Item IRON_CABLE = new Item("[T.0] Iron Cable");
    public final Item PLUTONIUM_CABLE = new Item("[T.0] Plutonium Cable");
    public final Item URANIUM_CABLE = new Item("[T.0] Uranium Cable");

    // Refined
    public final Item PLUTONIUM_REFINED = new Item("[T.0] Plutonium Refined");
    public final Item URANIUM_REFINED = new Item("[T.0] Uranium Refined");

    // Tier 1
    public final Item SERVER_RACK = new Item("[T.1] Server Rack");
    public final Item CIRCUIT = new Item("[T.1] Circuit");
    public final Item ELECTRIC_BOARD = new Item("[T.1] Electric Board");
    public final Item HEATER_PLATE = new Item("[T.1] Heater Plate");
    public final Item BATTERY = new Item("[T.1] Battery");
    public final Item ENGINE = new Item("[T.1] Engine");
    public final Item SOLAR_CELL = new Item("[T.1] Solar Cell");

    // Tier 2
    public final Item PROCESSOR = new Item("[T.2] Processor");
    public final Item FAN = new Item("[T.2] Fan");
    public final Item POWER_SUPPLY = new Item("[T.2] Power Supply");
    public final Item SOLAR_PANEL = new Item("[T.2] Solar Panel");

    // Tier 3
    public final Item ADVANCED_ENGINE = new Item("[T.3] Advanced Engine");
    public final Item LASER = new Item("[T.3] Laser");
    public final Item COMPUTER = new Item("[T.3] Computer");

    // Tier 4
    public final Item ELECTRIC_ENGINE = new Item("[T.4] Electric Engine");
    public final Item AI_ROBOT_ARMS = new Item("[T.4] AI Robot Arms");
    public final Item SUPER_COMPUTER = new Item("[T.4] Super Computer");

    // Tier 5
    public final Item AI_ROBOT_BODY = new Item("[T.5] AI Robot Body");
    public final Item AI_PROCESSOR = new Item("[T.5] AI Processor");
    public final Item AI_ROBOT_HEAD = new Item("[T.5] AI Robot Head");

    // Tier 6
    public final Item AI_ROBOT = new Item("[T.6] AI Robot");

    // Tier 7
    public final Item TRIGGER = new Item("[T.7] Trigger");
    public final Item EXPLOSIVE = new Item("[T.7] Explosive");
    public final Item PLUTONIUM_CELL = new Item("[T.7] Plutonium Cell");
    public final Item URANIUM_CELL = new Item("[T.7] Uranium Cell");
    public final Item PLUTONIUM_CIRCUIT = new Item("[T.7] Plutonium Circuit");
    public final Item URANIUM_CIRCUIT = new Item("[T.7] Uranium Circuit");

    // Tier 8+
    public final Item NUCLEAR_CELL = new Item("[T.8+] Nuclear Cell");
    public final Item NUCLEAR_CIRCUIT = new Item("[T.8+] Nuclear Circuit");
    public final Item NUCLEAR_CORE = new Item("[T.8+] Nuclear Core");
    public final Item IGNITION_SYSTEM = new Item("[T.8+] Ignition System");
    public final Item NUCLEAR_PROCESSOR = new Item("[T.8+] Nuclear Processor");
    public final Item ATOMIC_BOMB = new Item("[T.8+] Atomic Bomb");
    public final Item AI_ROBOT_BOMBER = new Item("[T.8+] AI Robot Bomber");

    public final RecipeGroup group = new RecipeGroup()
            // Wire
            .add(ALUMINIUM_WIRE, ALUMINIUM)
            .add(COPPER_WIRE, COPPER)
            .add(DIAMOND_WIRE, DIAMOND)
            .add(GOLD_WIRE, GOLD)
            .add(IRON_WIRE, IRON)

            // Gear
            .add(ALUMINIUM_GEAR, ALUMINIUM)
            .add(COPPER_GEAR, COPPER)
            .add(DIAMOND_GEAR, DIAMOND)
            .add(GOLD_GEAR, GOLD)
            .add(IRON_GEAR, IRON)

            // Liquid
            .add(ALUMINIUM_LIQUID, ALUMINIUM)
            .add(COPPER_LIQUID, COPPER)
            .add(DIAMOND_LIQUID, DIAMOND)
            .add(GOLD_LIQUID, GOLD)
            .add(IRON_LIQUID, IRON)

            // Plate
            .add(ALUMINIUM_PLATE, ALUMINIUM)
            .add(COPPER_PLATE, COPPER)
            .add(DIAMOND_PLATE, DIAMOND)
            .add(GOLD_PLATE, GOLD)
            .add(IRON_PLATE, IRON)

            // Cable
            .add(ALUMINIUM_CABLE, ALUMINIUM_WIRE, 3)
            .add(COPPER_CABLE, COPPER_WIRE, 3)
            .add(DIAMOND_CABLE, DIAMOND_WIRE, 3)
            .add(GOLD_CABLE, GOLD_WIRE, 3)
            .add(IRON_CABLE, IRON_WIRE, 3)
            .add(PLUTONIUM_CABLE, PLUTONIUM_WIRE, 3)
            .add(URANIUM_CABLE, URANIUM_WIRE, 3)

            // Refined
            .add(PLUTONIUM_REFINED, PLUTONIUM)
            .add(URANIUM_REFINED, URANIUM)

            // Tier 1
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
            
            // Tier 2
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
            
            // Tier 3
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
            
            // Tier 4
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
            
            // Tier 5
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
            
            // Tier 6
            .add(AI_ROBOT, r -> r
                    .add(AI_ROBOT_BODY)
                    .add(AI_ROBOT_HEAD)
                    .add(IRON_PLATE, 10)
                    .add(DIAMOND_CABLE, 5))
            
            // Tier 7
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

            // Tier 8+
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
}
