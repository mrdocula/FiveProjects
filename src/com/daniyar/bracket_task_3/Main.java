package com.daniyar.bracket_task_3;

public class Main {

    public static void main(String[] args) {

        BracketController bracket1 = new BracketController() ;
        String str1 = "{([)}]";
        boolean res1 = bracket1.isBracketSequenceValid(str1);
        System.out.println("Bracket sequence valid is: " + res1);

        BracketController bracket2 = new BracketController() ;
        String str2 = "{([])}";
        boolean res2 = bracket2.isBracketSequenceValid(str2);
        System.out.println("Bracket sequence valid is: " + res2);

    }
}
