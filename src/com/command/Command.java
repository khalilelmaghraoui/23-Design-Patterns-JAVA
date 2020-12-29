package com.command;

/**
 * @author khalil el maghraoui <khalil.elmaghraoui.1@gmail.com>
 * @created 12/20/2020.
 */
public interface Command {

    void execute();

    void undo();
}
