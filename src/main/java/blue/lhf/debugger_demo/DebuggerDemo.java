package blue.lhf.debugger_demo;

import org.bukkit.command.PluginCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class DebuggerDemo extends JavaPlugin {
    @Override
    public void onEnable() {
        final PluginCommand testCommand;
        if ((testCommand = getCommand("test")) != null) {
            testCommand.setExecutor(new TestExecutor());
        }
    }
}