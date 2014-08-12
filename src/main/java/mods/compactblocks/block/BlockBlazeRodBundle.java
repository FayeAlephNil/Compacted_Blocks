package mods.compactblocks.block;

import net.minecraft.block.material.Material;

public class BlockBlazeRodBundle extends BlockCB
{
    public BlockBlazeRodBundle()
    {
        super(Material.rock);
        this.setHardness(3F);
        this.setStepSound(soundTypePiston);
        this.setBlockName("blaze_rod_bundle");
    }
}
