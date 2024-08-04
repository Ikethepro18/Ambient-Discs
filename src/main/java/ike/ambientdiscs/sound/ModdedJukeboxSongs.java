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
    RegistryKey<JukeboxSong> A_FAMILIAR_ROOM = of("a_familiar_room");
    RegistryKey<JukeboxSong> ALPHA = of("alpha");
    RegistryKey<JukeboxSong> AERIE = of("aerie");
    RegistryKey<JukeboxSong> AN_ORDINARY_DAY = of("an_ordinary_day");
    RegistryKey<JukeboxSong> ANCESTRY = of("ancestry");
    RegistryKey<JukeboxSong> ARIA_MATH = of("aria_math");
    RegistryKey<JukeboxSong> AXOLOTL = of("axolotl");
    RegistryKey<JukeboxSong> BALLAD_OF_THE_CATS = of("ballad_of_the_cats");
    RegistryKey<JukeboxSong> BEGINNING_2 = of("beginning_2");
    RegistryKey<JukeboxSong> BIOME_FEST = of("biome_fest");
    RegistryKey<JukeboxSong> BLIND_SPOTS = of("blind_spots");
    RegistryKey<JukeboxSong> BOSS = of("boss");
    RegistryKey<JukeboxSong> BROMELIAD = of("bromeliad");
    RegistryKey<JukeboxSong> CHRYSOPOEIA = of("chrysopoeia");
    RegistryKey<JukeboxSong> CLARK = of("clark");
    RegistryKey<JukeboxSong> COMFORTING_MEMORIES = of("comforting_memories");
    RegistryKey<JukeboxSong> CONCRETE_HALLS = of("concrete_halls");
    RegistryKey<JukeboxSong> CRESCENT_DUNES = of("crescent_dunes");
    RegistryKey<JukeboxSong> DANNY = of("danny");
    RegistryKey<JukeboxSong> DEAD_VOXEL = of("dead_voxel");
    RegistryKey<JukeboxSong> DEEPER = of("deeper");
    RegistryKey<JukeboxSong> DRAGON_FISH = of("dragon_fish");
    RegistryKey<JukeboxSong> DREITON = of("dreiton");
    RegistryKey<JukeboxSong> DRY_HANDS = of("dry_hands");
    RegistryKey<JukeboxSong> ECHO_IN_THE_WIND = of("echo_in_the_wind");
    RegistryKey<JukeboxSong> ELD_UNKNOWN = of("eld_unknown");
    RegistryKey<JukeboxSong> ENDLESS = of("endless");
    RegistryKey<JukeboxSong> FEATHERFALL = of("featherfall");
    RegistryKey<JukeboxSong> FIREBUGS = of("firebugs");
    RegistryKey<JukeboxSong> FLOATING_DREAM = of("floating_dream");
    RegistryKey<JukeboxSong> FLOATING_TREES = of("floating_trees");
    RegistryKey<JukeboxSong> HAGGSTROM = of("haggstrom");
    RegistryKey<JukeboxSong> HAUNT_MUSKIE = of("haunt_muskie");
    RegistryKey<JukeboxSong> INFINITE_AMETHYST = of("infinite_amethyst");
    RegistryKey<JukeboxSong> KEY = of("key");
    RegistryKey<JukeboxSong> KOMOREBI = of("komorebi");
    RegistryKey<JukeboxSong> LABYRINTHINE = of("labyrinthine");
    RegistryKey<JukeboxSong> LEFT_TO_BLOOM = of("left_to_bloom");
    RegistryKey<JukeboxSong> LIVING_MICE = of("living_mice");
    RegistryKey<JukeboxSong> MICE_ON_VENUS = of("mice_on_venus");
    RegistryKey<JukeboxSong> MINECRAFT = of("minecraft");
    RegistryKey<JukeboxSong> MOOG_CITY_2 = of("moog_city_2");
    RegistryKey<JukeboxSong> MUTATION = of("mutation");
    RegistryKey<JukeboxSong> ONE_MORE_DAY = of("one_more_day");
    RegistryKey<JukeboxSong> OXYGENE = of("oxygene");
    RegistryKey<JukeboxSong> POKOPOKO = of("pokopoko");
    RegistryKey<JukeboxSong> PUZZLEBOX = of("puzzlebox");
    RegistryKey<JukeboxSong> RUBEDO = of("rubedo");
    RegistryKey<JukeboxSong> SHUNIJI = of("shuniji");
    RegistryKey<JukeboxSong> SO_BELOW = of("so_below");
    RegistryKey<JukeboxSong> STAND_TALL = of("stand_tall");
    RegistryKey<JukeboxSong> SUBWOOFER_LULLABY = of("subwoofer_lullaby");
    RegistryKey<JukeboxSong> SWEDEN = of("sweden");
    RegistryKey<JukeboxSong> TASWELL = of("taswell");
    RegistryKey<JukeboxSong> THE_END = of("the_end");
    RegistryKey<JukeboxSong> WARMTH = of("warmth");
    RegistryKey<JukeboxSong> WATCHER = of("watcher");
    RegistryKey<JukeboxSong> WENDING = of("wending");
    RegistryKey<JukeboxSong> WET_HANDS = of("wet_hands");
    RegistryKey<JukeboxSong> YAKUSOKU= of("yakusoku");

    private static RegistryKey<JukeboxSong> of(String id) {
        return RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(AmbientDiscs.MOD_ID, id));
    }

    private static void register(Registerable<JukeboxSong> registry, RegistryKey<JukeboxSong> key, RegistryEntry.Reference<SoundEvent> soundEvent, int lengthInSeconds, int comparatorOutput) {
        registry.register(key, new JukeboxSong(soundEvent, Text.translatable(Util.createTranslationKey("jukebox_song", key.getValue())), (float)lengthInSeconds, comparatorOutput));
    }

    //Datagen
    //Doesn't seem to work :(
    public static void bootstrap(Registerable<JukeboxSong> registry) {
        register(registry, A_FAMILIAR_ROOM, ModSounds.A_FAMILIAR_ROOM,241,1);
        register(registry, AERIE, ModSounds.AERIE,296,7);
        register(registry, ALPHA, ModSounds.ALPHA, 603,15);
        register(registry, AN_ORDINARY_DAY, ModSounds.AN_ORDINARY_DAY, 331,8);
        register(registry, ANCESTRY, ModSounds.ANCESTRY, 343,4);
        register(registry, ARIA_MATH, ModSounds.ARIA_MATH, 309,10);
        register(registry, AXOLOTL, ModSounds.AXOLOTL, 303,10);
        register(registry, BALLAD_OF_THE_CATS, ModSounds.BALLAD_OF_THE_CATS,275,5);
        register(registry, BEGINNING_2, ModSounds.BEGINNING_2,176,12);
        register(registry, BIOME_FEST, ModSounds.BIOME_FEST,378,9);
        register(registry, BLIND_SPOTS, ModSounds.BLIND_SPOTS,332,15);
        register(registry, BOSS, ModSounds.BOSS,344,1);
        register(registry, BROMELIAD, ModSounds.BROMELIAD ,312,3);
        register(registry, CHRYSOPOEIA, ModSounds.CHRYSOPOEIA,296,8);
        register(registry, CLARK, ModSounds.CLARK ,191,8);
        register(registry, COMFORTING_MEMORIES, ModSounds.COMFORTING_MEMORIES ,275,9);
        register(registry, CONCRETE_HALLS, ModSounds.CONCRETE_HALLS,254,14);
        register(registry, CRESCENT_DUNES, ModSounds.CRESCENT_DUNES ,248,6);
        register(registry, DANNY, ModSounds.DANNY ,251,2);
        register(registry, DEAD_VOXEL, ModSounds.DEAD_VOXEL,296,4);
        register(registry, DEEPER, ModSounds.DEEPER ,303,7);
        register(registry, DRAGON_FISH, ModSounds.DRAGON_FISH,372,11);
        register(registry, DREITON, ModSounds.DREITON,497,4);
        register(registry, DRY_HANDS, ModSounds.DRY_HANDS ,68,13);
        register(registry, ECHO_IN_THE_WIND, ModSounds.ECHO_IN_THE_WIND ,296,14);
        register(registry, ELD_UNKNOWN, ModSounds.ELD_UNKNOWN ,296,5);
        register(registry, ENDLESS, ModSounds.ENDLESS ,402,8);
        register(registry, FEATHERFALL, ModSounds.FEATHERFALL ,344,4);
        register(registry, FIREBUGS, ModSounds.FIREBUGS,312,7);
        register(registry, FLOATING_DREAM, ModSounds.FLOATING_DREAM ,205,10);
        register(registry, FLOATING_TREES, ModSounds.FLOATING_TREES,244,2);
        register(registry, HAGGSTROM, ModSounds.HAGGSTROM ,204,8);
        register(registry, HAUNT_MUSKIE, ModSounds.HAUNT_MUSKIE,361,5);
        register(registry, INFINITE_AMETHYST, ModSounds.INFINITE_AMETHYST ,271,7);
        register(registry, KEY, ModSounds.KEY ,65,2);
        register(registry, KOMOREBI, ModSounds.KOMOREBI ,287,6);
        register(registry, LABYRINTHINE, ModSounds.LABYRINTHINE,296,2);
        register(registry, LEFT_TO_BLOOM, ModSounds.LEFT_TO_BLOOM ,342,1);
        register(registry, LIVING_MICE, ModSounds.LIVING_MICE ,177,11);
        register(registry, MICE_ON_VENUS, ModSounds.MICE_ON_VENUS ,281,6);
        register(registry, MINECRAFT, ModSounds.MINECRAFT ,254,6);
        register(registry, MOOG_CITY_2, ModSounds.MOOG_CITY_2,180,8);
        register(registry, MUTATION, ModSounds.MUTATION,185,9);
        register(registry, ONE_MORE_DAY, ModSounds.ONE_MORE_DAY ,278,5);
        register(registry, OXYGENE, ModSounds.OXYGENE ,65,7);
        register(registry, POKOPOKO, ModSounds.POKOPOKO ,304,11);
        register(registry, PUZZLEBOX, ModSounds.PUZZLEBOX ,299,11);
        register(registry, RUBEDO, ModSounds.RUBEDO,312,5);
        register(registry, SHUNIJI, ModSounds.SHUNIJI,244,2);
        register(registry, SO_BELOW, ModSounds.SO_BELOW,319,5);
        register(registry, STAND_TALL, ModSounds.STAND_TALL ,308,9);
        register(registry, SUBWOOFER_LULLABY, ModSounds.SUBWOOFER_LULLABY ,208,10);
        register(registry, SWEDEN, ModSounds.SWEDEN,215,6);
        register(registry, TASWELL, ModSounds.TASWELL,515,6);
        register(registry, THE_END, ModSounds.THE_END,904,10);
        register(registry, WARMTH, ModSounds.WARMTH,239,6);
        register(registry, WATCHER, ModSounds.WATCHER ,332,4);
        register(registry, WENDING, ModSounds.WENDING ,314,8);
        register(registry, WET_HANDS, ModSounds.WET_HANDS ,90,14);
        register(registry, YAKUSOKU, ModSounds. YAKUSOKU,271,12);
    }
}
