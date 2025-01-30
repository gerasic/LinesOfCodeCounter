package com.gerasic.loccounter.application;

import java.nio.file.Path;

public record FileInfo(Path path, long totalLines, long withoutEmptyLines) { }
