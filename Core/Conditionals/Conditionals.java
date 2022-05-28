public class Conditionals {
    public static void main(String[] args)
    {
        int a = 5;
        int b = 7;

        if(a < b)
        {
            System.out.println("a is smaller");
        }
        else if(b < a)
        {
            System.out.println("b is smaller");
        }
        else {
            System.out.println("both are equal");
        }
    }
}