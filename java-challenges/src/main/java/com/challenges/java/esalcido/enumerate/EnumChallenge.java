package com.challenges.java.esalcido.enumerate;
/**
 * EnumChallenge
 */
public class EnumChallenge {

    public static void main( String[] args )
    {
        DragonBall dragonBall1 = DragonBall.FIFTH;
        DragonBall dragonBall2 = DragonBall.SECOND;

        //this array will contain the 7 dragon balls with no repetition
        DragonBall dragonBalls[] = DragonBall.FIRST.SECOND.THIRD.FOURTH.SIXTH.invokeShenLong();

        for (DragonBall db : dragonBalls){
            if (dragonBall1.equals(db))
                break;
            dragonBall2 = dragonBall1;
        }
        System.out.println((dragonBall2 == dragonBall1) ? "Same dragon ball" : "new Dragonball");
        System.out.println(dragonBall2);
    }

    //this enum is valid !!
    enum DragonBall implements Invoker {
        FIRST, SECOND, THIRD, FOURTH, FIFTH, SIXTH, SEVENTH;

        @Override
        public DragonBall[] invokeShenLong() {
            // TODO Auto-generated method stub
            return DragonBall.values();
        }

    }

    /**
     * Invoker
     */
    //this invoker is valid
    public interface Invoker {
    
        DragonBall[] invokeShenLong();
    }
}