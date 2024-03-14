package dev.progames723.real_skills;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RealSkills {
	public static final String MOD_ID = "real_skills";
	public static final Logger LOGGER = LoggerFactory.getLogger("Real Skills");
	public static final Item test = new Item(new Item.Properties().fireResistant().stacksTo(2));
	public static void init() {
		LOGGER.info("real");
	}
}
