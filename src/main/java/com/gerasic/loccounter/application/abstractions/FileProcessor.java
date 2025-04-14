package com.gerasic.loccounter.application.abstractions;

import com.gerasic.loccounter.application.AppConfig;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public interface FileProcessor {
    public List<Path> getFiles(AppConfig config) throws IOException;
}
