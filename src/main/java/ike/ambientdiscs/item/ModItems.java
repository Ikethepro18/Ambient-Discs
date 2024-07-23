package ike.ambientdiscs.item;

import ike.ambientdiscs.AmbientDiscs;
import ike.ambientdiscs.sound.ModdedJukeboxSongs;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import org.jetbrains.annotations.NotNull;

public class ModItems {
    //All items
    //Don't forget to add to custom creative tab in ModItemGroups
    //And to add textures/models (datagen)
    //And to add to langs
    //And in ModdedJukeboxSongs
    //And in ModSounds
    //And to music_discs.json

  //public static final Item MUSIC_DISC_ = registerItem("music_disc_", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModdedJukeboxSongs.{song})));

    public static final Item MUSIC_DISC_A_FAMILIAR_ROOM = registerItem("music_disc_a_familiar_room", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModdedJukeboxSongs.A_FAMILIAR_ROOM)));
    public static final Item MUSIC_DISC_ALPHA = registerItem("music_disc_alpha", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModdedJukeboxSongs.ALPHA)));
    public static final Item MUSIC_DISC_AN_ORDINARY_DAY = registerItem("music_disc_an_ordinary_day", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModdedJukeboxSongs.AN_ORDINARY_DAY)));
    public static final Item MUSIC_DISC_ANCESTRY = registerItem("music_disc_ancestry", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModdedJukeboxSongs.ANCESTRY)));
    public static final Item MUSIC_DISC_ARIA_MATH = registerItem("music_disc_aria_math", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModdedJukeboxSongs.ARIA_MATH)));
    public static final Item MUSIC_DISC_AXOLOTL = registerItem("music_disc_axolotl", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModdedJukeboxSongs.AXOLOTL)));
    public static final Item MUSIC_DISC_BROMELIAD = registerItem("music_disc_bromeliad", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModdedJukeboxSongs.BROMELIAD)));
    public static final Item MUSIC_DISC_CLARK = registerItem("music_disc_clark", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModdedJukeboxSongs.CLARK)));
    public static final Item MUSIC_DISC_COMFORTING_MEMORIES = registerItem("music_disc_comforting_memories", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModdedJukeboxSongs.COMFORTING_MEMORIES)));
    public static final Item MUSIC_DISC_CRESCENT_DUNES = registerItem("music_disc_crescent_dunes", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModdedJukeboxSongs.CRESCENT_DUNES)));
    public static final Item MUSIC_DISC_DANNY = registerItem("music_disc_danny", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModdedJukeboxSongs.DANNY)));
    public static final Item MUSIC_DISC_DEEPER = registerItem("music_disc_deeper", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModdedJukeboxSongs.DEEPER)));
    public static final Item MUSIC_DISC_DRY_HANDS = registerItem("music_disc_dry_hands", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModdedJukeboxSongs.DRY_HANDS)));
    public static final Item MUSIC_DISC_ECHO_IN_THE_WIND = registerItem("music_disc_echo_in_the_wind", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModdedJukeboxSongs.ECHO_IN_THE_WIND)));
    public static final Item MUSIC_DISC_ELD_UNKNOWN = registerItem("music_disc_eld_unknown", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModdedJukeboxSongs.ELD_UNKNOWN)));
    public static final Item MUSIC_DISC_ENDLESS = registerItem("music_disc_endless", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModdedJukeboxSongs.ENDLESS)));
    public static final Item MUSIC_DISC_FEATHERFALL = registerItem("music_disc_featherfall", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModdedJukeboxSongs.FEATHERFALL)));
    public static final Item MUSIC_DISC_FLOATING_DREAM = registerItem("music_disc_floating_dream", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModdedJukeboxSongs.FLOATING_DREAM)));
    public static final Item MUSIC_DISC_HAGGSTROM = registerItem("music_disc_haggstrom", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModdedJukeboxSongs.HAGGSTROM)));
    public static final Item MUSIC_DISC_INFINITE_AMETHYST = registerItem("music_disc_infinite_amethyst", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModdedJukeboxSongs.INFINITE_AMETHYST)));
    public static final Item MUSIC_DISC_KEY = registerItem("music_disc_key", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModdedJukeboxSongs.KEY)));
    public static final Item MUSIC_DISC_KOMOREBI = registerItem("music_disc_komorebi", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModdedJukeboxSongs.KOMOREBI)));
    public static final Item MUSIC_DISC_LEFT_TO_BLOOM = registerItem("music_disc_left_to_bloom", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModdedJukeboxSongs.LEFT_TO_BLOOM)));
    public static final Item MUSIC_DISC_LIVING_MICE = registerItem("music_disc_living_mice", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModdedJukeboxSongs.LIVING_MICE)));
    public static final Item MUSIC_DISC_MICE_ON_VENUS = registerItem("music_disc_mice_on_venus", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModdedJukeboxSongs.MICE_ON_VENUS)));
    public static final Item MUSIC_DISC_MINECRAFT = registerItem("music_disc_minecraft", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModdedJukeboxSongs.MINECRAFT)));
    public static final Item MUSIC_DISC_ONE_MORE_DAY = registerItem("music_disc_one_more_day", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModdedJukeboxSongs.ONE_MORE_DAY)));
    public static final Item MUSIC_DISC_OXYGENE = registerItem("music_disc_oxygene", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModdedJukeboxSongs.OXYGENE)));
    public static final Item MUSIC_DISC_POKOPOKO = registerItem("music_disc_pokopoko", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModdedJukeboxSongs.POKOPOKO)));
    public static final Item MUSIC_DISC_PUZZLEBOX = registerItem("music_disc_puzzlebox", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModdedJukeboxSongs.PUZZLEBOX)));
    public static final Item MUSIC_DISC_STAND_TALL = registerItem("music_disc_stand_tall", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModdedJukeboxSongs.STAND_TALL)));
    public static final Item MUSIC_DISC_SUBWOOFER_LULLABY = registerItem("music_disc_subwoofer_lullaby", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModdedJukeboxSongs.SUBWOOFER_LULLABY)));
    public static final Item MUSIC_DISC_SWEDEN = registerItem("music_disc_sweden", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModdedJukeboxSongs.SWEDEN)));
    public static final Item MUSIC_DISC_WATCHER = registerItem("music_disc_watcher", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModdedJukeboxSongs.WATCHER)));
    public static final Item MUSIC_DISC_WENDING = registerItem("music_disc_wending", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModdedJukeboxSongs.WENDING)));
    public static final Item MUSIC_DISC_WET_HANDS = registerItem("music_disc_wet_hands", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModdedJukeboxSongs.WET_HANDS)));
    public static final Item MUSIC_DISC_YAKUSOKU = registerItem("music_disc_yakusoku", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModdedJukeboxSongs.YAKUSOKU)));

    //Adds items to the Tools & Utilities tab in the creative inventory
    //Called at [1]
    private static void addToToolsAndUtilities(@NotNull FabricItemGroupEntries entries) {
        entries.add(MUSIC_DISC_A_FAMILIAR_ROOM);
        entries.add(MUSIC_DISC_ALPHA);
        entries.add(MUSIC_DISC_AN_ORDINARY_DAY);
        entries.add(MUSIC_DISC_ANCESTRY);
        entries.add(MUSIC_DISC_ARIA_MATH);
        entries.add(MUSIC_DISC_AXOLOTL);
        entries.add(MUSIC_DISC_BROMELIAD);
        entries.add(MUSIC_DISC_CLARK);
        entries.add(MUSIC_DISC_COMFORTING_MEMORIES);
        entries.add(MUSIC_DISC_CRESCENT_DUNES);
        entries.add(MUSIC_DISC_DANNY);
        entries.add(MUSIC_DISC_DEEPER);
        entries.add(MUSIC_DISC_DRY_HANDS);
        entries.add(MUSIC_DISC_ECHO_IN_THE_WIND);
        entries.add(MUSIC_DISC_ELD_UNKNOWN);
        entries.add(MUSIC_DISC_ENDLESS);
        entries.add(MUSIC_DISC_FEATHERFALL);
        entries.add(MUSIC_DISC_FLOATING_DREAM);
        entries.add(MUSIC_DISC_HAGGSTROM);
        entries.add(MUSIC_DISC_INFINITE_AMETHYST);
        entries.add(MUSIC_DISC_KEY);
        entries.add(MUSIC_DISC_KOMOREBI);
        entries.add(MUSIC_DISC_LEFT_TO_BLOOM);
        entries.add(MUSIC_DISC_LIVING_MICE);
        entries.add(MUSIC_DISC_MICE_ON_VENUS);
        entries.add(MUSIC_DISC_MINECRAFT);
        entries.add(MUSIC_DISC_ONE_MORE_DAY);
        entries.add(MUSIC_DISC_OXYGENE);
        entries.add(MUSIC_DISC_POKOPOKO);
        entries.add(MUSIC_DISC_PUZZLEBOX);
        entries.add(MUSIC_DISC_STAND_TALL);
        entries.add(MUSIC_DISC_SUBWOOFER_LULLABY);
        entries.add(MUSIC_DISC_SWEDEN);
        entries.add(MUSIC_DISC_WATCHER);
        entries.add(MUSIC_DISC_WENDING);
        entries.add(MUSIC_DISC_WET_HANDS);
        entries.add(MUSIC_DISC_YAKUSOKU);
    }

    //Does the registering of items so that the game knows they exist
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AmbientDiscs.MOD_ID, name), item);
    }

    //Calling the item registrar at launch????
    //Logging as such in chat
    public static void  registerModItem(){
        AmbientDiscs.LOGGER.info("Registering items...");
        //[1]
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addToToolsAndUtilities);
    }
}
