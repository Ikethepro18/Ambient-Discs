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
        itemModelGenerator.register(ModItems.MUSIC_DISC_AERIE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_ALPHA, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_AN_ORDINARY_DAY, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_ANCESTRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_ARIA_MATH, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_AXOLOTL, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_BALLAD_OF_THE_CATS, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_BEGINNING_2, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_BIOME_FEST, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_BLIND_SPOTS, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_BOSS, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_BROMELIAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_CHRYSOPOEIA, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_CLARK, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_COMFORTING_MEMORIES, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_CONCRETE_HALLS, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_CRESCENT_DUNES, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_DANNY, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_DEAD_VOXEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_DEEPER, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_DRAGON_FISH, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_DREITON, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_DRY_HANDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_ECHO_IN_THE_WIND, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_ELD_UNKNOWN, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_ENDLESS, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_FEATHERFALL, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_FIREBUGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_FLOATING_DREAM, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_FLOATING_TREES, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_HAGGSTROM, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_HAUNT_MUSKIE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_INFINITE_AMETHYST, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_KEY, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_KOMOREBI, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_LABYRINTHINE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_LEFT_TO_BLOOM, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_LIVING_MICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_MICE_ON_VENUS, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_MINECRAFT, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_MOOG_CITY_2, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_MUTATION, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_ONE_MORE_DAY, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_OXYGENE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_POKOPOKO, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_PUZZLEBOX, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_RUBEDO, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_SHUNIJI, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_SO_BELOW, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_STAND_TALL, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_SUBWOOFER_LULLABY, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_SWEDEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_TASWELL, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_THE_END, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_WARMTH, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_WATCHER, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_WENDING, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_WET_HANDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_YAKUSOKU, Models.GENERATED);
    }
}
