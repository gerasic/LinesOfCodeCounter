package com.gerasic.loccounter.application.services;

import com.gerasic.loccounter.application.AppConfig;
import com.gerasic.loccounter.application.abstractions.FileProcessor;
import com.gerasic.loccounter.application.parsers.ArgumentsParser;
import com.gerasic.loccounter.presentation.Result;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class ApplicationService {
    private final LinesCounterService linesCounter;
    private final ArgumentsParser argumentsParser;
    private final FileProcessor fileProcessor;

    public ApplicationService(
            LinesCounterService linesCounter,
            ArgumentsParser argumentsParser,
            FileProcessor fileProcessor) {
        this.linesCounter = linesCounter;
        this.argumentsParser = argumentsParser;
        this.fileProcessor = fileProcessor;
    }

    public Result processArguments(String[] args) throws IOException {
        AppConfig config = argumentsParser.parse(args);

        List<Path> files = fileProcessor.getFiles(config);

        return linesCounter.count(files);
    }
}
