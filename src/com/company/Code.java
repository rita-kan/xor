package com.company;

public class Code {

    public static String Text;
    private static String Key = "some random key";

    public Code(String text){
        Text = text;
    }

    public String Encode(){
        byte[] text = Text.getBytes();
        byte[] key = Key.getBytes();
        byte[] result = new byte[Text.length()];
        for (int i = 0; i<Text.length(); i++) {
            result[i] = (byte) (text[i] ^ key[i % Key.length()]);
        }
        return new String(result);
    }
}
