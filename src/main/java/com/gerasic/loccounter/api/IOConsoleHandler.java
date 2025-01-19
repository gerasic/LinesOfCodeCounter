package com.gerasic.loccounter.api;

import com.gerasic.loccounter.application.ApplicationService;
import com.gerasic.loccounter.application.Parser;

public class IOConsoleHandler implements IOHandler {
    private final ApplicationService applicationService;

    public IOConsoleHandler(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @Override
    public void Handle(String[] args) {
        if (args.length == 0) {
            System.out.println("Not enough arguments");
            return;
        }

        String output = applicationService.Handle(args);
        System.out.println(output);
    }
}
