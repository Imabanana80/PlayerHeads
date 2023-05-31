package com.imabanana80.playerheads.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;
import org.jetbrains.annotations.NotNull;

public class PlayerHeadCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if (command.getName().equalsIgnoreCase("playerhead")){
            if (commandSender instanceof Player p){

                ItemStack playerhead = new ItemStack(Material.PLAYER_HEAD,1);
                SkullMeta skullmeta = (SkullMeta) playerhead.getItemMeta();
                if (strings.length > 0){
                    skullmeta.setOwner(strings[0]);
                } else {
                    skullmeta.setOwner(p.getName());
                }
                playerhead.setItemMeta(skullmeta);

                p.getInventory().addItem(playerhead);
            }
        }
        return true;
    }
}
