package com.kovanlabs.intern.week.task.day5regex;

public class Enigma {
    private static int key = 8;
    private String xorOperation(String s , int key){
        char[] xorArray = new char[s.length()];
        for(int i = 0; i < s.length(); i++){
            xorArray[i] = (char) (s.charAt(i) ^ key);
        }
        String xorString = new String(xorArray);
        return xorString;
    }

    private String encrypt(String s , int key ){
        String encryptMsg = xorOperation(s , key);
        return encryptMsg;
    }

    private String decrypt(String msg , int key ){
        String decryptMsg = xorOperation(msg, key);
        return decryptMsg;
    }

    public static void main(String[] args) {
        String msg = "ABILESH ROCKSTAR";
        Enigma e = new Enigma();

        String encryptMsg = e.encrypt(msg , key);
        System.out.println(encryptMsg);
        String decryptMsg = e.decrypt(encryptMsg , key);
        System.out.println(decryptMsg);

    }
}
