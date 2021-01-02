package com.command;

/**
 * @author khalil el maghraoui <khalil.elmaghraoui.1@gmail.com>
 * @created 12/20/2020.
 */
public class TurnOnMusicCommand implements Command {

    private MusicPlayer musicPlayer;

    public TurnOnMusicCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        this.musicPlayer.turnOn();
    }

    @Override
    public void undo() {
        this.musicPlayer.turnOff();
    }
}
