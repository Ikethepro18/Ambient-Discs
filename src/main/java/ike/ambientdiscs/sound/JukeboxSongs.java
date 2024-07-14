package ike.ambientdiscs.sound;

import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

public interface JukeboxSongs {
    RegistryKey<JukeboxSong> ALPHA = of("alpha");
    RegistryKey<JukeboxSong> ANCESTRY = of("ancestry");
    RegistryKey<JukeboxSong> AN_ORDINARY_DAY = of("an_ordinary_day");
    RegistryKey<JukeboxSong> ARIA_MATH = of("aria_math");
    RegistryKey<JukeboxSong> AXOLOTL = of("axolotl");

    private static RegistryKey<JukeboxSong> of(String id) {
        return RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.ofVanilla(id));
    }

    private static void register(
            Registerable<JukeboxSong> registry, RegistryKey<JukeboxSong> key, RegistryEntry.Reference<SoundEvent> soundEvent, int lengthInSeconds, int comparatorOutput
    ) {
        registry.register(
                key, new JukeboxSong(soundEvent, Text.translatable(Util.createTranslationKey("jukebox_song", key.getValue())), (float)lengthInSeconds, comparatorOutput)
        );
    }

    static void bootstrap(Registerable<JukeboxSong> registry) {
        register(registry, ALPHA, ModSounds.ALPHA, 603, 15);
        register(registry, ANCESTRY, ModSounds.ANCESTRY, 343, 4);
        register(registry, AN_ORDINARY_DAY, ModSounds.AN_ORDINARY_DAY, 331, 8);
        register(registry, ARIA_MATH, ModSounds.ARIA_MATH, 309, 1);
        register(registry, AXOLOTL, ModSounds.AXOLOTL, 303, 10);
    }
}
