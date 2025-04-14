package com.gerasic.loccounter.application.services;

import com.gerasic.loccounter.application.FileInfo;
import com.gerasic.loccounter.infrastructure.FileHandler;
import com.gerasic.loccounter.presentation.Result;

import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class LinesCounterService {
    private final FileHandler fileHandler;

    public LinesCounterService(FileHandler fileHandler) {
        this.fileHandler = fileHandler;
    }

    public Result count(List<Path> pathList) {
        List<FileInfo> fileInfoList = pathList.parallelStream()
                .map(fileHandler::getInfo)
                .collect(Collectors.toList());

        return new Result(fileInfoList);
    }
}
