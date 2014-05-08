package com.relaxedmodders.midnightrealm;

import com.relaxedmodders.midnightrealm.blocks.MRBlocks;
import com.relaxedmodders.midnightrealm.lib.Reference;
import com.relaxedmodders.midnightrealm.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class MidnightRealm {
	
	@SidedProxy(
			clientSide = Reference.CLIENT_PROXY_LOCATION,
			serverSide = Reference.SERVER_PROXY_LOCATION)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		MRBlocks.addBlocks();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
}
