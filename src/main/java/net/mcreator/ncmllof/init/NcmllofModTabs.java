
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ncmllof.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.ncmllof.NcmllofMod;

public class NcmllofModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NcmllofMod.MODID);
	public static final RegistryObject<CreativeModeTab> NCMLZSA_CREATIVE_SCHEDULE = REGISTRY.register("ncmlzsa_creative_schedule",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.ncmllof.ncmlzsa_creative_schedule")).icon(() -> new ItemStack(Items.PLAYER_HEAD)).displayItems((parameters, tabData) -> {
				tabData.accept(NcmllofModItems.RUNNET_SPAWN_EGG.get());
			})

					.build());
}
