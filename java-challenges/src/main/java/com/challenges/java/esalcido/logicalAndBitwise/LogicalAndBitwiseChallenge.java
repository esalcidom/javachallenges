package com.challenges.java.esalcido.logicalAndBitwise;

/**
 * LogicalAndBitwiseChallenge
 */
public class LogicalAndBitwiseChallenge {

    public static int run(){

        int spiderMan = 10;
        int venom = 5;
        int carnage = 50;

        //the only thing to remember about logical (&&, ||) and bitwise (&, |) operation is that bitwise will always execute even if the last condition was not meet.
        //For the incremental operations only remember that each condition will execute as one independent line so the after incremental operation (i++) will add the value in the moment the next condition starts.
        if (spiderMan == 11 & venom++ == 5) { venom++; }

        if (++carnage == 50 | spiderMan++ == 11 | spiderMan++ == 12 | spiderMan++ == 13 | spiderMan++ == 14) { venom++; }

        if (++spiderMan == 14 | spiderMan++ == 15 & venom++ == 6 & spiderMan == 13) { spiderMan++; }

        return spiderMan + venom + carnage;
        //check test
    }
}