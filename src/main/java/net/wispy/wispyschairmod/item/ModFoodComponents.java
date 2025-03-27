package net.wispy.wispyschairmod.item;

import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.component.type.ConsumableComponents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;

public class ModFoodComponents {

    public static final FoodComponent WARDEN_SANDWICH = new FoodComponent.Builder().nutrition(10).saturationModifier(0.8f).build();

    public static final ConsumableComponent WARDEN_SANDWICH_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.SATURATION, 500), 1.0f)).build();
}
