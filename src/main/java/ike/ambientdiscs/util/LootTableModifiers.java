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
    private static final Identifier SHIPWRECK_TREASURE_CHEST_ID
            = Identifier.of("minecraft", "chests/shipwreck_treasure");
    private static final Identifier JUNGLE_TEMPLE_BASEMENT_CHEST_ID
            = Identifier.of("minecraft", "chests/jungle_temple");

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
            if(source.isBuiltin() && SHIPWRECK_TREASURE_CHEST_ID.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3333f))
                        .with(ItemEntry.builder(ModItems.MUSIC_DISC_AXOLOTL))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f,1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }

            if(source.isBuiltin() && JUNGLE_TEMPLE_BASEMENT_CHEST_ID.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.6f))
                        .with(ItemEntry.builder(ModItems.MUSIC_DISC_A_FAMILIAR_ROOM))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f,5.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
        });
    }
}