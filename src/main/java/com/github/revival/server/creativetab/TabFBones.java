package com.github.revival.server.creativetab;

import com.github.revival.server.handler.LocalizationStrings;
import com.github.revival.server.item.FAItemRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TabFBones extends CreativeTabs {
    public TabFBones(String par2Str) {
        super(par2Str);
    }

    @SideOnly(Side.CLIENT)
    public Item getTabIconItem() {
        return FAItemRegistry.skull;
    }

    public String getTranslatedTabLabel() {
        return LocalizationStrings.FBONES_NAME;
    }
}