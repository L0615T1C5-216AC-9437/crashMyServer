package cms;

import arc.util.CommandHandler;
import arc.util.Log;
import mindustry.plugin.Plugin;

public class Main extends Plugin {
    public Main() {}
    public void registerServerCommands(CommandHandler handler) {
        handler.register("crashmyserver", "crash my server cuz y not", arg -> {
            String[] strings = new String[5];
            strings[1].toLowerCase().replaceFirst("a", "").trim().substring(1);
            Log.info(strings[1]);
        });
    }
}