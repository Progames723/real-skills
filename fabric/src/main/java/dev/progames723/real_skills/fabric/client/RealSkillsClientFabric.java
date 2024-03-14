package dev.progames723.real_skills.fabric.client;

import net.fabricmc.api.ClientModInitializer;

import static dev.progames723.real_skills.RealSkills.LOGGER;

public class RealSkillsClientFabric implements ClientModInitializer {
	
	@Override
	public void onInitializeClient() {
		LOGGER.info("client lol");
	}
}
