
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ncmllof.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.ncmllof.NcmllofMod;

public class NcmllofModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, NcmllofMod.MODID);
	public static final RegistryObject<Item> RUNNET_SPAWN_EGG = REGISTRY.register("runnet_spawn_egg", () -> new ForgeSpawnEggItem(NcmllofModEntities.RUNNET, -1, -26113, new Item.Properties()));
	// Start of user code block custom items
	// End of user code block custom items
}
