package org.bukkit.command.defaults;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.CustomTimingsHandler;

public class ReloadCommand extends BukkitCommand {
    public ReloadCommand(String name) {
        super(name);
        this.description = "Перезагружает конфигурацию сервера и плагины";
        this.usageMessage = "/reload";
        this.setPermission("bukkit.command.reload");
        this.setAliases(Arrays.asList("rl"));
    }

    @Override
    public boolean execute(CommandSender sender, String currentAlias, String[] args) {
        // MCPC+ - disable
        /*
        if (!testPermission(sender)) return true;

        CustomTimingsHandler.reload(); // Spigot
        Bukkit.reload();
        Command.broadcastCommandMessage(sender, ChatColor.GREEN + "Reload complete.");
        */
        sender.sendMessage(ChatColor.RED + "Данная команда запрещена на MCPC+ сервере.");
        // MCPC+ end

        return true;
    }
}
