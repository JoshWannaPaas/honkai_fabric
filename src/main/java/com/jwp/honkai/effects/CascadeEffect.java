package com.jwp.honkai.effects;

import com.jwp.honkai.damagesources.CascadeDamageSource;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectType;
import net.minecraft.entity.player.PlayerEntity;

public class CascadeEffect extends StatusEffect {
    private CascadeDamageSource CASCADING = new CascadeDamageSource();


    public CascadeEffect() {
        super(StatusEffectType.HARMFUL, 0xFF0000);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier){
        //if holding honkai material item, true
        //if not, false
        return true;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier){
        entity.damage(CASCADING, 1.0F);
    }

}
