package com.company;

import java.io.*;

public class XorFileDecoder implements FileDecoder {
    public String decode(String inputFilePath) throws IOException{
        try (BufferedInputStream Input = new BufferedInputStream(new FileInputStream(inputFilePath))) {
            byte[] text = new byte[Input.available()];
            if(Input.read(text, 0, Input.available())!=-1) {
                Code code = new Code(text);
                return (new String(code.Decode()));
            }
            else
                throw new IOException("The file cannot be read.");
        }
    }
}
