package com.gerasic.loccounter.application.commandinterpreters;

import com.gerasic.loccounter.application.commands.Command;
import com.gerasic.loccounter.application.commands.CountLinesCommand;

public class CountLinesCommandInterpreter extends CommandInterpreterBase {
    @Override
    public Command Interpret(String[] args) {
        if (args.length != 2) {
            return null;
        }

        if (!args[0].equals("--count-lines")) {
            return null;
        }

        return new CountLinesCommand(args[1]);
    }
}
