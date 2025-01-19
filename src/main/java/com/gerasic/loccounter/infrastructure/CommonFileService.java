package com.gerasic.loccounter.infrastructure;

import com.gerasic.loccounter.domain.FileService;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CommonFileService implements FileService {

    @Override
    public long GetFileLinesAmount(Path path) {
        try (var lines = Files.lines(path)) {
            return lines.count();
        } catch (IOException e) {
            throw new RuntimeException("Error with reading file: " + path, e);
        }
    }
}
