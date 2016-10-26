package com.company;

public class Code {

    public byte[] textBytes;
    private static String keyString = "some random key";

    public Code(byte[] textbytes) {
        this.textBytes = textbytes;
    }

    private byte[] xor() {
        byte[] keyByte = keyString.getBytes();
        byte[] result = new byte[this.textBytes.length];
        for (int i = 0; i < this.textBytes.length; i++) {
            result[i] = (byte) (this.textBytes[i] ^ keyByte[i % keyString.length()]);
        }
        return result;
    }

    public byte[] encode() {
        return xor();
    }

    public byte[] decode() {
        return xor();
    }
}
