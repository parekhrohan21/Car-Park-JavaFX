import  java.util.Scanner;
//this class is used to handle all the inputs for the application.
public class EasyScanner
{
    public static int nextInt()
    {
        Scanner keyboard = new Scanner(System.in);
        int i = keyboard.nextInt();
        return i;
    }

    public static double nextDouble()
    {
        Scanner keyboard = new Scanner(System.in);
        double d = keyboard.nextDouble();
        return d;
    }

    public static String nextString()
    {
        Scanner keyboard = new Scanner(System.in);
        String s = keyboard.nextLine();
        return s;
    }

    public static char nextChar()
    {
        Scanner keyboard = new Scanner(System.in);
        char c = keyboard.next().charAt(0);
        return c;
    }
}
