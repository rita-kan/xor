package com.company;

import java.io.IOException;

public interface FileEncoder {

    void endcode(String inputFilePath, String outputFilePath) throws IOException;

    default void encode(String inputFilePath) throws IOException{
        endcode(inputFilePath, "default_output");
    }
}


