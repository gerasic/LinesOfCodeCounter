package com.gerasic.loccounter.application.parsers;

import com.gerasic.loccounter.application.AppConfig;

import java.io.IOException;

public interface ArgumentsParser {
    AppConfig parse(String[] args) throws IOException;
}
