package ike.ambientdiscs.item;

import ike.ambientdiscs.AmbientDiscs;
import ike.ambientdiscs.sound.JukeboxSongs;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {
    //Copy paste for new items
    //I think
    public static final Item MUSIC_DISC_ARIA_MATH = registerItem("music_disc_aria_math",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(JukeboxSongs.ARIA_MATH))
        );

    private static void addToToolsAndUtilities(FabricItemGroupEntries entries) {
        entries.add(MUSIC_DISC_ARIA_MATH);
    }

    //Does the registering of items so that the game knows they exist
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AmbientDiscs.MOD_ID, name), item);
    }

    //Calling the item registrar at launch
    //Logging as such in chat
    public static void  registerModItem(){
        AmbientDiscs.LOGGER.info("Registering items...");

        //Also adding items to the Tools & Utilities creative tab
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addToToolsAndUtilities);
    }
}
