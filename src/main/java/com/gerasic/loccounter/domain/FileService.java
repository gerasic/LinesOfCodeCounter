package com.gerasic.loccounter.domain;

import java.nio.file.Path;

public interface FileService {
    long GetFileLinesAmount(Path path);
}
