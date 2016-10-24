package com.company;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class XorFileEncoder implements FileEncoder {

    public void endcode(String inputFilePath, String outputFilePath){

        File Input = new File(inputFilePath);
        File Output = new File(outputFilePath);
        try(FileReader reader = new FileReader(Input))
        {
            char[] buffer = new char[(int)Input.length()];
            reader.read(buffer);
            Code code = new Code(new String(buffer));
            try(FileWriter writer = new FileWriter(Output)){
                writer.write(code.Encode());
            }
            catch(IOException ex){
                System.out.println(ex.getMessage());
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
