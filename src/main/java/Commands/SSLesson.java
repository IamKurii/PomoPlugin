package Commands;

import org.bukkit.WeatherType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class SSLesson implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player || sender instanceof ConsoleCommandSender) {
            Player p = (Player) sender;
            if (p.hasPermission("pomo.sslesson")) {

                p.setFlying(true);
                p.sendMessage("§c§lPOMO&7: §3Se vuoi info sulle lesson guarda qui: §fhttps://discord.gg/ju26FTuHTG");
                p.setOp(true);
                p.setPlayerWeather(WeatherType.DOWNFALL);
                p.setMaxHealth(200);

            }



        }

        return false;
    }
}
