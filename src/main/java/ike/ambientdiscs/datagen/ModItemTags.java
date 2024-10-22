package ike.ambientdiscs.datagen;

import ike.ambientdiscs.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.item.Item;
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
                .add(ModItems.MUSIC_DISC_AERIE)
                .add(ModItems.MUSIC_DISC_BEGINNING_2)
                .add(ModItems.MUSIC_DISC_BIOME_FEST)
                .add(ModItems.MUSIC_DISC_BLIND_SPOTS)
                .add(ModItems.MUSIC_DISC_BOSS)
                .add(ModItems.MUSIC_DISC_BROMELIAD)
                .add(ModItems.MUSIC_DISC_CHRYSOPOEIA)
                .add(ModItems.MUSIC_DISC_CLARK)
                .add(ModItems.MUSIC_DISC_COMFORTING_MEMORIES)
                .add(ModItems.MUSIC_DISC_CONCRETE_HALLS)
                .add(ModItems.MUSIC_DISC_CRESCENT_DUNES)
                .add(ModItems.MUSIC_DISC_DANNY)
                .add(ModItems.MUSIC_DISC_DEAD_VOXEL)
                .add(ModItems.MUSIC_DISC_DEEPER)
                .add(ModItems.MUSIC_DISC_DRAGON_FISH)
                .add(ModItems.MUSIC_DISC_DREITON)
                .add(ModItems.MUSIC_DISC_DRY_HANDS)
                .add(ModItems.MUSIC_DISC_ECHO_IN_THE_WIND)
                .add(ModItems.MUSIC_DISC_ELD_UNKNOWN)
                .add(ModItems.MUSIC_DISC_ENDLESS)
                .add(ModItems.MUSIC_DISC_FEATHERFALL)
                .add(ModItems.MUSIC_DISC_FIREBUGS)
                .add(ModItems.MUSIC_DISC_FLOATING_DREAM)
                .add(ModItems.MUSIC_DISC_FLOATING_TREES)
                .add(ModItems.MUSIC_DISC_HAGGSTROM)
                .add(ModItems.MUSIC_DISC_HAUNT_MUSKIE)
                .add(ModItems.MUSIC_DISC_INFINITE_AMETHYST)
                .add(ModItems.MUSIC_DISC_KEY)
                .add(ModItems.MUSIC_DISC_KOMOREBI)
                .add(ModItems.MUSIC_DISC_LABYRINTHINE)
                .add(ModItems.MUSIC_DISC_LEFT_TO_BLOOM)
                .add(ModItems.MUSIC_DISC_LIVING_MICE)
                .add(ModItems.MUSIC_DISC_MICE_ON_VENUS)
                .add(ModItems.MUSIC_DISC_MINECRAFT)
                .add(ModItems.MUSIC_DISC_MOOG_CITY_2)
                .add(ModItems.MUSIC_DISC_MUTATION)
                .add(ModItems.MUSIC_DISC_ONE_MORE_DAY)
                .add(ModItems.MUSIC_DISC_OXYGENE)
                .add(ModItems.MUSIC_DISC_POKOPOKO)
                .add(ModItems.MUSIC_DISC_PUZZLEBOX)
                .add(ModItems.MUSIC_DISC_RUBEDO)
                .add(ModItems.MUSIC_DISC_SHUNIJI)
                .add(ModItems.MUSIC_DISC_SO_BELOW)
                .add(ModItems.MUSIC_DISC_STAND_TALL)
                .add(ModItems.MUSIC_DISC_SUBWOOFER_LULLABY)
                .add(ModItems.MUSIC_DISC_SWEDEN)
                .add(ModItems.MUSIC_DISC_TASWELL)
                .add(ModItems.MUSIC_DISC_THE_END)
                .add(ModItems.MUSIC_DISC_WARMTH)
                .add(ModItems.MUSIC_DISC_WATCHER)
                .add(ModItems.MUSIC_DISC_WENDING)
                .add(ModItems.MUSIC_DISC_WET_HANDS)
                .add(ModItems.MUSIC_DISC_YAKUSOKU);

        getOrCreateTagBuilder(ConventionalItemTags.MUSIC_DISCS)
                .add(ModItems.MUSIC_DISCS.toArray(Item[]::new));
    }
}