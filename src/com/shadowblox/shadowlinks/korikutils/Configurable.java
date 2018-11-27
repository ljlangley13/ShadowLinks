package com.shadowblox.shadowlinks.korikutils;

import org.bukkit.configuration.ConfigurationSection;

public interface Configurable {
	public void applyTo(ConfigurationSection s);
	
	public void loadFrom(ConfigurationSection s);
}
