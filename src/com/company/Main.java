package com.company;

import java.io.IOException;

//test trial

public class Main {

    public static void main(String[] args) throws IOException {

        String inputFilePath = "input.txt";
        String outputFilePath = "output.txt";

        try {
            FileEncoder encoder = new XorFileEncoder();
            encoder.endcode(inputFilePath, outputFilePath);
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
        try {
            FileDecoder decoder = new XorFileDecoder();
            String result = decoder.decode(outputFilePath);
            System.out.println(result);
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }
}
