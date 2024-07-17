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

  //public static final Item {internalName} = registerItem("{itemID}", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModdedJukeboxSongs.{song})));

    public static final Item MUSIC_DISC_ALPHA = registerItem("music_disc_alpha", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModdedJukeboxSongs.ALPHA)));
    public static final Item MUSIC_DISC_ANCESTRY = registerItem("music_disc_ancestry", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModdedJukeboxSongs.ANCESTRY)));
    public static final Item MUSIC_DISC_AN_ORDINARY_DAY = registerItem("music_disc_an_ordinary_day", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModdedJukeboxSongs.AN_ORDINARY_DAY)));
    public static final Item MUSIC_DISC_ARIA_MATH = registerItem("music_disc_aria_math", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModdedJukeboxSongs.ARIA_MATH)));
    public static final Item MUSIC_DISC_AXOLOTL = registerItem("music_disc_axolotl", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModdedJukeboxSongs.AXOLOTL)));

    //Adds items to the Tools & Utilities tab in the creative inventory
    //Called at [1]
    private static void addToToolsAndUtilities(@NotNull FabricItemGroupEntries entries) {
        entries.add(MUSIC_DISC_ALPHA);
        entries.add(MUSIC_DISC_ANCESTRY);
        entries.add(MUSIC_DISC_AN_ORDINARY_DAY);
        entries.add(MUSIC_DISC_ARIA_MATH);
        entries.add(MUSIC_DISC_AXOLOTL);
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
