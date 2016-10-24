package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        String inputFilePath = "input.txt";
        String outputFilePath = "output.txt";

        FileEncoder encoder = new XorFileEncoder();
        encoder.endcode(inputFilePath, outputFilePath);

        FileDecoder decoder = new XorFileDecoder();
        String result = decoder.decode(outputFilePath);

        System.out.println(result);
    }
}
