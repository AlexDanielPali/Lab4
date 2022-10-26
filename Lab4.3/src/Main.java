import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        ghicestenumarul();
    }


    public static void ghicestenumarul()
    {
        Scanner inputDevice=new Scanner(System.in);
        int gasit,k,i;
        int number= 1 + (int)(100 *Math.random());
        System.out.println("Adaugati numarul de incercari pe care doriti sa le faceti ");
        k= inputDevice.nextInt();
        for(i=1;i<=k;i++)
        {
            System.out.println("Introduceti numarul ");
            gasit= inputDevice.nextInt();
            if(gasit==number)
            {
                System.out.println("Ati ghicit numarul");
                break;
            }
            else if(gasit>number)
            {
                System.out.println("Numarul dvs este mai mare  ");


            } else if(gasit < number)
                System.out.println("Numarul dvs este mai  mic");
            if (i == k) {
                System.out.println(
                        "Din pacate, nu ati putut ghici numarul. Jocul s-a terminat. Numarul corect era " + number);
            }

        }


    }}