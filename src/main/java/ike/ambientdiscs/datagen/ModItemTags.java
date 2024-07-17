package ike.ambientdiscs.datagen;

import ike.ambientdiscs.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTags extends FabricTagProvider.ItemTagProvider {
    public ModItemTags(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .add(ModItems.MUSIC_DISC_ALPHA)
                .add(ModItems.MUSIC_DISC_ANCESTRY)
                .add(ModItems.MUSIC_DISC_A_FAMILIAR_ROOM)
                .add(ModItems.MUSIC_DISC_AN_ORDINARY_DAY)
                .add(ModItems.MUSIC_DISC_ARIA_MATH)
                .add(ModItems.MUSIC_DISC_AXOLOTL);
    }
}
