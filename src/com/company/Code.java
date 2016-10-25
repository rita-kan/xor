package com.company;

public class Code {

    public static byte[] Text;
    private static String Key = "some random key";

    public Code(byte[] textbytes){
        Text = textbytes;
    }

    private byte[] XOR() {
        byte[] key = Key.getBytes();
        byte[] result = new byte[Text.length];
        for (int i = 0; i<Text.length; i++) {
            result[i] = (byte) (Text[i] ^ key[i % Key.length()]);
        }
        return result;
    }

    public byte[] Encode(){
       return XOR();
    }

    public byte[] Decode(){
        return XOR();
    }
}
