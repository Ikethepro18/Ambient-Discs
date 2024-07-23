package ike.ambientdiscs.item;

import ike.ambientdiscs.AmbientDiscs;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

//Custom creative tab to contain all the mod's discs
public class ModItemGroups {
    public static final RegistryKey<ItemGroup> AMBIENT_DISCS_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(AmbientDiscs.MOD_ID, "ambient_discs"));
    public static final ItemGroup AMBIENT_DISCS = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.MUSIC_DISC_ARIA_MATH))
            .displayName(Text.translatable("itemgroup.ambient_discs"))
            .entries((displayContext, entries) -> {
                //Add items here
                entries.add(ModItems.MUSIC_DISC_ALPHA);
                entries.add(ModItems.MUSIC_DISC_ANCESTRY);
                entries.add(ModItems.MUSIC_DISC_A_FAMILIAR_ROOM);
                entries.add(ModItems.MUSIC_DISC_AN_ORDINARY_DAY);
                entries.add(ModItems.MUSIC_DISC_ARIA_MATH);
                entries.add(ModItems.MUSIC_DISC_AXOLOTL);
                entries.add(ModItems.MUSIC_DISC_BROMELIAD);
                entries.add(ModItems.MUSIC_DISC_CLARK);
                entries.add(ModItems.MUSIC_DISC_COMFORTING_MEMORIES);
                entries.add(ModItems.MUSIC_DISC_CRESCENT_DUNES);
                entries.add(ModItems.MUSIC_DISC_DANNY);
                entries.add(ModItems.MUSIC_DISC_DEEPER);
                entries.add(ModItems.MUSIC_DISC_DRY_HANDS);
                entries.add(ModItems.MUSIC_DISC_ECHO_IN_THE_WIND);
                entries.add(ModItems.MUSIC_DISC_ELD_UNKNOWN);
                entries.add(ModItems.MUSIC_DISC_ENDLESS);
                entries.add(ModItems.MUSIC_DISC_FEATHERFALL);
                entries.add(ModItems.MUSIC_DISC_FLOATING_DREAM);
                entries.add(ModItems.MUSIC_DISC_HAGGSTROM);
                entries.add(ModItems.MUSIC_DISC_INFINITE_AMETHYST);
                entries.add(ModItems.MUSIC_DISC_KEY);
                entries.add(ModItems.MUSIC_DISC_KOMOREBI);
                entries.add(ModItems.MUSIC_DISC_LEFT_TO_BLOOM);
                entries.add(ModItems.MUSIC_DISC_LIVING_MICE);
                entries.add(ModItems.MUSIC_DISC_MICE_ON_VENUS);
                entries.add(ModItems.MUSIC_DISC_MINECRAFT);
                entries.add(ModItems.MUSIC_DISC_ONE_MORE_DAY);
                entries.add(ModItems.MUSIC_DISC_OXYGENE);
                entries.add(ModItems.MUSIC_DISC_POKOPOKO);
                entries.add(ModItems.MUSIC_DISC_PUZZLEBOX);
                entries.add(ModItems.MUSIC_DISC_STAND_TALL);
                entries.add(ModItems.MUSIC_DISC_SUBWOOFER_LULLABY);
                entries.add(ModItems.MUSIC_DISC_SWEDEN);
                entries.add(ModItems.MUSIC_DISC_WATCHER);
                entries.add(ModItems.MUSIC_DISC_WENDING);
                entries.add(ModItems.MUSIC_DISC_WET_HANDS);
                entries.add(ModItems.MUSIC_DISC_YAKUSOKU);
            })
            .build();

    public static void registerItemGroups() {
        Registry.register(Registries.ITEM_GROUP, AMBIENT_DISCS_KEY, AMBIENT_DISCS);
        AmbientDiscs.LOGGER.info("Registering item groups...");
    }
}
