package net.magoriastudio.milkytales.item;

import net.magoriastudio.milkytales.MilkyTales;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MilkyTales.MOD_ID);

    public static final RegistryObject<Item> RAW_SOULSTONE = ITEMS.register("raw_soulstone", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SOULSTONE = ITEMS.register("soulstone", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
