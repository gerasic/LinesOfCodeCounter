package com.gerasic.loccounter.application.commandinterpreters;

import com.gerasic.loccounter.application.commands.Command;

public class CommandInterpreterBase implements CommandInterpreter {
    private CommandInterpreter nextInterpreter;

    @Override
    public CommandInterpreter SetNext(CommandInterpreter next) {
        nextInterpreter = next;

        return nextInterpreter;
    }

    @Override
    public Command Interpret(String[] args) {
        if (nextInterpreter == null) {
            return null;
        }

        return nextInterpreter.Interpret(args);
    }
}
