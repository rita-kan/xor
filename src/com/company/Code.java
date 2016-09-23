package com.company;

/**
 * Created by 1 on 23.09.2016.
 */
public class Code {

    public static String Text;
    private static String Key;

    public Code(String text, String key){
        Text = text;
        Key = key;
    }

    public static String Encode(){
        byte[] text = Text.getBytes();
        byte[] key = Key.getBytes();
        byte[] result = new byte[Text.length()];
        for (int i = 0; i<Text.length(); i++) {
            result[i] = (byte) (text[i] ^ key[i % Key.length()]);
        }
        return new String(result);
    }
}
