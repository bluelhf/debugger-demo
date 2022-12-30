package blue.lhf.debugger_demo;

import org.bukkit.command.*;

import java.util.*;

public class TestExecutor implements TabExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String alias, String[] args) {
        sender.sendMessage("Hello, %s!".formatted(sender.getName()));
        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        return Collections.emptyList();
    }
}
