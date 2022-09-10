package com.potassium.HadeanCraft;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(HadeanCraft.MOD_ID)
public class HadeanCraft {
	public static final String MOD_ID="hadeancraft";
	public HadeanCraft() {

		MinecraftForge.EVENT_BUS.register(this);
		
		
	}
}
