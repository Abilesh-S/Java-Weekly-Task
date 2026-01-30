package com.kovanlabs.intern.week.task.regexDay5;

public class Enigma {

    private char[] encrypt(String s , int key ){
        char[] encryptMsg = new char[s.length()];
        for(int i = 0; i < s.length(); i++){
            encryptMsg[i] = (char) (s.charAt(i) ^ key);
        }
        return encryptMsg;
    }

    private StringBuffer decrypt(char[] msg , int key ){
        StringBuffer decryptMsg = new StringBuffer();
        for(int i = 0; i < msg.length; i++){
            char temp = (char)(msg[i] ^ key);
            decryptMsg = decryptMsg.append(temp);
        }
        return decryptMsg;
    }

    public static void main(String[] args) {
        String s = "DUDE";
        Enigma e = new Enigma();
        int key = 7;
        char[] encryptMsg = e.encrypt(s , key);
        System.out.println(encryptMsg);
        StringBuffer decryptMsg = e.decrypt(encryptMsg , key);
        System.out.println(decryptMsg);

    }
}
