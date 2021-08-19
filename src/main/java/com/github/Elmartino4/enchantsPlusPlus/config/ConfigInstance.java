package com.github.Elmartino4.enchantsPlusPlus.config;

import java.util.ArrayList;

public class ConfigInstance {
  public int anvilMaxLevel;
  public ArrayList<String> exclude;
  public ConfigInstance() {
    anvilMaxLevel = 10;
    exclude = new ArrayList<String>();

    exclude.add("enchantment.minecraft.aqua_affinity");
    exclude.add("enchantment.minecraft.channeling");
    exclude.add("enchantment.minecraft.binding_curse");
    exclude.add("enchantment.minecraft.vanishing_curse");
    exclude.add("enchantment.minecraft.flame");
    exclude.add("enchantment.minecraft.infinity");
    exclude.add("enchantment.minecraft.mending");
    exclude.add("enchantment.minecraft.multishot");
    exclude.add("enchantment.minecraft.silk_touch");
  }
}
