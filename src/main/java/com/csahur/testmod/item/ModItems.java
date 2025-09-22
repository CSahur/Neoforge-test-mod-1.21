package com.csahur.testmod.item;

import com.csahur.testmod.TestMod;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TestMod.MOD_ID);

    public static final DeferredItem<Item> JALLA = ITEMS.register
            ("jalla", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(7)
                            .saturationModifier(0.5f)
                            .build()
                    )));
    public static final DeferredItem<Item> RAW_JALLA = ITEMS.register
            ("raw_jalla", () -> new Item(new Item.Properties()));


    public static final DeferredItem<Item> EATABLE_DIAMOND = ITEMS.register
            ("eatable_diamond", () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(20)
                            .saturationModifier(4f)
                            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 1000, 0), 1.0F)
                            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 200, 1), 0.5F)
                            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 10), 1.0F)
                            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 300, 0), 1.0F)
                            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 1000, 2), 1.0F)
                            .alwaysEdible()
                            .build()
            )));





    public static void register(IEventBus eventbus)
    {
        ITEMS.register(eventbus);
    }

}
