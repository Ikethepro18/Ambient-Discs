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
    public static final RegistryEntry.Reference<SoundEvent> ALPHA = registerSoundEventReference("alpha");
    public static final RegistryEntry.Reference<SoundEvent> ANCESTRY = registerSoundEventReference("ancestry");
    public static final RegistryEntry.Reference<SoundEvent> A_FAMILIAR_ROOM = registerSoundEventReference("a_familiar_room");
    public static final RegistryEntry.Reference<SoundEvent> AN_ORDINARY_DAY = registerSoundEventReference("an_ordinary_day");
    public static final RegistryEntry.Reference<SoundEvent> ARIA_MATH = registerSoundEventReference("aria_math");
    public static final RegistryEntry.Reference<SoundEvent> AXOLOTL = registerSoundEventReference("axolotl");
    public static final RegistryEntry.Reference<SoundEvent> SWEDEN = registerSoundEventReference("sweden");

    //Does something
    //Used for datagen and maybe other stuff idk
    private static RegistryEntry.Reference<SoundEvent> registerSoundEventReference(String name) {
        Identifier id = Identifier.of(AmbientDiscs.MOD_ID, name);
        return Registry.registerReference(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    //Print in log
    public static void registerSounds() {
        AmbientDiscs.LOGGER.info("Registering sounds...");
    }
}
