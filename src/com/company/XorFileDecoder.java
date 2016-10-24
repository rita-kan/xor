package com.company;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class XorFileDecoder implements FileDecoder {
    public String decode(String inputFilePath){
        File Input = new File(inputFilePath);
        try(FileReader reader = new FileReader(Input))
        {
            char[] buffer = new char[(int)Input.length()];
            reader.read(buffer);
            Code code = new Code(new String(buffer));
            return code.Encode();
        }
        catch(IOException ex) {
            System.out.println(ex.getMessage());
            return "ERROR";
        }
    }
}
