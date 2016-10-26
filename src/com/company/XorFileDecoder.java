package com.company;

import java.io.*;

public class XorFileDecoder implements FileDecoder {
    public String decode(String inputFilePath) throws IOException {
        try (BufferedInputStream input = new BufferedInputStream(new FileInputStream(inputFilePath))) {
            byte[] text = new byte[input.available()];
            if (input.read(text, 0, input.available()) != -1) {
                Code code = new Code(text);
                return (new String(code.decode()));
            } else
                throw new IOException("The file cannot be read.");
        }
    }
}
