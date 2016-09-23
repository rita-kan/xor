package com.company;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    static File Input = new File("input.txt");
    static File Temp = new File("tmp.txt");
    static File Output = new File("output.txt");

    static final String Key = "some random key";

    public static int Coding(File input, File output) throws IOException{
        try(FileReader reader = new FileReader(input))
        {
            char[] buffer = new char[(int)input.length()];
            reader.read(buffer);
            Code code = new Code(new String(buffer),Key);
            try(FileWriter writer = new FileWriter(output)){
                writer.write(code.Encode());
            }
            catch(IOException ex){
                System.out.println(ex.getMessage());
                return ex.hashCode();
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
            return ex.hashCode();
        }
        return 0;
    }

    public static int Compare(File file1, File file2) {
        char[] buffer1, buffer2;
        try (FileReader reader1 = new FileReader(file1)) {
            buffer1 = new char[(int) file1.length()];
            reader1.read(buffer1);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            return ex.hashCode();
        }
        try (FileReader reader2 = new FileReader(file2)) {
            buffer2 = new char[(int) file2.length()];
            reader2.read(buffer2);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            return ex.hashCode();
        }
        if (buffer1.length != buffer2.length)
            return -1;
        for (int i = 0; i < buffer1.length; i++) {
            if (buffer1[i] != buffer2[i])
                return -1;
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        if ((Coding(Input, Temp) == 0 ) && (Coding(Temp, Output) == 0)){
            switch (Compare(Input,Output)){
                case 0:
                    System.out.println("Files are equal.");
                    break;
                case -1:
                    System.out.println("Files are not equal.");
                    break;
                default:
                    break;
            }
        }
    }
}
