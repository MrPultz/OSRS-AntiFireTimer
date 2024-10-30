package com.example.MrPultz;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class AntiFireTimerPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(AntiFireTimerPlugin.class);
		RuneLite.main(args);
	}
}