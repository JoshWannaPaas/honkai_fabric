package com.jwp.honkai.registry;

import com.jwp.honkai.Honkai;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.FlowerBlock;
import net.minecraft.block.Material;
import net.minecraft.block.PlantBlock;
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

    //public static final Block CECILIA = new PlantBlock();

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
    }
}

//sounds = footsteps
