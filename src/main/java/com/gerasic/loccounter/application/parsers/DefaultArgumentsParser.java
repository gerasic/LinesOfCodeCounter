package com.gerasic.loccounter.application.parsers;

import com.gerasic.loccounter.application.AppConfig;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class DefaultArgumentsParser implements ArgumentsParser {
    @Override
    public AppConfig parse(String[] args) throws IOException {
        Path path = Paths.get(args[0]);

        Set<String> extensions = Arrays.stream(args)
                .skip(1)
                .collect(Collectors.toSet());

        if (!path.toFile().exists()) {
            throw new IOException("The specified path does not exist: " + path);
        }

        return new AppConfig(path, extensions);
    }
}
