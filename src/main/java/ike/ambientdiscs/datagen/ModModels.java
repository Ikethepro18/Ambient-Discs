package ike.ambientdiscs.datagen;

import ike.ambientdiscs.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModels extends FabricModelProvider {
    public ModModels(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    //Generates model json files
    //Copy paste to add more
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.MUSIC_DISC_A_FAMILIAR_ROOM, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_ALPHA, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_AN_ORDINARY_DAY, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_ANCESTRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_ARIA_MATH, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_AXOLOTL, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_BROMELIAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_CLARK, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_COMFORTING_MEMORIES, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_CRESCENT_DUNES, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_DANNY, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_DEEPER, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_DRY_HANDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_ECHO_IN_THE_WIND, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_ELD_UNKNOWN, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_ENDLESS, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_FEATHERFALL, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_FLOATING_DREAM, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_HAGGSTROM, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_INFINITE_AMETHYST, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_KEY, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_KOMOREBI, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_LEFT_TO_BLOOM, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_LIVING_MICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_MICE_ON_VENUS, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_MINECRAFT, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_ONE_MORE_DAY, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_OXYGENE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_POKOPOKO, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_PUZZLEBOX, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_STAND_TALL, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_SUBWOOFER_LULLABY, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_SWEDEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_WATCHER, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_WENDING, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_WET_HANDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_YAKUSOKU, Models.GENERATED);
    }
}
