public class VariableExercise {

    // Global static variable - declared outside method inside class so all method can see

    static String name = "Raj";

    public static void printMyLastName(){
        String lastName = "Patel"; // local variable for printMyLastName() method
        System.out.println(lastName);
    }

    public static void printMyAge(){
        String myAge = "Thirty";
        System.out.println(myAge);

    }


    public static void main(String[] args){

        // Local variables of main method - no one else can access them outside main method

        int a = 10;

        System.out.println(name);
        System.out.println(a);
        printMyLastName();
        printMyAge();
    }
}
