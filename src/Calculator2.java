import java.util.concurrent.Callable;

public class Calculator2
{


    public static void add (int a, int b)
    {
        System.out.println("Addition of "+ a +" & " +b+ " = " + (a+b));

    }

    public void sub(int a, int b)
    {

        System.out.println("Sub of "+ a +" & " +b+ " = " + (a-b));


    }

    public static void main(String[] args)
    {
        Calculator2 calculator2 = new Calculator2();

        add(10,20);
        add(20,30);
        calculator2.sub(20, 30);
        calculator2.sub(30,40);
    }

}


