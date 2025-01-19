package com.gerasic.loccounter.domain;

import com.gerasic.loccounter.infrastructure.CommonFileService;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileManager {
    private final FileService fileService;

    public FileManager() {
        fileService = new CommonFileService();
    }

    public String GetFileLinesAmount(String path) {
        Path pathToFile = Paths.get(path);

        return String.valueOf(fileService.GetFileLinesAmount(pathToFile));
    }
}
