package com.company;

import sun.misc.IOUtils;

import java.io.*;

public class XorFileEncoder implements FileEncoder {

    public void endcode(String inputFilePath, String outputFilePath) throws IOException {

        try (BufferedInputStream input = new BufferedInputStream(new FileInputStream(inputFilePath))) {
            byte[] text = new byte[input.available()];
            if (input.read(text, 0, input.available()) != -1) {
                Code code = new Code(text);
                try (BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(outputFilePath))) {
                    output.write(code.encode());
                }
            } else
                throw new IOException("The file cannot be read.");
        }
    }
}
