package com.gerasic.loccounter.infrastructure;

import com.gerasic.loccounter.application.FileInfo;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class BufferedFileHandler implements FileHandler {
    @Override
    public FileInfo getInfo(Path path) {
        int totalLines = 0;
        int nonEmptyLines = 0;

        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                totalLines++;
                if (!line.trim().isEmpty()) {
                    nonEmptyLines++;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("Error while reading file: " + path, e);
        }

        return new FileInfo(path, totalLines, nonEmptyLines);
    }
}
