package ike.ambientdiscs.sound;

import ike.ambientdiscs.AmbientDiscs;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

public interface ModdedJukeboxSongs {
    RegistryKey<JukeboxSong> ALPHA = of("alpha");
    RegistryKey<JukeboxSong> ANCESTRY = of("ancestry");
    RegistryKey<JukeboxSong> A_FAMILIAR_ROOM = of("a_familiar_room");
    RegistryKey<JukeboxSong> AN_ORDINARY_DAY = of("an_ordinary_day");
    RegistryKey<JukeboxSong> ARIA_MATH = of("aria_math");
    RegistryKey<JukeboxSong> AXOLOTL = of("axolotl");
    RegistryKey<JukeboxSong> SWEDEN = of("sweden");

    private static RegistryKey<JukeboxSong> of(String id) {
        return RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(AmbientDiscs.MOD_ID, id));
    }

    private static void register(Registerable<JukeboxSong> registry, RegistryKey<JukeboxSong> key, RegistryEntry.Reference<SoundEvent> soundEvent, int lengthInSeconds, int comparatorOutput) {
        registry.register(key, new JukeboxSong(soundEvent, Text.translatable(Util.createTranslationKey("jukebox_song", key.getValue())), (float)lengthInSeconds, comparatorOutput));
    }

    public static void bootstrap(Registerable<JukeboxSong> registry) {
        register(registry, ALPHA, ModSounds.ALPHA, 603,15);
        register(registry, ANCESTRY, ModSounds.ANCESTRY, 343,4);
        register(registry, A_FAMILIAR_ROOM, ModSounds.A_FAMILIAR_ROOM,241,1);
        register(registry, AN_ORDINARY_DAY, ModSounds.AN_ORDINARY_DAY, 331,8);
        register(registry, ARIA_MATH, ModSounds.ARIA_MATH, 309,10);
        register(registry, AXOLOTL, ModSounds.AXOLOTL, 303,10);
        register(registry, SWEDEN, ModSounds.SWEDEN,215,6);
    }
}
