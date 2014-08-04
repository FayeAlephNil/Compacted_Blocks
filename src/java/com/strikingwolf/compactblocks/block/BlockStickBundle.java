package com.strikingwolf.compactblocks.block;

import net.minecraft.block.material.Material;

public class BlockStickBundle extends BlockCB
{
    public BlockStickBundle()
    {
        super(Material.wood);
        this.setHardness(2F);
        this.setStepSound(soundTypeWood);
        this.setBlockName("stick_bundle");
    }
}
