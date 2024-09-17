package ike.ambientdiscs;

import ike.ambientdiscs.datagen.ModItemTags;
import ike.ambientdiscs.datagen.ModLangs;
import ike.ambientdiscs.datagen.ModModels;
import ike.ambientdiscs.sound.ModdedJukeboxSongs;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

import static ModLangs.addLanguageProviders;

public class AmbientDiscsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModItemTags::new);
		pack.addProvider(ModModels::new);
		addLanguageProviders(pack::addProvider);
	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.JUKEBOX_SONG, ModdedJukeboxSongs::bootstrap);
	}
}
