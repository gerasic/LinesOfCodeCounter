package com.gerasic.loccounter.presentation;

import com.gerasic.loccounter.application.FileInfo;

import java.util.List;

public class Result {
    private final List<FileInfo> filesInfo;

    public Result(List<FileInfo> filesInfo) {
        this.filesInfo = filesInfo;
    }

    @Override
    public String toString() {
        long totalLines = 0;
        long totalNonEmptyLines = 0;
        StringBuilder sb = new StringBuilder();

        for (FileInfo fileInfo : filesInfo) {
            sb.append("\033[33mFile Path:\033[0m ").append(fileInfo.path()).append("\n")
                    .append("\033[33mTotal Lines in the File:\033[0m ").append(fileInfo.totalLines()).append("\n")
                    .append("\033[33mTotal Non-Empty Lines in the File:\033[0m ").append(fileInfo.withoutEmptyLines()).append("\n")
                    .append("\n");

            totalLines += fileInfo.totalLines();
            totalNonEmptyLines += fileInfo.withoutEmptyLines();
        }

        sb.append("\033[33mTOTAL LINES:\033[0m ").append(totalLines).append("\n")
                .append("\033[33mTOTAL NON-EMPTY LINES:\033[0m ").append(totalNonEmptyLines).append("\n");

        return sb.toString();
    }

}
