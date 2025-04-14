package com.gerasic.loccounter.infrastructure;

import com.gerasic.loccounter.application.FileInfo;

import java.nio.file.Path;

public interface FileHandler {
    FileInfo getInfo(Path path);
}
