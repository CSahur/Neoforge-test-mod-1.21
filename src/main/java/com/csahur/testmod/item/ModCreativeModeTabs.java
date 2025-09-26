package com.csahur.testmod.item;

import com.csahur.testmod.TestMod;
import com.csahur.testmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TestMod.MOD_ID);


    public static final Supplier<CreativeModeTab> TEST_ITEMS_TAB = CREATIVE_MODE_TAB.register("test_items_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.SPECIAL_Feather.get()))
                    .title(Component.translatable("creativetab.testmod.test_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.JALLA);
                        output.accept(ModItems.RAW_JALLA);
                        output.accept(ModItems.EATABLE_DIAMOND);
                        output.accept(ModItems.SPECIAL_Feather);
                    })
                    .build());

    public static final Supplier<CreativeModeTab> TEST_BLOCK_TAB = CREATIVE_MODE_TAB.register("test_blocks_tab",
            () -> CreativeModeTab.builder()
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(TestMod.MOD_ID, "test_items_tab"))
                    .icon(() -> new ItemStack(ModItems.JALLA.get()))
                    .title(Component.translatable("creativetab.testmod.test_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.TEST_BLOCK);
                        output.accept(ModBlocks.TEST_ORE);
                    })
                    .build());

    public static void register(IEventBus eventbus)
    {
        CREATIVE_MODE_TAB.register(eventbus);
    }
}
