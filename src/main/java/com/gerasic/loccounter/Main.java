package com.gerasic.loccounter;

import com.gerasic.loccounter.api.*;
import com.gerasic.loccounter.application.*;

public class Main {
    public static void main(String[] args) {
        IOHandler ioHandler =
            new IOConsoleHandler(
                new ConsoleApplicationService(
                    new CommonParser()));

        ioHandler.Handle(args);
    }
}
