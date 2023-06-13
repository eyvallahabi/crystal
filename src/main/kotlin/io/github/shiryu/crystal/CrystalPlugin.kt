package io.github.shiryu.crystal

import org.bukkit.plugin.java.JavaPlugin

class CrystalPlugin : JavaPlugin() {

    companion object{
        @JvmStatic
        lateinit var plugin : CrystalPlugin
    }

    override fun onEnable(){
        plugin = this

        config.options().copyDefaults(true)
        saveDefaultConfig()
    }
}