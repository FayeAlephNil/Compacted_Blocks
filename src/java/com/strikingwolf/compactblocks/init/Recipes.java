package com.strikingwolf.compactblocks.init;

import com.strikingwolf.compactblocks.reference.BlocksReference;
import com.strikingwolf.compactblocks.reference.ItemsReference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes
{
    public static void init() {

        //Compressed Blocks
        for (int i = 0; i < BlocksReference.BlocksNeeded.length; i++)
        {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlocksReference.CompressedBlocks[i]), "OOO", "OOO", "OOO", 'O', BlocksReference.BlocksNeeded[i]));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(BlocksReference.BlocksNeeded[i], 9), BlocksReference.CompressedBlocks[i]));

        }
        //Compressed Items
        for (int i = 0; i < BlocksReference.ItemsNeeded.length; i++)
        {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlocksReference.ItemBlocks[i]),"II ", "II ", "   " , 'I', BlocksReference.ItemsNeeded[i]));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(BlocksReference.ItemsNeeded[i], 4), BlocksReference.ItemBlocks[i]));
        }
    }
}
