package com.relaxedmodders.midnightrealm.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class blockMRCobble extends Block {

	public blockMRCobble(int par1) {
		super(par1, Material.rock);
		this.setHardness(5F);
		this.setResistance(10F);
	}

}
