package com.challenges.java.esalcido.optional;

import java.util.Optional;
import java.util.stream.Collectors;
/**
 * OptionalChallenge
 */
public class OptionalChallenge {

    static String finalZionValue = "";
    static int matrixCount = 0;

    public static void run() {
        Optional<String> optFromMatrix = Optional.ofNullable(finalZionValue);
        var agentSmith = "Virus";

        //ofNullable returns Optional object with value is not null. If null then return empty Optional
        //orElse return the value if present if not then return value in arg
        finalZionValue += Optional.ofNullable(agentSmith).orElse(getVisionFromOracle());
        //output Virus. Note: The getVisionFromOracle method is called so the method orElse can use the returned value
        finalZionValue += optFromMatrix.orElseGet(OptionalChallenge::getVisionFromOracle);
        //output "Virus" + "" = "Virus"
        finalZionValue += matrixCount;
        //output "Virus1"
        String neo = null;

        try{
            //orElseThrow throw the exception in args if null value of Option
            Optional.ofNullable(neo).orElseThrow(IllegalArgumentException::new);
        }
        catch(Exception e){
            //or() returns value of object and if null then return the value created in Supplier args
            finalZionValue += Optional.ofNullable(neo).or(() -> Optional.of("theOne")).get();
            //output Virus1theOne
        }

        finalZionValue += Optional.of("trinity").stream().map(String::toUpperCase).filter(trinity -> trinity.equals("TRINITY")).collect(Collectors.joining());
        //output Virus1theOneTRINITY
        System.out.println(finalZionValue);

    }

    static String getVisionFromOracle(){
        matrixCount++;
        finalZionValue = "KeyMaker";
        return "Architect";
    }
}