package com.gerasic.loccounter.infrastructure;

import com.gerasic.loccounter.application.AppConfig;
import com.gerasic.loccounter.application.abstractions.FileProcessor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DefaultFileProcessor implements FileProcessor {
    @Override
    public List<Path> getFiles(AppConfig config) throws IOException {
        Path directory = config.path();
        Set<String> allowedExtensions = config.extensions();

        try (Stream<Path> paths = Files.walk(directory)) {
            return paths
                    .filter(Files::isRegularFile)
                    .filter(path -> hasAllowedExtension(path, allowedExtensions))
                    .collect(Collectors.toList());
        }
    }

    private boolean hasAllowedExtension(Path path, Set<String> allowedExtensions) {
        if (allowedExtensions.isEmpty()) {
            return true;
        }

        String fileName = path.getFileName().toString();

        int dotIndex = fileName.lastIndexOf('.');
        if (dotIndex == -1) {
            return false;
        }

        String extension = fileName.substring(dotIndex);

        return allowedExtensions.contains(extension);
    }
}
