package dev.progames723.real_skills.fabric;

import dev.progames723.real_skills.RealSkills;
import net.fabricmc.api.ModInitializer;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;

import static dev.progames723.real_skills.RealSkills.MOD_ID;
import static dev.progames723.real_skills.RealSkills.test;

public class RealSkillsFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        RealSkills.init();
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, "test"), test);
    }
}