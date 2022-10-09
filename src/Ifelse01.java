import java.util.Scanner;

public class Ifelse01


{

    public static void main(String[] args)
    {
        System.out.println( "Enter mark here;");
        Scanner scanner = new Scanner(System.in);

        int percentage = scanner.nextInt();

        if(percentage>=70)
        {
            System.out.printf("Dist ");
        }
        else if (percentage>=60)
        {
            System.out.printf("First Class");

        }
        else if (percentage>= 35)
        {
            System.out.println( "Pass");
        }

        else
        {
            System.out.println("Fail");
        }

    }
}
