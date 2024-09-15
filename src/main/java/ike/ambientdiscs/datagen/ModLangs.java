package ike.ambientdiscs.datagen;

import ike.ambientdiscs.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLangs extends FabricLanguageProvider {
    public ModLangs(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> lookupCompletableFuture) {
        super(output, "en_gb", lookupCompletableFuture);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup lookup, TranslationBuilder translationBuilder){
        translationBuilder.add(ModItems.MUSIC_DISC_A_FAMILIAR_ROOM, "Music Disc");
    }
}