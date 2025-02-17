package net.wispy.wispyschairmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.wispy.wispyschairmod.WispysChairMod;

import java.util.List;

public class ModItems {


    public static final Item WISPYS_CHAIR = registerItem("wispys_chair",
            new SwordItem(ToolMaterial.NETHERITE, 20, 0, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(WispysChairMod.MOD_ID, "wispys_chair")))){
                @Override
                public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.wispyschairmod.wispyschair.tooltip"));
                    tooltip.add(Text.translatable("tooltip.wispyschairmod.wispyschair.tooltip2"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });

    public static final Item SWORD_OF_THE_CREATOR = registerItem("sword_of_the_creator",
            new SwordItem(ToolMaterial.NETHERITE, 30, 0, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(WispysChairMod.MOD_ID, "sword_of_the_creator")))){
                @Override
                public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.wispyschairmod.sword_of_the_creator.tooltip"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(WispysChairMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        WispysChairMod.LOGGER.info("Registering Mod Items for" + WispysChairMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(WISPYS_CHAIR);
            entries.add(SWORD_OF_THE_CREATOR);
        });
    }
}
