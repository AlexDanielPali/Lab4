import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        ghicestenumarul();
    }


    public static void ghicestenumarul()
    {
        Scanner inputDevice=new Scanner(System.in);
        int gasit,i,k=0;
        int number= 1 + (int)(10 *Math.random());
        for(i=0;i<=number;i++)
        {
            System.out.println("Introduceti numarul ");
            gasit= inputDevice.nextInt();
            if(gasit==number)
            {
                System.out.println("Ati ghicit numarul");
                k++;
                break;
            }
            else if(gasit>number)
            {
                System.out.println("Numarul dvs este mai mare  ");
                k++;

            } else if(gasit < number)
                System.out.println("Numarul dvs este mai  mic");
            k++;
        }
        System.out.println("Numarul de incercari realizate " +k);
    }


}