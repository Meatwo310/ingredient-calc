package games;

import general.Item;
import recipe.RecipeGroup;

public class AssemblyLine2 extends Game {
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
            .add(ALUMINIUM_CABLE, ALUMINIUM_WIRE.x(3))
            .add(COPPER_CABLE, COPPER_WIRE.x(3))
            .add(DIAMOND_CABLE, DIAMOND_WIRE.x(3))
            .add(GOLD_CABLE, GOLD_WIRE.x(3))
            .add(IRON_CABLE, IRON_WIRE.x(3))
            .add(PLUTONIUM_CABLE, PLUTONIUM_WIRE.x(3))
            .add(URANIUM_CABLE, URANIUM_WIRE.x(3))

            // Refined
            .add(PLUTONIUM_REFINED, PLUTONIUM)
            .add(URANIUM_REFINED, URANIUM)

            // Tier 1
            .add(CIRCUIT, COPPER_WIRE, GOLD)
            .add(SERVER_RACK, ALUMINIUM, IRON)
            .add(BATTERY, COPPER, COPPER_LIQUID)
            .add(ENGINE, IRON_GEAR, IRON)
            .add(SOLAR_CELL, DIAMOND_LIQUID, GOLD)
            .add(ELECTRIC_BOARD, COPPER_WIRE, ALUMINIUM)
            .add(HEATER_PLATE, IRON_WIRE, ALUMINIUM)
            
            // Tier 2
            .add(FAN,
                    CIRCUIT.x(1),
                    DIAMOND_GEAR.x(3),
                    ALUMINIUM.x(6))
            .add(POWER_SUPPLY,
                    CIRCUIT.x(1),
                    DIAMOND.x(6),
                    ALUMINIUM_LIQUID.x(3))
            .add(PROCESSOR,
                    CIRCUIT.x(1),
                    GOLD_LIQUID.x(3),
                    DIAMOND_WIRE.x(3))
            .add(SOLAR_PANEL,
                    SOLAR_CELL.x(2),
                    CIRCUIT.x(1),
                    ELECTRIC_BOARD.x(2))
            
            // Tier 3
            .add(COMPUTER,
                    FAN.x(1),
                    POWER_SUPPLY.x(1),
                    PROCESSOR.x(1))
            .add(ADVANCED_ENGINE,
                    ENGINE.x(5),
                    CIRCUIT.x(5),
                    DIAMOND.x(10))
            .add(LASER,
                    BATTERY.x(5),
                    HEATER_PLATE.x(5),
                    IRON_LIQUID.x(5))
            
            // Tier 4
            .add(SUPER_COMPUTER,
                    COMPUTER.x(2),
                    SERVER_RACK.x(1),
                    CIRCUIT.x(3),
                    GOLD_CABLE.x(3))
            .add(ELECTRIC_ENGINE,
                    BATTERY.x(2),
                    ADVANCED_ENGINE.x(2),
                    ELECTRIC_BOARD.x(2),
                    IRON_PLATE.x(5))
            .add(AI_ROBOT_ARMS,
                    LASER.x(2),
                    ALUMINIUM_PLATE.x(2),
                    ALUMINIUM_CABLE.x(3),
                    IRON.x(8))
            
            // Tier 5
            .add(AI_PROCESSOR,
                    CIRCUIT.x(10),
                    SUPER_COMPUTER.x(1),
                    COPPER_PLATE.x(6),
                    COPPER_WIRE.x(4))
            .add(AI_ROBOT_HEAD,
                    AI_PROCESSOR.x(1),
                    GOLD_PLATE.x(5),
                    DIAMOND_CABLE.x(10),
                    CIRCUIT.x(10))
            .add(AI_ROBOT_BODY,
                    ELECTRIC_ENGINE.x(1),
                    SOLAR_PANEL.x(2),
                    AI_ROBOT_ARMS.x(1),
                    ELECTRIC_BOARD.x(5))
            
            // Tier 6
            .add(AI_ROBOT,
                    AI_ROBOT_BODY.x(1),
                    AI_ROBOT_HEAD.x(1),
                    IRON_PLATE.x(10),
                    DIAMOND_CABLE.x(5))
            
            // Tier 7
            .add(PLUTONIUM_CELL,
                    PLUTONIUM.x(2),
                    SOLAR_CELL.x(2),
                    DIAMOND_LIQUID.x(2),
                    GOLD_CABLE.x(2),
                    COPPER_CABLE.x(2))
            .add(URANIUM_CELL,
                    URANIUM.x(2),
                    SOLAR_CELL.x(2),
                    DIAMOND_LIQUID.x(2),
                    GOLD_CABLE.x(2),
                    COPPER_CABLE.x(2))
            .add(PLUTONIUM_CIRCUIT,
                    PLUTONIUM.x(4),
                    CIRCUIT.x(5),
                    COPPER.x(5),
                    GOLD_CABLE.x(1),
                    DIAMOND_WIRE.x(2))
            .add(URANIUM_CIRCUIT,
                    URANIUM.x(4),
                    CIRCUIT.x(5),
                    COPPER.x(5),
                    GOLD_CABLE.x(1),
                    DIAMOND_WIRE.x(2))
            .add(EXPLOSIVE,
                    CIRCUIT.x(5),
                    DIAMOND_WIRE.x(10),
                    COPPER_WIRE.x(10),
                    HEATER_PLATE.x(10))
            .add(TRIGGER,
                    IRON.x(40),
                    DIAMOND_WIRE.x(10),
                    CIRCUIT.x(5),
                    ELECTRIC_BOARD.x(5))

            // Tier 8+
            .add(NUCLEAR_CELL,
                    URANIUM_CELL.x(1),
                    PLUTONIUM_CELL.x(1),
                    SOLAR_CELL.x(3),
                    ELECTRIC_BOARD.x(3),
                    HEATER_PLATE.x(3))
            .add(NUCLEAR_CIRCUIT,
                    URANIUM_CIRCUIT.x(1),
                    PLUTONIUM_CIRCUIT.x(1),
                    CIRCUIT.x(3),
                    GOLD_CABLE.x(3),
                    PROCESSOR.x(3))
            .add(IGNITION_SYSTEM,
                    TRIGGER.x(2),
                    EXPLOSIVE.x(5),
                    AI_PROCESSOR.x(2),
                    BATTERY.x(5))
            .add(NUCLEAR_CORE,
                    NUCLEAR_CELL.x(1),
                    URANIUM_CELL.x(1),
                    PLUTONIUM_CELL.x(1),
                    PROCESSOR.x(10),
                    DIAMOND_CABLE.x(4),
                    GOLD_CABLE.x(4))
            .add(NUCLEAR_PROCESSOR,
                    NUCLEAR_CIRCUIT.x(1),
                    URANIUM_CIRCUIT.x(1),
                    PLUTONIUM_CIRCUIT.x(1),
                    AI_PROCESSOR.x(1),
                    PROCESSOR.x(5),
                    DIAMOND_PLATE.x(10))
            .add(ATOMIC_BOMB,
                    NUCLEAR_PROCESSOR.x(1),
                    NUCLEAR_CORE.x(1),
                    IGNITION_SYSTEM.x(1),
                    NUCLEAR_CELL.x(1),
                    URANIUM.x(15),
                    PLUTONIUM.x(15))
            .add(AI_ROBOT_BOMBER,
                    ATOMIC_BOMB.x(1),
                    AI_ROBOT.x(1),
                    AI_PROCESSOR.x(2),
                    NUCLEAR_CELL.x(3),
                    NUCLEAR_PROCESSOR.x(1),
                    NUCLEAR_CIRCUIT.x(3));
}
