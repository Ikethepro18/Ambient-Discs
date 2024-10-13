package ike.ambientdiscs.item;

import ike.ambientdiscs.AmbientDiscs;
import ike.ambientdiscs.sound.ModdedJukeboxSongs;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
    //All items
    //Make sure to add to ModSounds
    //And in ModdedJukeboxSongs
    //And to music_discs.json
    //And set it up in a loot table in LootTableModifiers (or as a creeper drop in ModItemTags)

    //public static final Item MUSIC_DISC_ = registerSimpleMusicDiscItem("music_disc_", ModdedJukeboxSongs.{song});

    public static final List<Item> MUSIC_DISCS = new ArrayList<>();

    //General songs
    public static final Item MUSIC_DISC_A_FAMILIAR_ROOM = registerSimpleMusicDiscItem("music_disc_a_familiar_room", ModdedJukeboxSongs.A_FAMILIAR_ROOM);
    public static final Item MUSIC_DISC_AN_ORDINARY_DAY = registerSimpleMusicDiscItem("music_disc_an_ordinary_day", ModdedJukeboxSongs.AN_ORDINARY_DAY);
    public static final Item MUSIC_DISC_ANCESTRY = registerSimpleMusicDiscItem("music_disc_ancestry", ModdedJukeboxSongs.ANCESTRY);
    public static final Item MUSIC_DISC_BROMELIAD = registerSimpleMusicDiscItem("music_disc_bromeliad", ModdedJukeboxSongs.BROMELIAD);
    public static final Item MUSIC_DISC_CLARK = registerSimpleMusicDiscItem("music_disc_clark", ModdedJukeboxSongs.CLARK);
    public static final Item MUSIC_DISC_COMFORTING_MEMORIES = registerSimpleMusicDiscItem("music_disc_comforting_memories", ModdedJukeboxSongs.COMFORTING_MEMORIES);
    public static final Item MUSIC_DISC_CRESCENT_DUNES = registerSimpleMusicDiscItem("music_disc_crescent_dunes", ModdedJukeboxSongs.CRESCENT_DUNES);
    public static final Item MUSIC_DISC_DANNY = registerSimpleMusicDiscItem("music_disc_danny", ModdedJukeboxSongs.DANNY);
    public static final Item MUSIC_DISC_DEEPER = registerSimpleMusicDiscItem("music_disc_deeper", ModdedJukeboxSongs.DEEPER);
    public static final Item MUSIC_DISC_DRY_HANDS = registerSimpleMusicDiscItem("music_disc_dry_hands", ModdedJukeboxSongs.DRY_HANDS);
    public static final Item MUSIC_DISC_ECHO_IN_THE_WIND = registerSimpleMusicDiscItem("music_disc_echo_in_the_wind", ModdedJukeboxSongs.ECHO_IN_THE_WIND);
    public static final Item MUSIC_DISC_ELD_UNKNOWN = registerSimpleMusicDiscItem("music_disc_eld_unknown", ModdedJukeboxSongs.ELD_UNKNOWN);
    public static final Item MUSIC_DISC_ENDLESS = registerSimpleMusicDiscItem("music_disc_endless", ModdedJukeboxSongs.ENDLESS);
    public static final Item MUSIC_DISC_FEATHERFALL = registerSimpleMusicDiscItem("music_disc_featherfall", ModdedJukeboxSongs.FEATHERFALL);
    public static final Item MUSIC_DISC_FLOATING_DREAM = registerSimpleMusicDiscItem("music_disc_floating_dream", ModdedJukeboxSongs.FLOATING_DREAM);
    public static final Item MUSIC_DISC_HAGGSTROM = registerSimpleMusicDiscItem("music_disc_haggstrom", ModdedJukeboxSongs.HAGGSTROM);
    public static final Item MUSIC_DISC_INFINITE_AMETHYST = registerSimpleMusicDiscItem("music_disc_infinite_amethyst", ModdedJukeboxSongs.INFINITE_AMETHYST);
    public static final Item MUSIC_DISC_KEY = registerSimpleMusicDiscItem("music_disc_key", ModdedJukeboxSongs.KEY);
    public static final Item MUSIC_DISC_KOMOREBI = registerSimpleMusicDiscItem("music_disc_komorebi", ModdedJukeboxSongs.KOMOREBI);
    public static final Item MUSIC_DISC_LEFT_TO_BLOOM = registerSimpleMusicDiscItem("music_disc_left_to_bloom", ModdedJukeboxSongs.LEFT_TO_BLOOM);
    public static final Item MUSIC_DISC_LIVING_MICE = registerSimpleMusicDiscItem("music_disc_living_mice", ModdedJukeboxSongs.LIVING_MICE);
    public static final Item MUSIC_DISC_MICE_ON_VENUS = registerSimpleMusicDiscItem("music_disc_mice_on_venus", ModdedJukeboxSongs.MICE_ON_VENUS);
    public static final Item MUSIC_DISC_MINECRAFT = registerSimpleMusicDiscItem("music_disc_minecraft", ModdedJukeboxSongs.MINECRAFT);
    public static final Item MUSIC_DISC_ONE_MORE_DAY = registerSimpleMusicDiscItem("music_disc_one_more_day", ModdedJukeboxSongs.ONE_MORE_DAY);
    public static final Item MUSIC_DISC_OXYGENE = registerSimpleMusicDiscItem("music_disc_oxygene", ModdedJukeboxSongs.OXYGENE);
    public static final Item MUSIC_DISC_POKOPOKO = registerSimpleMusicDiscItem("music_disc_pokopoko", ModdedJukeboxSongs.POKOPOKO);
    public static final Item MUSIC_DISC_PUZZLEBOX = registerSimpleMusicDiscItem("music_disc_puzzlebox", ModdedJukeboxSongs.PUZZLEBOX);
    public static final Item MUSIC_DISC_STAND_TALL = registerSimpleMusicDiscItem("music_disc_stand_tall", ModdedJukeboxSongs.STAND_TALL);
    public static final Item MUSIC_DISC_SUBWOOFER_LULLABY = registerSimpleMusicDiscItem("music_disc_subwoofer_lullaby", ModdedJukeboxSongs.SUBWOOFER_LULLABY);
    public static final Item MUSIC_DISC_SWEDEN = registerSimpleMusicDiscItem("music_disc_sweden", ModdedJukeboxSongs.SWEDEN);
    public static final Item MUSIC_DISC_WATCHER = registerSimpleMusicDiscItem("music_disc_watcher", ModdedJukeboxSongs.WATCHER);
    public static final Item MUSIC_DISC_WENDING = registerSimpleMusicDiscItem("music_disc_wending", ModdedJukeboxSongs.WENDING);
    public static final Item MUSIC_DISC_WET_HANDS = registerSimpleMusicDiscItem("music_disc_wet_hands", ModdedJukeboxSongs.WET_HANDS);
    public static final Item MUSIC_DISC_YAKUSOKU = registerSimpleMusicDiscItem("music_disc_yakusoku", ModdedJukeboxSongs.YAKUSOKU);

    //Creative mode
    public static final Item MUSIC_DISC_ARIA_MATH = registerSimpleMusicDiscItem("music_disc_aria_math", ModdedJukeboxSongs.ARIA_MATH);
    public static final Item MUSIC_DISC_BIOME_FEST = registerSimpleMusicDiscItem("music_disc_biome_fest", ModdedJukeboxSongs.BIOME_FEST);
    public static final Item MUSIC_DISC_BLIND_SPOTS = registerSimpleMusicDiscItem("music_disc_blind_spots", ModdedJukeboxSongs.BLIND_SPOTS);
    public static final Item MUSIC_DISC_DREITON = registerSimpleMusicDiscItem("music_disc_dreiton", ModdedJukeboxSongs.DREITON);
    public static final Item MUSIC_DISC_HAUNT_MUSKIE = registerSimpleMusicDiscItem("music_disc_haunt_muskie", ModdedJukeboxSongs.HAUNT_MUSKIE);
    public static final Item MUSIC_DISC_TASWELL = registerSimpleMusicDiscItem("music_disc_taswell", ModdedJukeboxSongs.TASWELL);

    //The end
    public static final Item MUSIC_DISC_ALPHA = registerSimpleMusicDiscItem("music_disc_alpha", ModdedJukeboxSongs.ALPHA);
    public static final Item MUSIC_DISC_BOSS = registerSimpleMusicDiscItem("music_disc_boss", ModdedJukeboxSongs.BOSS);
    public static final Item MUSIC_DISC_THE_END = registerSimpleMusicDiscItem("music_disc_the_end", ModdedJukeboxSongs.THE_END);

    //The Nether
    public static final Item MUSIC_DISC_BALLAD_OF_THE_CATS = registerSimpleMusicDiscItem("music_disc_ballad_of_the_cats", ModdedJukeboxSongs.BALLAD_OF_THE_CATS);
    public static final Item MUSIC_DISC_CHRYSOPOEIA = registerSimpleMusicDiscItem("music_disc_chrysopoeia", ModdedJukeboxSongs.CHRYSOPOEIA);
    public static final Item MUSIC_DISC_CONCRETE_HALLS = registerSimpleMusicDiscItem("music_disc_concrete_halls", ModdedJukeboxSongs.CONCRETE_HALLS);
    public static final Item MUSIC_DISC_DEAD_VOXEL = registerSimpleMusicDiscItem("music_disc_dead_voxel", ModdedJukeboxSongs.DEAD_VOXEL);
    public static final Item MUSIC_DISC_RUBEDO = registerSimpleMusicDiscItem("music_disc_rubedo", ModdedJukeboxSongs.RUBEDO);
    public static final Item MUSIC_DISC_SO_BELOW = registerSimpleMusicDiscItem("music_disc_so_below", ModdedJukeboxSongs.SO_BELOW);
    public static final Item MUSIC_DISC_WARMTH = registerSimpleMusicDiscItem("music_disc_warmth", ModdedJukeboxSongs.WARMTH);

    //Swamps
    public static final Item MUSIC_DISC_AERIE = registerSimpleMusicDiscItem("music_disc_aerie", ModdedJukeboxSongs.AERIE);
    public static final Item MUSIC_DISC_FIREBUGS = registerSimpleMusicDiscItem("music_disc_firebugs", ModdedJukeboxSongs.FIREBUGS);
    public static final Item MUSIC_DISC_LABYRINTHINE = registerSimpleMusicDiscItem("music_disc_labyrinthine", ModdedJukeboxSongs.LABYRINTHINE);

    //Underwater
    public static final Item MUSIC_DISC_AXOLOTL = registerSimpleMusicDiscItem("music_disc_axolotl", ModdedJukeboxSongs.AXOLOTL);
    public static final Item MUSIC_DISC_DRAGON_FISH = registerSimpleMusicDiscItem("music_disc_dragon_fish", ModdedJukeboxSongs.DRAGON_FISH);
    public static final Item MUSIC_DISC_SHUNIJI = registerSimpleMusicDiscItem("music_disc_shuniji", ModdedJukeboxSongs.SHUNIJI);

    //Main menu only
    public static final Item MUSIC_DISC_BEGINNING_2 = registerSimpleMusicDiscItem("music_disc_beginning_2", ModdedJukeboxSongs.BEGINNING_2);
    public static final Item MUSIC_DISC_FLOATING_TREES = registerSimpleMusicDiscItem("music_disc_floating_trees", ModdedJukeboxSongs.FLOATING_TREES);
    public static final Item MUSIC_DISC_MOOG_CITY_2 = registerSimpleMusicDiscItem("music_disc_moog_city_2", ModdedJukeboxSongs.MOOG_CITY_2);
    public static final Item MUSIC_DISC_MUTATION = registerSimpleMusicDiscItem("music_disc_mutation", ModdedJukeboxSongs.MUTATION);

    //Adds items to the Tools & Utilities tab and the custom tab in the creative inventory
    public static void addDiscsToItemGroupEntries(ItemGroup.Entries entries) {
        MUSIC_DISCS.forEach(entries::add);
    }

    //Does the registering of items so that the game knows they exist
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AmbientDiscs.MOD_ID, name), item);
    }

    private static Item registerSimpleMusicDiscItem(String name, RegistryKey<JukeboxSong> songKey) {
        Item item = new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(songKey));
        MUSIC_DISCS.add(item);
        return registerItem(name, item);
    }

    //Calling the item registrar at launch????
    //Logging as such in chat
    public static void registerModItem() {
        AmbientDiscs.LOGGER.info("Registering items...");
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addDiscsToItemGroupEntries);
    }
}