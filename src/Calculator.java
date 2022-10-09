public class Calculator
{
    static int a = 80;
    static int b = 20;

    public static void add()
    {
        System.out.println("Addition="+(a+b));
    }

    public static void substract()
    {
        System.out.println("Substraction=" + (a-b));
    }
    public static void multiplication()
    {
      System.out.println("Multiplication="+ (a*b));
    }

    public static void division()
    {
        System.out.println("Division="+ (a/b));
    }
    public static void main(String args [])
    {

    add();
    add();
    substract();
    multiplication();
    division();
    }}
