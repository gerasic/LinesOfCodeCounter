package com.gerasic.loccounter.application;

import java.nio.file.Path;
import java.util.Set;

public record AppConfig(Path path, Set<String> extensions) { }
