package com.gerasic.loccounter;

import com.gerasic.loccounter.application.parsers.DefaultArgumentsParser;
import com.gerasic.loccounter.application.services.ApplicationService;
import com.gerasic.loccounter.application.services.LinesCounterService;
import com.gerasic.loccounter.infrastructure.*;
import com.gerasic.loccounter.presentation.*;

public class Main {
    static public void main(String[] args) {
        IOHandler ioHandler =
            new IOHandler(
                new ApplicationService(
                    new LinesCounterService(
                        new BufferedFileHandler()),
                    new DefaultArgumentsParser(),
                    new DefaultFileProcessor()));

        ioHandler.handle(args);
    }
}
