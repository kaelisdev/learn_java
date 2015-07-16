package com.data;

import java.util.Scanner;

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
                System.out.println("камень");
                break;
            case PAPER:
                System.out.println("бумага");
                break;
            case SCISSORS:
                System.out.println("ножницы");
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
                System.out.println("ничья");
                break;
            case 3:
                System.out.println("бумага накрывает камень");
                printWinner(yourHand, 2);
                break;
            case 4:
                System.out.println("камень ломает ножницы");
                printWinner(yourHand, 1);
                break;
            case 5:
                System.out.println("ножницы разрезают бумагу");
                printWinner(yourHand, 3);
                break;
            default:
                System.out.println("you cheated");
                printWinner(yourHand, myHand);
        }
    }

    private static void printWinner(int yourHand, int winningHand){
        if(yourHand == winningHand){
            System.out.println("Вы победили");
        }
        else {
            System.out.println("Вы проиграли");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Камень, Камень, бумага");
        System.out.println("  введите 1 (Камень)");
        System.out.println("  введите 2 (бумага)");
        System.out.println("  введите 3 (Камень)");
        System.out.print("> ");

        int playerHand = input.hasNextInt() ? input.nextInt() : -99;
        int computerHand = (int)(3*Math.random()) + 1;

        System.out.print("у вас: (" + playerHand + ") ");
        getHand(playerHand);
        System.out.print("у меня: (" + computerHand + ") ");
        getHand(computerHand);
        playHands(playerHand,computerHand);
    }
}
