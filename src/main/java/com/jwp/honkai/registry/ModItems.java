package com.jwp.honkai.registry;

import com.jwp.honkai.Honkai;
import com.jwp.honkai.toolmaterials.HonkaiCubeToolMaterial;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    //Items
    public static final Item HONKAI_CUBE = new Item(new Item.Settings().group(Honkai.ITEM_GROUP));
    public static final SwordItem VOID_SPEAR = new SwordItem(HonkaiCubeToolMaterial.INSTANCE, 15, -1.0f, new Item.Settings().group(Honkai.ITEM_GROUP));


    //Blocks
    public static final BlockItem HONKAI_CUBE_BLOCK = new BlockItem(ModBlocks.HONKAI_CUBE_BLOCK, new Item.Settings().group(Honkai.ITEM_GROUP));
    public static final BlockItem CUBERT = new BlockItem(ModBlocks.CUBERT, new Item.Settings().group(Honkai.ITEM_GROUP));
    public static final BlockItem CECILIA = new BlockItem(ModBlocks.CECILIA, new Item.Settings().group(Honkai.ITEM_GROUP));


    public static void registerItems(){
        Registry.register(Registry.ITEM, new Identifier(Honkai.MOD_ID, "honkai_cube"), HONKAI_CUBE);
        Registry.register(Registry.ITEM, new Identifier(Honkai.MOD_ID, "void_spear"), VOID_SPEAR);
        Registry.register(Registry.ITEM, new Identifier(Honkai.MOD_ID, "honkai_cube_block"), HONKAI_CUBE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Honkai.MOD_ID, "cubert"), CUBERT);
        Registry.register(Registry.ITEM, new Identifier(Honkai.MOD_ID, "cecilia"), CECILIA);
    }
}
