package ike.ambientdiscs;

import ike.ambientdiscs.datagen.ModItemTags;
import ike.ambientdiscs.datagen.ModModels;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class AmbientDiscsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModItemTags::new);
		pack.addProvider(ModModels::new);
	}
}
