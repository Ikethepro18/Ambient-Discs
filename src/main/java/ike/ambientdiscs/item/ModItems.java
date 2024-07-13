package ike.ambientdiscs.item;

import ike.ambientdiscs.AmbientDiscs;
import ike.ambientdiscs.sound.ModSounds;
import net.minecraft.block.jukebox.JukeboxSongs;
import net.minecraft.item.Item;
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


    //Does the registering of items so that the game knows they exist
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AmbientDiscs.MOD_ID, name), item);
    }

    //Calling the item registrar at launch
    public static void  registerModItem(){
        AmbientDiscs.LOGGER.info("Registering items...");
    }
}
