public class StudentMarksheet {
    static int total;
    static double percentage;


    public static void StudentMarksheet(String name, int Maths, int Science, int English) {
        total = Maths + Science + English;
        percentage = total / 3;

        System.out.println(name + ",Total Marks =" + total + ",Perc =" + percentage);
    }


    public static void main(String[] args) {
        StudentMarksheet("Raj", 10, 20, 30);
        StudentMarksheet("Vijay", 20, 20, 30);
        StudentMarksheet("Samir", 60, 20, 30);


    }
}

