package com.imabanana80.playerheads;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public final class PlayerHeads extends JavaPlugin{

    @Override
    public void onEnable() {

    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (command.getName().equalsIgnoreCase("playerhead")){
            if (sender instanceof Player p){

                ItemStack playerhead = new ItemStack(Material.PLAYER_HEAD,1);
                SkullMeta skullmeta = (SkullMeta) playerhead.getItemMeta();
                skullmeta.setOwner(args[0]);
                playerhead.setItemMeta(skullmeta);

                p.getInventory().addItem(playerhead);

            }
        }


        return true;
    }
}
