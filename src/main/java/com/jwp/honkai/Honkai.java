package com.jwp.honkai;

import com.jwp.honkai.effects.CascadeEffect;
import com.jwp.honkai.registry.ModBlocks;
import com.jwp.honkai.registry.ModEffects;
import com.jwp.honkai.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Honkai implements ModInitializer {

    // QoL Variable
    public static final String MOD_ID = "honkai";

    // Creative Menu Tab
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "general"), () -> new ItemStack(ModItems.HONKAI_CUBE));

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
        ModEffects.registerEffects();
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CECILIA, RenderLayer.getCutout());
    }
}
