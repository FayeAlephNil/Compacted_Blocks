package mods.compactblocks.block;

import net.minecraft.block.material.Material;

public class BlockCompressedObsidian extends BlockCB
{
    public BlockCompressedObsidian()
    {
        super(Material.rock);
        this.setHardness(16F);
        this.setStepSound(soundTypeStone);
        this.setBlockName("compressed_obsidian");
    }
}
