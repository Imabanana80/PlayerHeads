package com.imabanana80.playerheads;

import com.imabanana80.playerheads.commands.PlayerHeadCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class PlayerHeads extends JavaPlugin{

    @Override
    public void onEnable() {
        getCommand("playerhead").setExecutor(new PlayerHeadCommand());
    }
}
