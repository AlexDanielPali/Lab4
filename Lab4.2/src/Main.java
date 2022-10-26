import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        display();
    }
    public static void display()
    {
        int worker,production=4000;

        for(int i=1;i<=24;i++)
        {
            worker=(6*production)/100;
            production=worker+production;

            if(production>=7000)
            {
                System.out.print(" \n Productia a depasit 7000. Merita o marire  "+production );

                System.out.print(" \n In luna  "+i );

            }

        }



    }
}