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
                .add(ModItems.MUSIC_DISC_A_FAMILIAR_ROOM)
                .add(ModItems.MUSIC_DISC_ALPHA)
                .add(ModItems.MUSIC_DISC_AN_ORDINARY_DAY)
                .add(ModItems.MUSIC_DISC_ANCESTRY)
                .add(ModItems.MUSIC_DISC_ARIA_MATH)
                .add(ModItems.MUSIC_DISC_BROMELIAD)
                .add(ModItems.MUSIC_DISC_CLARK)
                .add(ModItems.MUSIC_DISC_COMFORTING_MEMORIES)
                .add(ModItems.MUSIC_DISC_CRESCENT_DUNES)
                .add(ModItems.MUSIC_DISC_DANNY)
                .add(ModItems.MUSIC_DISC_DEEPER)
                .add(ModItems.MUSIC_DISC_DRY_HANDS)
                .add(ModItems.MUSIC_DISC_ECHO_IN_THE_WIND)
                .add(ModItems.MUSIC_DISC_ELD_UNKNOWN)
                .add(ModItems.MUSIC_DISC_ENDLESS)
                .add(ModItems.MUSIC_DISC_FEATHERFALL)
                .add(ModItems.MUSIC_DISC_FLOATING_DREAM)
                .add(ModItems.MUSIC_DISC_HAGGSTROM)
                .add(ModItems.MUSIC_DISC_INFINITE_AMETHYST)
                .add(ModItems.MUSIC_DISC_KEY)
                .add(ModItems.MUSIC_DISC_KOMOREBI)
                .add(ModItems.MUSIC_DISC_LEFT_TO_BLOOM)
                .add(ModItems.MUSIC_DISC_LIVING_MICE)
                .add(ModItems.MUSIC_DISC_MICE_ON_VENUS)
                .add(ModItems.MUSIC_DISC_MINECRAFT)
                .add(ModItems.MUSIC_DISC_ONE_MORE_DAY)
                .add(ModItems.MUSIC_DISC_OXYGENE)
                .add(ModItems.MUSIC_DISC_POKOPOKO)
                .add(ModItems.MUSIC_DISC_PUZZLEBOX)
                .add(ModItems.MUSIC_DISC_STAND_TALL)
                .add(ModItems.MUSIC_DISC_SUBWOOFER_LULLABY)
                .add(ModItems.MUSIC_DISC_SWEDEN)
                .add(ModItems.MUSIC_DISC_WATCHER)
                .add(ModItems.MUSIC_DISC_WENDING)
                .add(ModItems.MUSIC_DISC_WET_HANDS)
                .add(ModItems.MUSIC_DISC_YAKUSOKU);
    }
}
