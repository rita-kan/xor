package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        String inputFilePath = "input.txt";
        String outputFilePath = "output.txt";

        try {
            FileEncoder encoder = new XorFileEncoder();
            encoder.endcode(inputFilePath, outputFilePath);
            try {
                FileDecoder decoder = new XorFileDecoder();
                String result = decoder.decode(outputFilePath);
                System.out.println(result);
            } catch (IOException ex) {
                System.out.println(ex.toString());
            }
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }
}
