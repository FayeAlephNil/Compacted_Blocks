package mods.compactblocks.reference;

import mods.compactblocks.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class BlocksReference
{
    public static final Item ItemsNeeded[] = {Items.stick, Items.blaze_rod};
    public static final Block BlocksNeeded[] = {Blocks.obsidian, Blocks.log};

    public static final Block CompressedBlocks[] = {ModBlocks.compressed_obsidian, ModBlocks.log_pile};
    public static final Block ItemBlocks[] = {ModBlocks.stick_bundle, ModBlocks.blaze_rod_bundle};
}
