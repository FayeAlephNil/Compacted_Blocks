package mods.compactblocks.block;

import net.minecraft.block.material.Material;

public class BlockLogPile extends BlockCB
{
    public BlockLogPile()
    {
        super(Material.wood);
        this.setHardness(8F);
        this.setStepSound(soundTypeWood);
        this.setBlockName("log_pile");
    }
}
