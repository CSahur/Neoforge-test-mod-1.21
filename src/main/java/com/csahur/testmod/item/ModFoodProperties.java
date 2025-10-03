package com.csahur.testmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class ModFoodProperties {
    public static final FoodProperties EATABLE_DIAMOND = new FoodProperties.Builder()
            .nutrition(20)
            .saturationModifier(2f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 1000, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 200, 1), 0.5F)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 10), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 300, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 1000, 2), 1.0F)
            .alwaysEdible()
            .build();

    public static final FoodProperties SPECIAL_FEATHER = new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1000, 1), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.SLOW_FALLING, 400, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 200, 254), 0.01F)
            .effect(() -> new MobEffectInstance(MobEffects.LEVITATION, 200   , 1), 1.0F)
            .alwaysEdible()
            .build();

    public static final FoodProperties LAUNCHER = new FoodProperties.Builder()
            .nutrition(1)
            .saturationModifier(0.2f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1000, 1), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 200, 254), 0.02F)
            .effect(() -> new MobEffectInstance(MobEffects.LEVITATION, 3, 150), 1.0F)
            .alwaysEdible()
            .build();
}