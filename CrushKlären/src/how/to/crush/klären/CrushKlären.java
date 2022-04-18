package how.to.crush.klären;

import how.to.crush.klären.message.AnmachSpruch;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class CrushKlären extends JavaPlugin {

    @Override
    public void onEnable() {

        Bukkit.getConsoleSender().sendMessage("§7Crush Plugin wurde aktiviert§8!");
        this.getCommand("Crush").setExecutor(new AnmachSpruch());
    }
}
