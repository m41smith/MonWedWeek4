package com.company;

import java.io.File;

public interface Logger {
    String DEFAULT_FILE_NAME = "log.txt";
    void writeLogging(String toLog);

    private void demoPrivateMethod(){
        System.out.println("This is a private method");
    }

    default boolean doesLogFileExist(){
        demoPrivateMethod();
        File logFile = new File(DEFAULT_FILE_NAME);
        return logFile.exists();
    }
}
