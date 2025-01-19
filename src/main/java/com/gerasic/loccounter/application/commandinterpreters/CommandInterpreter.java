package com.gerasic.loccounter.application.commandinterpreters;

import com.gerasic.loccounter.application.commands.Command;

public interface CommandInterpreter {
    CommandInterpreter SetNext(CommandInterpreter next);

    Command Interpret(String[] args);
}
