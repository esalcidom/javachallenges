package com.challenges.java.esalcido.nterfaces;

import java.util.function.Function;

/**
 * InterfaceChallange
 */
public class InterfaceChallange {

    /**
     * Jedi
     */
    public interface Jedi {
    
        String MASTER = "YODA";

        //String.join concatenates all strings passed with a delimeter which is the first param and will be set between all concatenated string
        //ej. String.join("<", "1", "2", "3") = "1 < 2 < 3"
        default String attack() { return jump (jedi -> String.join(jedi, useSaber(), useForce()));} 

        //the jump method will return "LUCKE"
        private String jump(Function<String, String> function) {return function.apply("LUCKE");}

        private static String useSaber() { return "S";}

        //private methods on interfaces come in java 9 and this method is called because is private and
        //is the one detected and used in String.join method.
        //if the method is changed to public default then the overrided method is called
        private String useForce() { return "F";}
    }

    // public static void main( String[] args )
    // {
    //     System.out.print(new Jedi() {
    //         public String useForce() { return "X"; }}.attack() + Jedi.useSaber() + Jedi.MASTER);
    // }
}