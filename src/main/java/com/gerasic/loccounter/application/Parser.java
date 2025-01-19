package com.gerasic.loccounter.application;

import com.gerasic.loccounter.application.commands.Command;

public interface Parser {
    Command Parse(String[] args);
}
