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
    public static final RegistryEntry.Reference<SoundEvent> BROMELIAD = registerSoundEventReference("bromeliad");
    public static final RegistryEntry.Reference<SoundEvent> CLARK = registerSoundEventReference("clark");
    public static final RegistryEntry.Reference<SoundEvent> COMFORTING_MEMORIES = registerSoundEventReference("comforting_memories");
    public static final RegistryEntry.Reference<SoundEvent> CRESCENT_DUNES = registerSoundEventReference("crescent_dunes");
    public static final RegistryEntry.Reference<SoundEvent> DANNY = registerSoundEventReference("danny");
    public static final RegistryEntry.Reference<SoundEvent> DEEPER = registerSoundEventReference("deeper");
    public static final RegistryEntry.Reference<SoundEvent> DRY_HANDS = registerSoundEventReference("dry_hands");
    public static final RegistryEntry.Reference<SoundEvent> ECHO_IN_THE_WIND = registerSoundEventReference("echo_in_the_wind");
    public static final RegistryEntry.Reference<SoundEvent> ELD_UNKNOWN = registerSoundEventReference("eld_unknown");
    public static final RegistryEntry.Reference<SoundEvent> ENDLESS = registerSoundEventReference("endless");
    public static final RegistryEntry.Reference<SoundEvent> FEATHERFALL = registerSoundEventReference("featherfall");
    public static final RegistryEntry.Reference<SoundEvent> FLOATING_DREAM = registerSoundEventReference("floating_dream");
    public static final RegistryEntry.Reference<SoundEvent> HAGGSTROM = registerSoundEventReference("haggstrom");
    public static final RegistryEntry.Reference<SoundEvent> INFINITE_AMETHYST = registerSoundEventReference("infinite_amethyst");
    public static final RegistryEntry.Reference<SoundEvent> KEY = registerSoundEventReference("key");
    public static final RegistryEntry.Reference<SoundEvent> KOMOREBI = registerSoundEventReference("komorebi");
    public static final RegistryEntry.Reference<SoundEvent> LEFT_TO_BLOOM = registerSoundEventReference("left_to_bloom");
    public static final RegistryEntry.Reference<SoundEvent> LIVING_MICE = registerSoundEventReference("living_mice");
    public static final RegistryEntry.Reference<SoundEvent> MICE_ON_VENUS = registerSoundEventReference("mice_on_venus");
    public static final RegistryEntry.Reference<SoundEvent> MINECRAFT = registerSoundEventReference("minecraft");
    public static final RegistryEntry.Reference<SoundEvent> ONE_MORE_DAY = registerSoundEventReference("one_more_day");
    public static final RegistryEntry.Reference<SoundEvent> OXYGENE = registerSoundEventReference("oxygene");
    public static final RegistryEntry.Reference<SoundEvent> POKOPOKO = registerSoundEventReference("pokopoko");
    public static final RegistryEntry.Reference<SoundEvent> PUZZLEBOX = registerSoundEventReference("puzzlebox");
    public static final RegistryEntry.Reference<SoundEvent> STAND_TALL = registerSoundEventReference("stand_tall");
    public static final RegistryEntry.Reference<SoundEvent> SUBWOOFER_LULLABY = registerSoundEventReference("subwoofer_lullaby");
    public static final RegistryEntry.Reference<SoundEvent> SWEDEN = registerSoundEventReference("sweden");
    public static final RegistryEntry.Reference<SoundEvent> WATCHER = registerSoundEventReference("watcher");
    public static final RegistryEntry.Reference<SoundEvent> WENDING = registerSoundEventReference("wending");
    public static final RegistryEntry.Reference<SoundEvent> WET_HANDS = registerSoundEventReference("wet_hands");
    public static final RegistryEntry.Reference<SoundEvent> YAKUSOKU = registerSoundEventReference("yakusoku");

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
