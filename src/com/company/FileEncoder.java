package com.company;

public interface FileEncoder {

    void endcode(String inputFilePath, String outputFilePath);

    default void encode(String inputFilePath) {
        endcode(inputFilePath, "default_output");
    }
}


