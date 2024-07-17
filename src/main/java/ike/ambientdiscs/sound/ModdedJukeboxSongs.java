package ike.ambientdiscs.sound;

import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.block.jukebox.JukeboxSongs;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public interface ModdedJukeboxSongs extends JukeboxSongs {
    RegistryKey<JukeboxSong> ALPHA = of("alpha");
    RegistryKey<JukeboxSong> ANCESTRY = of("ancestry");
    RegistryKey<JukeboxSong> AN_ORDINARY_DAY = of("an_ordinary_day");
    RegistryKey<JukeboxSong> ARIA_MATH = of("aria_math");
    RegistryKey<JukeboxSong> AXOLOTL = of("axolotl");

    private static RegistryKey<JukeboxSong> of(String id) {
        return RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.ofVanilla(id));
    }
}
