package com.gerasic.loccounter.application;

import com.gerasic.loccounter.application.commands.Command;

public class ConsoleApplicationService implements ApplicationService {
    private final Parser parser;

    public ConsoleApplicationService(Parser parser) {
        this.parser = parser;
    }

    @Override
    public String Handle(String[] args) {
        Command command = parser.Parse(args);

        if (command == null) {
            return "Invalid command";
        }

        return command.Execute();
    }
}
