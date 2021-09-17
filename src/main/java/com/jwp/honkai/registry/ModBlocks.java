package com.jwp.honkai.registry;

import com.jwp.honkai.Honkai;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    /**
     * Honkai Cube Block is the pink thing. Looks really cool and magical
     */
    public static final Block HONKAI_CUBE_BLOCK = new Block(
        FabricBlockSettings
            .of(Material.METAL)
            .luminance(14)
            .breakByTool(FabricToolTags.PICKAXES,3)
            .requiresTool()
            .strength(50.0f, 500.0f)
            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
    );

    //public static final Cecilia CECILIA = new Cecilia();
    public static final FlowerBlock CECILIA = new FlowerBlock(StatusEffects.LEVITATION, 5, AbstractBlock.Settings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).nonOpaque());


    /**
     * Cubert is a wooden cube friend
     */
    public static final Block CUBERT = new Block(
        FabricBlockSettings
            .of(Material.WOOD)
            .luminance(2)
            .breakByTool(FabricToolTags.AXES, 3)
            .requiresTool()
            .strength(50.0f, 500.0f)
            .sounds(BlockSoundGroup.WOOD)
    );

    /**
     * Registers all of the blocks I guess.
     */
    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(Honkai.MOD_ID, "honkai_cube_block"), HONKAI_CUBE_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Honkai.MOD_ID, "cubert"), CUBERT);
        Registry.register(Registry.BLOCK, new Identifier(Honkai.MOD_ID, "cecilia"), CECILIA);
    }
}

//sounds = footsteps
