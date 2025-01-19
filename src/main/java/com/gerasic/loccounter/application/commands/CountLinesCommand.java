package com.gerasic.loccounter.application.commands;

import com.gerasic.loccounter.domain.FileManager;

public class CountLinesCommand implements Command {
    private final String path;
    private final FileManager fileManager;

    public CountLinesCommand(String path) {
        this.path = path;
        this.fileManager = new FileManager();
    }

    @Override
    public String Execute() {
        return fileManager.GetFileLinesAmount(path);
    }
}
