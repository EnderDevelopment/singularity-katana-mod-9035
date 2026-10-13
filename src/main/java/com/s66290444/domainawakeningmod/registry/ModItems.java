package com.s66290444.domainawakeningmod.registry;

import com.s66290444.domainawakeningmod.DomainAwakeningMod;
import com.s66290444.domainawakeningmod.item.SingularityKatanaItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DomainAwakeningMod.MODID);

    public static final RegistryObject<Item> SINGULARITY_KATANA = ITEMS.register("singularity_katana",
            () -> new SingularityKatanaItem(Tiers.NETHERITE, 8, -2.4F, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
}