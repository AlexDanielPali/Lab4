import java.util.Scanner;

import static java.lang.System.*;

class Quiz {
    public static void main(String[] args) {
        int corect=0;
        int gresit=0;
        int question1;
        int question2;
        int question3;
        int question4;
        int question5;
        Scanner scan = new Scanner(System.in);
        System.out.println("Care este capitala Romaniei:");
        System.out.println("1. Bucuresti. \n 2. Constanta .  \n3. Berlin. \n 4. Copenhaga");
        question1 = scan.nextInt();
        if (question1 != 1) {
            System.out.println("Gresit.");
            gresit++;
        }

        {
            while (question1 == 1) {
                System.out.println("Felicitari!Raspuns corect!");

                question1++;
                corect++;
            }
            System.out.println();
        }


        System.out.println("Ce fluviu mare din Europa parcurge Romania?");
        System.out.println("1. Elba \n 2. Dunarea.  \n 3. Volga  \n4. Tamisa ");
        question2 = scan.nextInt();


        if (question2 != 2) {
            System.out.println("Gresit.");
            gresit++;
        }

        {
            while (question2 == 2) {
                System.out.println("Felicitari!Raspuns corect! ");
                question2++;
                corect++;
            }
            System.out.println();
        }
        System.out.println("Cine canta 'Heal the world':");
        System.out.println("1 R. City & Adam Levine's. \n2. Michael Jackson.  \n3. Selena Gomez. \n4. Katy Perry.");
        question3 = scan.nextInt();


        if (question3 != 2) {
            System.out.println("Gresit.");
            gresit++;
        }

        {
            while (question3 == 2) {
                System.out.println("Raspunsul este corect");
                question3++;
                corect++;
            }
            System.out.println();
        }

        System.out.println("Cine canta 'Roar':");

        System.out.println(" 1.R. City & Adam Levine's. \n2. Justin Bieber.  \n3. Selena Gomez. \n4.Katy Perry.");
        question4 = scan.nextInt();


        if (question4 != 4) {

            System.out.println("Gresit.");
            gresit++;
        }

        {
            while (question4 == 4) {
                System.out.println("Felicitari!Raspuns corect!");
                question4++;
                corect++;
            }
            System.out.println();
        }
        System.out.println("Care este jocul preferat al lui Ronaldo ");

        System.out.println("\n 1.Baschet \n 2.Fotbal \n  3.Handball   \n 4.Inot");
        question5 = scan.nextInt();
        if (question5 != 2) {
            System.out.println("Gresit");
            gresit++;
        }
        {
            while (question5 == 3) {
                System.out.println("Felicitari!E corect1");
                question5++;
                corect++;
            }
            System.out.println();
        }
        System.out.println("Numar raspunsuri corecte = "+ corect+ "\n si Numar raspunsuri gresite = "+ gresit);
    }}