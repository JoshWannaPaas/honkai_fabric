package com.jwp.honkai.registry;

import com.jwp.honkai.Honkai;
import com.jwp.honkai.effects.CascadeEffect;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEffects {
    //Status Effects
    public static final StatusEffect CASCADE = new CascadeEffect();

    public static void registerEffects(){
        Registry.register(Registry.STATUS_EFFECT, new Identifier(Honkai.MOD_ID, "cascade"), CASCADE);
    }
}
