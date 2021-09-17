package com.jwp.honkai.toolmaterials;

import com.jwp.honkai.registry.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class HonkaiCubeToolMaterial implements ToolMaterial {

    public static final HonkaiCubeToolMaterial INSTANCE = new HonkaiCubeToolMaterial();

    @Override
    public int getDurability() {
        return 5000;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 20.0f;
    }

    @Override
    public float getAttackDamage() {
        return 0f;
    }

    @Override
    public int getMiningLevel() {
        return 5;
    }

    @Override
    public int getEnchantability() {
        return 30;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.HONKAI_CUBE);
    }
}
