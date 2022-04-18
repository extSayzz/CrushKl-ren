package how.to.crush.klären.message;

import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.permissions.PermissionAttachmentInfo;
import org.bukkit.plugin.Plugin;

import java.util.Set;

public class AnmachSpruch implements CommandExecutor {

    @Override
    public boolean onCommand (final CommandSender sender, Command cmd, String s, String[] args) {
        if(!(sender instanceof Player)) {
            sender.sendMessage("§cDu bist kein Spieler§8!");
        }else {
                sender.sendMessage("§7wenn du es ernst meinst schreib ihr irgendeine herzzerbrechende scheiße die muss nur horny werden ¯\\_(ツ)_/¯ ~ Chris");
                sender.sendMessage("§7Hol dein Schwanz neben ihr raus§8, §7und flüste ihr ins Ohr, dein Lolli ist bereit§8!");
            }
        return false;
    }
}
