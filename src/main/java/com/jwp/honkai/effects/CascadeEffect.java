package com.jwp.honkai.effects;

import com.jwp.honkai.damagesources.CascadeDamageSource;
import com.jwp.honkai.registry.ModItems;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectType;

public class CascadeEffect extends StatusEffect {
    private final CascadeDamageSource CASCADING = new CascadeDamageSource();

    public CascadeEffect() {
        super(StatusEffectType.HARMFUL, 0xFF0000);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier){
        return true;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier){
        entity.damage(CASCADING, 1.0F);
    }

}
