package ike.ambientdiscs.sound;

import ike.ambientdiscs.AmbientDiscs;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    //Music disc sound event
    //Name is referring to in sounds.json which is where the sound file itself is specified
    public static final SoundEvent ALPHA = registerSoundEvent("alpha");
    public static final SoundEvent ANCESTRY = registerSoundEvent("ancestry");
    public static final SoundEvent AN_ORDINARY_DAY = registerSoundEvent("an_ordinary_day");
    public static final SoundEvent ARIA_MATH = registerSoundEvent("aria_math");
    public static final SoundEvent AXOLOTL = registerSoundEvent("axolotl");

    //Registers the sound events
    private static SoundEvent registerSoundEvent(String name){
        Identifier id = Identifier.of(AmbientDiscs.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    //Print in log
    public static void registerSounds() {
        AmbientDiscs.LOGGER.info("Registering sounds...");
    }
}
