package com.data;

/**
 * Created by ion on 7/16/15.
 */
public class rps {
    enum Hand {
        ROCK, PAPER, SCISSORS, INVALID
    }

    private static void getHand(int handVal){
        Hand hand;
        try {
            hand = Hand.values()[handVal - 1];
        }catch (ArrayIndexOutOfBoundsException ex){
            hand = Hand.INVALID;
        }
        switch (hand){
            case ROCK:
                System.out.println("RocK");
                break;
            case PAPER:
                System.out.println("Paper");
                break;
            case SCISSORS:
                System.out.println("Scissors");
                break;
            default:
                System.out.println("Invalid");
        }
    }
    private static void playHands(int yourHand, int myHand){
        // rock=1 paper=2 scissors=3
        // 1:1 2:2 3:3 => draw
        // 1:2 = 3 => paper
        // 1:3 = 4 => rock
        // 2:3 = 5 => scissors
        switch ((yourHand == myHand) ? 0 : (yourHand + myHand)){
            case 0:
                System.out.println("draw");
                break;
            case 3:
                System.out.println("paper beats rock");
                printWinner(yourHand, 2);
                break;
            case 4:
                System.out.println("rock beats scissors");
                printWinner(yourHand, 1);
                break;
            case 5:
                System.out.println("scissors beats paper");
                printWinner(yourHand, 3);
                break;
            default:
                System.out.println("you cheated");
                printWinner(yourHand, myHand);
        }
    }

    private static void printWinner(int yourHand, int winningHand){
        if(yourHand == winningHand){
            System.out.println("you win");
        }
        else {
            System.out.println("i win");
        }
    }
    
}
