package com.simple.problem;

import java.util.Scanner;

public class Pangrams {
    public static void main(String args[] ) throws Exception {
       Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input = input.replaceAll(" ","");
        System.out.println(checkPangram(input.toLowerCase()));
        
    }
    static String checkPangram(String str){
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        for(int i =0; i<26;i++){
            if(!str.contains(""+alpha.charAt(i))){
                return "not pangram";
            }
        }
        return "pangram";
    }
}

