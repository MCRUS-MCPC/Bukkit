package org.bukkit.command.defaults;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

public class TestForCommand extends VanillaCommand {
    public TestForCommand() {
        super("testfor");
        this.description = "Проверяет наличие игрока онлайн";
        this.usageMessage = "/testfor <игрок>";
        this.setPermission("bukkit.command.testfor");
    }

    @Override
    public boolean execute(CommandSender sender, String currentAlias, String[] args) {
        if (!testPermission(sender)) return true;
        if (args.length < 1)  {
            sender.sendMessage(ChatColor.RED + "Синтаксис: " + usageMessage);
            return false;
        }

        sender.sendMessage(ChatColor.RED + "/testfor можно использовать только для командных блоков с выходным сигналом.");
        return true;
    }
}
