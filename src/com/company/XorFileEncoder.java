package com.company;

import sun.misc.IOUtils;

import java.io.*;

public class XorFileEncoder implements FileEncoder {

    public void endcode(String inputFilePath, String outputFilePath) throws IOException{

        try(BufferedInputStream Input = new BufferedInputStream(new FileInputStream(inputFilePath)))
        {
            byte[] text = new byte[Input.available()];
            if (Input.read(text,0,Input.available())!=-1) {
                Code code = new Code(text);
                try (BufferedOutputStream Output = new BufferedOutputStream(new FileOutputStream(outputFilePath))) {
                    Output.write(code.Encode());
                }
            }
            else
                throw new IOException("The file cannot be read.");
        }
    }
}
