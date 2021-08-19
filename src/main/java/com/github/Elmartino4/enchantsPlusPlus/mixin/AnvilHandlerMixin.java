package com.github.Elmartino4.enchantsPlusPlus.mixin;

import net.minecraft.screen.AnvilScreenHandler;
import net.minecraft.enchantment.Enchantment;

import com.github.Elmartino4.enchantsPlusPlus.config.ModConfig;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(AnvilScreenHandler.class)
public class AnvilHandlerMixin {
	@Redirect(method = "updateResult()V", at = @At(value = "INVOKE", target = "Lnet/minecraft/enchantment/Enchantment;getMaxLevel()I"))
	private int setMaxLevel(Enchantment ench){
		//System.out.println("anvil");
		if(!ModConfig.INSTANCE.exclude.contains(ench.getTranslationKey()))
			return ModConfig.INSTANCE.anvilMaxLevel;
		return ench.getMaxLevel();
	}
}
