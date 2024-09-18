package ike.ambientdiscs.item;

import ike.ambientdiscs.AmbientDiscs;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

//Custom creative tab to contain all the mod's discs
public class ModItemGroups {
    public static final RegistryKey<ItemGroup> AMBIENT_DISCS_KEY = RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(AmbientDiscs.MOD_ID, "ambient_discs"));
    public static final ItemGroup AMBIENT_DISCS = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.MUSIC_DISC_ARIA_MATH))
            .displayName(Text.translatable("itemgroup.ambient_discs"))
            .entries((displayContext, entries) -> {
                //Add items here
                ModItems.addDiscsToItemGroupEntries(entries);
            })
            .build();

    public static void registerItemGroups() {
        Registry.register(Registries.ITEM_GROUP, AMBIENT_DISCS_KEY, AMBIENT_DISCS);
        AmbientDiscs.LOGGER.info("Registering item groups...");
    }
}