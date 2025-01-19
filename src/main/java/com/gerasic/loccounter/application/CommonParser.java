package com.gerasic.loccounter.application;

import com.gerasic.loccounter.application.commandinterpreters.*;
import com.gerasic.loccounter.application.commands.Command;

public class CommonParser implements Parser {
    private final CommandInterpreter rootInterpreter;

    public CommonParser() {
        rootInterpreter = new CountLinesCommandInterpreter();
    }
    @Override
    public Command Parse(String[] args) {
        return rootInterpreter.Interpret(args);
    }
}
