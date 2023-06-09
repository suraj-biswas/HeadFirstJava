package chapter_2_trip_to_objectville;

import java.util.Random;

public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isRigth = false;
        boolean p2isRigth = false;
        boolean p3isRigth = false;

        int randomNumber = (int) (Math.random() * 10);

        System.out.println("I'm thinking of a number between 0 and 9...");

        while (true) {
            System.out.println("Number to guess is " + randomNumber);
            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.number;
            System.out.println("Player one guessed " + guessp1);
            guessp2 = p2.number;
            System.out.println("Player two guessed " + guessp2);
            guessp3 = p3.number;
            System.out.println("Player three guessed " + guessp3);

            if (guessp1 == randomNumber)
                p1isRigth = true;
            if (guessp2 == randomNumber)
                p2isRigth = true;
            if (guessp3 == randomNumber)
                p3isRigth = true;

            if (p1isRigth || p2isRigth || p3isRigth) {
                System.out.println("Hurray! We have a winner!");
                System.out.println("Player one got it right? " + p1isRigth);
                System.out.println("Player two got it right? " + p2isRigth);
                System.out.println("Player three got it right? " + p3isRigth);
                System.out.println("Game is over.");
                break;
            } else {
                System.out.println("Players will have to try again.");
            }
        }
    }
}
