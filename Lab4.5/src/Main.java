import java.util.*;
class QuizScoreStatistics{
    public static void main(String[] args)  {
        Scanner input=new Scanner(System.in);
        int num, count =0, sum = 0, max = Integer.MIN_VALUE; int min = Integer.MAX_VALUE;
        float avg ;
        do{
            System.out.print("Calificativ: ");
            num =input.nextInt();
            if (num < 0 || num >10){
                System.out.println("Calificativ invalid");

            }
            else{
                count++;
                sum+=num;
                if(num > max){
                    max = num;

                }
                if(num < min){
                    min = num;

                }

            }

        }

        while(num != 99);
        avg= sum/count;
        System.out.println("Cel mai mare scor este: " +max);
        System.out.println("Cel mai mic scor este: "+min);
        System.out.println("Media scorurilor este: "+avg);

    }

}