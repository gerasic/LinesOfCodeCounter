package com.gerasic.loccounter.presentation;

import com.gerasic.loccounter.application.services.ApplicationService;

import java.io.IOException;

public class IOHandler {
    private final ApplicationService applicationService;

    public IOHandler(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    public void handle(String[] args) {
        if (args.length < 1) {
            System.out.println("Not enough arguments");
            return;
        }

        try {
            Result output = applicationService.processArguments(args);
            System.out.println(output.toString());
        } catch (IOException e) {
            System.err.println("Invalid argument: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Undefined error: " + e.getMessage());
        }
    }
}