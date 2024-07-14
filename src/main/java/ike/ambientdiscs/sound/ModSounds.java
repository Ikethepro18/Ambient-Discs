package ike.ambientdiscs.sound;

import ike.ambientdiscs.AmbientDiscs;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    //Music disc sound event
    //Name is referring to in sounds.json which is where the sound file itself is specified
    public static final RegistryEntry.Reference<SoundEvent> ALPHA = registerReference("alpha");
    public static final RegistryEntry.Reference<SoundEvent> ANCESTRY = registerReference("ancestry");
    public static final RegistryEntry.Reference<SoundEvent> AN_ORDINARY_DAY = registerReference("an_ordinary_day");
    public static final RegistryEntry.Reference<SoundEvent> ARIA_MATH = registerReference("aria_math");
    public static final RegistryEntry.Reference<SoundEvent> AXOLOTL = registerReference("axolotl");

    private static RegistryEntry.Reference<SoundEvent> registerReference(String id) {
        return registerReference(Identifier.ofVanilla(id));
    }

    private static RegistryEntry.Reference<SoundEvent> registerReference(Identifier id) {
        return registerReference(id, id);
    }

    private static RegistryEntry.Reference<SoundEvent> registerReference(Identifier id, Identifier soundId) {
        return Registry.registerReference(Registries.SOUND_EVENT, id, SoundEvent.of(soundId));
    }

    //Print in log
    public static void registerSounds() {
        AmbientDiscs.LOGGER.info("Registering sounds...");
    }
}
