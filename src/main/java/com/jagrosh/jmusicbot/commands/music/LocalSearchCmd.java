package com.jagrosh.jmusicbot.commands.music;

import com.jagrosh.jmusicbot.Bot;

public final class LocalSearchCmd extends SearchCmd {

    public LocalSearchCmd(Bot bot) {
        super(bot);

        this.name = "searchlocal";
        this.searchPrefix = "reclocal:";
        this.help = "searches local files for a provided query";
        this.aliases = bot.getConfig().getAliases(this.name);
    }

}