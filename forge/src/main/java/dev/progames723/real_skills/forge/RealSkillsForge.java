package dev.progames723.real_skills.forge;

import dev.architectury.platform.forge.EventBuses;
import dev.progames723.real_skills.RealSkills;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.IModBusEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.NewRegistryEvent;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.registries.RegistryBuilder;

import static dev.progames723.real_skills.RealSkills.MOD_ID;
import static dev.progames723.real_skills.RealSkills.test;

@Mod(MOD_ID)
public class RealSkillsForge {
    public RealSkillsForge() {
		// Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        RealSkills.init();
    }
}