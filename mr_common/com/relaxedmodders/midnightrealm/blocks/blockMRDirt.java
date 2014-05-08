package com.relaxedmodders.midnightrealm.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class blockMRDirt extends Block {
	
	public blockMRDirt(int par1) {
		super(par1, Material.grass);
		this.setHardness(2.5F);
		this.setResistance(6F);
	}
}
