package com.relaxedmodders.midnightrealm.blocks;

import com.relaxedmodders.midnightrealm.lib.MRString;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class MRBlocks {
	//Main Blocks
	public static Block cursedGrass;
	public static Block taintedSoil;
	public static Block shadowStone;
	public static Block shadowCobble;
	public static Block taintedSand;
	//Woods
	public static Block corruptOak;
	public static Block sageWood;
	public static Block yggdrassilLog;
	public static Block moonLog;
	public static Block spirtualLog;
	//Ores
	public static Block ikariteOre;
	public static Block lunariteOre;
	public static Block lunestoneOre;
	public static Block shadowOre;
	public static Block soulIronOre;
	//Blocks
	public static Block ikariteBlock;
	public static Block lunariteBlock;
	public static Block lunestoneBlock;
	public static Block shadowBlock;
	public static Block soulIronBlock;
	
	public static void addBlocks(){
		cursedGrass = new blockMRGrass(1500);
		taintedSoil = new blockMRDirt(1501);
		shadowStone = new blockMRStone(1502);
		shadowCobble = new blockMRCobble(1503);
		
		GameRegistry.registerBlock(cursedGrass, MRString.CURSEDGRASS_NAME);
		GameRegistry.registerBlock(taintedSoil, MRString.TAINTEDSOIL_NAME);
		GameRegistry.registerBlock(shadowStone, MRString.SHADOWSTONE_NAME);
		GameRegistry.registerBlock(shadowCobble, MRString.SHADOWCOBBLE_NAME);
	}
}
