package com.csahur.testmod.item;

import com.csahur.testmod.TestMod;
import com.csahur.testmod.item.custom.ChiselItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TestMod.MOD_ID);

    public static final DeferredItem<Item> JALLA = ITEMS.register
            ("jalla", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAW_JALLA = ITEMS.register
            ("raw_jalla", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> EATABLE_DIAMOND = ITEMS.register
            ("eatable_diamond", () -> new Item(new Item.Properties().food(ModFoodProperties.EATABLE_DIAMOND)));

    public static final DeferredItem<Item> SPECIAL_Feather = ITEMS.register
            ("special_feather", () -> new Item(new Item.Properties().food(ModFoodProperties.SPECIAL_FEATHER)));

    public static final DeferredItem<Item> LAUNCHER = ITEMS.register
            ("launcher", () -> new DrinkItem(new Item.Properties().food(ModFoodProperties.LAUNCHER)));

    public static final DeferredItem<Item> CHISEL = ITEMS.register
            ("chisel", () -> new ChiselItem(new Item.Properties().durability(32)));


    public static void register(IEventBus eventbus)
    {
        ITEMS.register(eventbus);
    }

}
