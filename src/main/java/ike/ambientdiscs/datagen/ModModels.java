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
        itemModelGenerator.register(ModItems.MUSIC_DISC_ALPHA, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_ANCESTRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_A_FAMILIAR_ROOM, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_AN_ORDINARY_DAY, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_ARIA_MATH, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_AXOLOTL, Models.GENERATED);
    }
}
