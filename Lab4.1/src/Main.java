import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        display1();

    }

    public static void display1()
    {
        int a,b,c,d,e;
        System.out.print("Introduceti punctele obtinute de Art");
        Scanner inputDevice = new Scanner(System.in);
        a= inputDevice.nextInt();
        System.out.print("Introduceti punctele obtinute de Bob");
        b=inputDevice.nextInt();
        System.out.print("Introduceti punctele obtinute de Cal");
        c=inputDevice.nextInt();
        System.out.print("Introduceti punctele obtinute de Dan");
        d=inputDevice.nextInt();
        System.out.print("Introduceti punctele obtinute de Eli");
        e=inputDevice.nextInt();
        stele(a);
        stele2(b);
        stele3(c);
        stele4(d);
        stele5(e);


    }
    public static void stele(int a2)
    {
        System.out.print("Punctele jocului  \n ");
        System.out.print("Art");
        for(int i=0;i<=a2;i++)
        {
            System.out.print("*");
        }
    }

    public static void stele2(int a2)
    {
        System.out.print(" \n Bob");
        for(int i=0;i<=a2;i++)
        {
            System.out.print("*");
        }
    }
    public static void stele3(int a2)
    {
        System.out.print("\n Cal");
        for(int i=0;i<=a2;i++)
        {
            System.out.print("*");
        }}
    public static void stele4(int a2)
    {
        System.out.print("\nDan");
        for(int i=0;i<=a2;i++)
        {
            System.out.print("*");
        }
    }
    public static void stele5(int a2)
    {
        System.out.print("\n Eli");
        for(int i=0;i<=a2;i++)
        {
            System.out.print("*");
        }
    }

}