package at.pl4yingnight.testplugin;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.annotation.plugin.*;
import org.bukkit.plugin.java.annotation.plugin.ApiVersion.Target;
import org.bukkit.plugin.java.annotation.plugin.author.Author;
import at.pl4yingnight.testplugin.database.Neo4j;

@Plugin(name = "TestPlugin", version = "2")
@Author(value = "Pl4yingNight")
@ApiVersion(Target.v1_13)
public class TestPlugin extends JavaPlugin {

	public static TestPlugin plugin = null;

	private Neo4j neo4jProvider = null;
	private FileConfiguration config = null;

	@Override
	public void onLoad() {
		plugin = this;
		// load config
		this.saveDefaultConfig();
		config = this.getConfig();

		// load databases
		neo4jProvider = new Neo4j(config.getString("databases.neo4j.address"), config.getString("databases.neo4j.user"),
				config.getString("databases.neo4j.password"));

		neo4jProvider.conntect();

		getServer().shutdown();

		getLogger().info("Loaded");
	}

	@Override
	public void onEnable() {
		getLogger().info("Enabled");
	}

	@Override
	public void onDisable() {
		getLogger().info("Disabled");
	}

}
