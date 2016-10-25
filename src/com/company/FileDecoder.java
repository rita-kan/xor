package com.company;

import java.io.IOException;

public interface FileDecoder {

    String decode(String inputFilePath) throws IOException;
}
