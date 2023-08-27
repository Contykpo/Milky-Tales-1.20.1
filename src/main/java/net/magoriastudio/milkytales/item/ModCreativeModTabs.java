package net.magoriastudio.milkytales.item;

import net.magoriastudio.milkytales.MilkyTales;
import net.magoriastudio.milkytales.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MilkyTales.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MILKYTALES_TAB =
            CREATIVE_MODE_TABS.register("milkytales_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SOULSTONE.get()))
                    .title(Component.translatable("creativetab.milkytales_tab"))
                    .displayItems((pParameters, pOutput) ->
                    {
                        pOutput.accept(ModItems.RAW_SOULSTONE.get());
                        pOutput.accept(ModItems.SOULSTONE.get());

                        pOutput.accept(ModBlocks.RAW_SOULSTONE_BLOCK.get());
                        pOutput.accept(ModBlocks.SOULSTONE_BLOCK.get());
                    })
                    .build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
