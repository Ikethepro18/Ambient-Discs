package ike.ambientdiscs;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AmbientDiscs implements ModInitializer {
	public static final String MOD_ID = "ambient-discs";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Starting Ambient Discs...");
	}
}