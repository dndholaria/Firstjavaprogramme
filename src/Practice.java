public class Practice
{

    static int total;
    static double percentage;


    public static void StudentMarksheet(String name, int Maths, int Science, int English) {
        total = Maths + Science + English;
        percentage = total / 3;

        System.out.println(name + ",Total Marks =" + total + ",Perc =" + percentage);
    }



    public static void main(String[] args)
    {

        StudentMarksheet("Raj", 60, 60, 60);

        if(percentage>70)
        {
        System.out.printf(" Distrinction");
        }
        else if ((percentage < 70) && (percentage >60))
        {
            System.out.printf(" First Class");

        } else
        {
            System.out.println("Fail");
        }


        {

        }
}}
