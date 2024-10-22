package ike.ambientdiscs.util;

import ike.ambientdiscs.item.ModItems;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class LootTableModifiers {
    //Define loot tables with an internal identifier
    private static final Identifier JUNGLE_TEMPLE_CHEST
            = Identifier.of("minecraft", "chests/jungle_temple");
    private static final Identifier ENDER_DRAGON
            = Identifier.of("minecraft","entities/ender_dragon");
    private static final Identifier MINESHAFT
            = Identifier.of("minecraft", "chests/abandoned_mineshaft");
    private static final Identifier ANCIENT_CITY
            = Identifier.of("minecraft", "chests/ancient_city");
    private static final Identifier DUNGEON
            = Identifier.of("minecraft", "chests/simple_dungeon");
    private static final Identifier SHIPWRECK_TREASURE_CHEST
            = Identifier.of("minecraft", "chests/shipwreck_treasure");
    private static final Identifier NETHER_FORTRESS
            = Identifier.of("minecraft", "chests/nether_bridge");

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {

            //A Familiar Room
            //10% chance find in Jungle Temple chests
            if(source.isBuiltin() && JUNGLE_TEMPLE_CHEST.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f))
                        .with(ItemEntry.builder(ModItems.MUSIC_DISC_A_FAMILIAR_ROOM))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f,1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }

            //Alpha
            //100% chance to drop from the Ender Dragon
            if(source.isBuiltin() && ENDER_DRAGON.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1f))
                        .with(ItemEntry.builder(ModItems.MUSIC_DISC_ALPHA))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f,1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }

            //An Ordinary Day
            //5% chance to find in Mineshaft chests
            if(source.isBuiltin() && MINESHAFT.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.05f))
                        .with(ItemEntry.builder(ModItems.MUSIC_DISC_AN_ORDINARY_DAY))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f,1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }

            //Ancestry
            //8.4% chance to find in Ancient City chests
            if(source.isBuiltin() && ANCIENT_CITY.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.084f))
                        .with(ItemEntry.builder(ModItems.MUSIC_DISC_ANCESTRY))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f,1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }

            //Aria Math
            //15% chance to find in Dungeon chests
            if(source.isBuiltin() && DUNGEON.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.15f))
                        .with(ItemEntry.builder(ModItems.MUSIC_DISC_ARIA_MATH))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f,1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }

            //Axolotl
            //33% chance to find in Shipwreck treasure chests
            if(source.isBuiltin() && SHIPWRECK_TREASURE_CHEST.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3333f))
                        .with(ItemEntry.builder(ModItems.MUSIC_DISC_AXOLOTL))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f,1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }

            //Ballad of the Cats
            //6.7% chance to find in Dungeon chests
            if(source.isBuiltin() && NETHER_FORTRESS.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.067f))
                        .with(ItemEntry.builder(ModItems.MUSIC_DISC_BALLAD_OF_THE_CATS))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f,1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
        });
    }
}