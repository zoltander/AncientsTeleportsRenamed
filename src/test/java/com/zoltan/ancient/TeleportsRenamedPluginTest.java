package com.zoltan.ancient;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class TeleportsRenamedPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(TeleportsRenamedPlugin.class);
		RuneLite.main(args);
	}
}